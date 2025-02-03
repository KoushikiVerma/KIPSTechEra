package com.example.kipstechera;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "KIPSDB.db";
    private static final int DATABASE_VERSION = 1;

    // Table names
    private static final String TABLE_USERS = "users";
    private static final String TABLE_ADMINS = "admins";

    // Common column names
    private static final String KEY_ID = "id";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // creating required tables
        String CREATE_TABLE_USERS = "CREATE TABLE " + TABLE_USERS + "("
                + KEY_ID + " INTEGER PRIMARY KEY,"
                + KEY_USERNAME + " TEXT UNIQUE,"
                + KEY_PASSWORD + " TEXT"
                + ")";
        db.execSQL(CREATE_TABLE_USERS);

        String CREATE_TABLE_ADMINS = "CREATE TABLE " + TABLE_ADMINS + "("
                + KEY_ID + " INTEGER PRIMARY KEY,"
                + KEY_USERNAME + " TEXT UNIQUE,"
                + KEY_PASSWORD + " TEXT"
                + ")";
        db.execSQL(CREATE_TABLE_ADMINS);

        // Insert default admin
        addDefaultAdmin(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ADMINS);

        // create new tables
        onCreate(db);
    }

    private void addDefaultAdmin(SQLiteDatabase db) {
        ContentValues values = new ContentValues();
        values.put(KEY_USERNAME, "koushiki");
        values.put(KEY_PASSWORD, "1904");
        db.insert(TABLE_ADMINS, null, values);
    }

    // User registration
    public long registerUser(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_USERNAME, username);
        values.put(KEY_PASSWORD, password);
        long id = db.insert(TABLE_USERS, null, values);
        db.close();
        return id;
    }

    // User login
    public boolean loginUser(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_USERS, new String[]{KEY_ID},
                KEY_USERNAME + "=? AND " + KEY_PASSWORD + "=?",
                new String[]{username, password}, null, null, null);
        boolean result = cursor != null && cursor.moveToFirst();
        if (cursor != null)
            cursor.close();
        db.close();
        return result;
    }

    // Admin login
    public boolean loginAdmin(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_ADMINS, new String[]{KEY_ID},
                KEY_USERNAME + "=? AND " + KEY_PASSWORD + "=?",
                new String[]{username, password}, null, null, null);
        boolean result = cursor != null && cursor.moveToFirst();
        if (cursor != null)
            cursor.close();
        db.close();
        return result;
    }

    // Admin registration
    public long registerAdmin(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_USERNAME, username);
        values.put(KEY_PASSWORD, password);
        long id = db.insert(TABLE_ADMINS, null, values);
        db.close();
        return id;
    }

    @SuppressLint("Range")
    public User getUserByUsername(String username) {
        SQLiteDatabase db = this.getReadableDatabase();
        User user = null;
        Cursor cursor = null;
        try {
            cursor = db.query(TABLE_USERS, new String[]{KEY_ID, KEY_USERNAME, KEY_PASSWORD},
                    KEY_USERNAME + "=?", new String[]{username}, null, null, null);
            if (cursor != null && cursor.moveToFirst()) {
                user = new User();
                user.setId(cursor.getInt(cursor.getColumnIndex(KEY_ID)));
                user.setUsername(cursor.getString(cursor.getColumnIndex(KEY_USERNAME)));
                user.setPassword(cursor.getString(cursor.getColumnIndex(KEY_PASSWORD)));
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            db.close();
        }
        return user;
    }

    // Method to check if user is registered by username
    public boolean isUserRegistered(String username) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_USERS, new String[]{KEY_ID},
                KEY_USERNAME + "=?", new String[]{username}, null, null, null);
        boolean result = cursor != null && cursor.moveToFirst();
        if (cursor != null)

            cursor.close();
        db.close();
        return result;
    }


    public ArrayList<String> getAllUsers() {
        ArrayList<String> userList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_USERS, null);

        // Loop through all rows and add users to the list
        if (cursor.moveToFirst()) {
            do {
                @SuppressLint("Range") String userId = cursor.getString(cursor.getColumnIndex(KEY_ID));
                @SuppressLint("Range") String username = cursor.getString(cursor.getColumnIndex(KEY_USERNAME));
                userList.add("ID: " + userId + ", Username: " + username);
            } while (cursor.moveToNext());
        }

        // Close cursor and database
        cursor.close();
        db.close();

        return userList;
    }


    public boolean deleteUser(String username) {
        SQLiteDatabase db = this.getWritableDatabase();
        long result = db.delete(TABLE_USERS, "username = ?", new String[]{username});
        return result != -1;
    }

}

