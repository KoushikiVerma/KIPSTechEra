package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AndroidSqliteActivity extends AppCompatActivity {
    private TextView noteTextView1;
    private TextView noteTextView2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_sqlite);

        noteTextView1 = findViewById(R.id.AndySQLite);
        noteTextView2 = findViewById(R.id.AndyCRUD);
        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center'><u>SQLite Database</u></h1>" +
                "<h2><u>Introduction to SQLite Database:</U></h2>"+
                "<p>Android SQLite is a very lightweight database which comes with Android OS. Android SQLite combines a clean SQL interface with a very small memory footprint and decent speed. For Android, SQLite is “baked into” the Android runtime, so every Android application can create its own SQLite databases. Android SQLite native API is not JDBC, as JDBC might be too much overhead for a memory-limited smartphone. Once a database is created successfully its located in data/data//databases/ accessible from Android Device Monitor. SQLite is a typical relational database, containing tables (which consists of rows and columns), indexes etc. We can create our own tables to hold the data accordingly. This structure is referred to as a schema.\n</p>"+
                "<p>SQLite is a opensource SQL database that stores data to a text file on a device. Android comes in with built in SQLite database implementation.\n" +
                "SQLite supports all the relational database features. In order to access this database, you don't need to establish any kind of connections for it like JDBC,ODBC e.t.c.The package android.database.sqlite contains all the required APIs to use an SQLite database in our android applications.\n " +
                "SQLiteOpenHelper class provides the functionality to use the SQLite database.\n</p>"+
                "<h3>SQLiteOpenHelper class:</h3>"+
                "<p>The android.database.sqlite.SQLiteOpenHelper class is used for database creation and version management. For performing any database operation, you have to provide the implementation of onCreate() and onUpgrade() methods of SQLiteOpenHelper class.\n</p>"+
                "<h4>Constructors of SQLiteOpenHelper class-</h4>"+
                "<ol>" +
                "<lI><b>SQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version):</b>creates an object for creating, opening and managing the database.\n</li>" +
                "<lI><b>SQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler):</b>creates an object for creating, opening and managing the database. It specifies the error handler.\n</li>" +
                "</ol>"+
                "<h4>Methods of SQLiteOpenHelper class-</h4>"+
                "<ol>" +
                "<lI><b>public abstract void onCreate(SQLiteDatabase db):</b>called only once when database is created for the first time.\n</li>"+
                "<lI><b>public abstract void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion):</b>called when database needs to be upgraded.\n</li>"+
                "<lI><b>public synchronized void close():</b>closes the database object.\n</li>"+
                "<lI><b>public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion):</b>called when database needs to be downgraded.\n</li>"+
                "<lI><b></b></li>"+
                "</ol>"+
                "<h3>SQLiteDatabase class:</h3>"+
                "<p>It contains methods to be performed on sqlite database such as create, update, delete, select etc.\n</p>"+
                "<h4>Methods of SQLiteDatabase class-</h4>"+
                "<ol>" +
                "<lI><b>void execSQL(String sql):</b>executes the sql query not select query.\n</li>"+
                "<lI><b>long insert(String table, String nullColumnHack, ContentValues values):</b>inserts a record on the database. The table specifies the table name, nullColumnHack doesn't allow completely null values. If second argument is null, android will store null values if values are empty. The third argument specifies the values to be stored.\n</li>"+
                "<lI><b>int update(String table, ContentValues values, String whereClause, String[] whereArgs):</b>updates a row.\n</li>"+
                "<lI><b>Cursor query(String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy):</b>returns a cursor over the resultset.\n</li>"+
                "</ol>"+
                "</body></html>";


        String htmlNotes2 = "<html><body>" +
                "<h2><U>SQLite CRUD Operations:</U></h2>"+
                "<ul type='1'>" +
                "<LI><b>Inserting Data:</b>To insert data into the SQLite Database, we will create a method in the DatabaseHelper class. Add the following method to the DatabaseHelper class:\n" +
                "<p>java\n" +
                "public long insertData(String name) {\n" +
                "    SQLiteDatabase db = this.getWritableDatabase();\n" +
                "    ContentValues values = new ContentValues();\n" +
                "    values.put(\"name\", name);\n" +
                "    long id = db.insert(\"mytable\", null, values);\n" +
                "    db.close();\n" +
                "    return id;\n" +
                "}</p> </li>" +
                "<LI><b>Reading Data:</b> To read data from the SQLite Database, create a method in the DatabaseHelper class. Add the following method:\n" +
                "<p>java\n" +
                "public List<String> getAllData() {\n" +
                "    List<String> data = new ArrayList<>();\n" +
                "    SQLiteDatabase db = this.getReadableDatabase();\n" +
                "    Cursor cursor = db.rawQuery(\"SELECT * FROM mytable\", null);\n" +
                "    if (cursor.moveToFirst()) {\n" +
                "        do {\n" +
                "            String name = cursor.getString(cursor.getColumnIndex(\"name\"));\n" +
                "            data.add(name);\n" +
                "        } while (cursor.moveToNext());\n" +
                "    }\n" +
                "    cursor.close();\n" +
                "    db.close();\n" +
                "    return data;\n" +
                "}</p></li>" +
                "<LI><b>Updating  Data:</b>To update data in the SQLite Database, create a method in the DatabaseHelper class. Add the following method:\n" +
                "<p>java\n" +
                "public int updateData(long id, String newName) {\n" +
                "    SQLiteDatabase db = this.getWritableDatabase();\n" +
                "    ContentValues values = new ContentValues();\n" +
                "    values.put(\"name\", newName);\n" +
                "    int rowsAffected = db.update(\"mytable\", values, \"id=?\", new String[]{String.valueOf(id)});\n" +
                "    db.close();\n" +
                "    return rowsAffected;\n" +
                "}</p> </li>" +
                "<LI><b>Deleting Data:</b>To delete data from the SQLite Database, create a method in the DatabaseHelper class. Add the following method:\n" +
                "<p>java\n" +
                "public int deleteData(long id) {\n" +
                "    SQLiteDatabase db = this.getWritableDatabase();\n" +
                "    int rowsDeleted = db.delete(\"mytable\", \"id=?\", new String[]{String.valueOf(id)});\n" +
                "    db.close();\n" +
                "    return rowsDeleted;\n" +
                "}</p> </li>" +
                "<li><b>Closing the Database:</b>It is important to close the database connection after performing CRUD operations. Open connections can lead to memory leaks and other issues. Call the close() method on the SQLiteDatabase instance after performing the necessary database operations.\n" +
                "</li>"+
                "</ol>"+
                "</body></html>";

        noteTextView1.setText(Html.fromHtml(htmlNotes1));
        noteTextView2.setText(Html.fromHtml(htmlNotes2));

    }
}
