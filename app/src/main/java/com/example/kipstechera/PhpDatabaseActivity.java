package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PhpDatabaseActivity extends AppCompatActivity {
    private TextView noteTextView1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php_database);
        noteTextView1 = findViewById(R.id.PhpDB);
        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center'><u>PHP DataBase</u></h1>" +
                "<p>PHP will work with virtually all database software, including Oracle and Sybase but most commonly used is freely available MySQL database.</p>"+
                "<h2><u>Connecting to MySQL database</u></h2>"+
                "<h4>Opening Connection</h4>"+
                "<p>We can open/establish connection to MySQL database using the PHP mysqli() constructor or, mysqli_connect() function. This function takes six parameters and returns a MySQL link identifier on success or FALSE on failure.\n" +
                "\n" +
                "Syntax:-\n" +
                "Following is the syntax to open a MySQL connection using the constructor mysqli() −\n" +
                "\n" +
                "$mysqli = new mysqli($host, $username, $passwd, $dbName, $port, $socket);</p>"+
                "<h4>Closing the Connection</h4>"+
                "<p>We can disconnect from the MySQL database anytime using another PHP function close(). Following is the syntax −\n" +
                "\n" +
                "$mysqli->close();</p>"+
                "<h2><u>Create MySQL Database Using PHP</u></h2>"+
                "<h4>Creating Database</h4>"+
                "<p>To create and delete a database you should have admin privilege. Its very easy to create a new MySQL database. PHP uses mysql_query function to create a MySQL database. This function takes two parameters and returns TRUE on success or FALSE on failure.\n" +
                "\n" +
                "Syntax\n" +
                "bool mysql_query( sql, connection );</p>"+
                "<h4>Selecting Database</h4>"+
                "<p>Once you establish a connection with a database server then it is required to select a particular database where your all the tables are associated.\n" +
                "\n" +
                "This is required because there may be multiple databases residing on a single server and you can do work with a single database at a time.\n" +
                "\n" +
                "PHP provides function mysql_select_db to select a database.It returns TRUE on success or FALSE on failure.\n" +
                "\n" +
                "Syntax\n" +
                "bool mysql_select_db( db_name, connection );</p>"+
                "<h4>Creating Database Tables</h4>"+
                "<p>To create tables in the new database you need to do the same thing as creating the database. First create the SQL query to create the tables then execute the query using mysql_query() function." +
                "Example:\n" +
                "CREATE TABLE employee(\n" +
                "   emp_id INT NOT NULL AUTO_INCREMENT,\n" +
                "   emp_name VARCHAR(20) NOT NULL,\n" +
                "   emp_address  VARCHAR(20) NOT NULL,\n" +
                "   emp_salary   INT NOT NULL,\n" +
                "   join_date    timestamp(14) NOT NULL,\n" +
                "   primary key ( emp_id ));</p>"+
                "<h2><u>Delete MySQL Database Using PHP</u></h2>"+
                "<h4>Deleting a Database</h4>"+
                "<p>If a database is no longer required then it can be deleted forever. You can use pass an SQL command to mysql_query to delete a database." +
                "<u>Syntax:<u>'DROP DATABASE databasename'</p>"+
                "<h4>Deleting a Table</h4>"+
                "<p>Its again a matter of issuing one SQL command through mysql_query function to delete any database table. But be very careful while using this command because by doing so you can delete some important information you have in your table." +
                "<u>Syntax:<u>'DROP DATABASE databasename'</p>"+
                "<h2><u>Insert Data To MySQL Database</u></h2>"+
                "<p>You can add new rows to an existing table of MySQL using the INSERT statement. In this, you need to specify the name of the table, column names, and values (in the same order as column names).\n" +
                "\n" +
                "Syntax\n" +
                "Following is the syntax of the INSERT statement of MySQL.\n" +
                "\n" +
                "INSERT INTO table_name (column1, column2, column3,...columnN)\n" +
                "VALUES (value1, value2, value3,...valueN);\n" +
                "Where, table_name is the name of the table into which you need to insert data, (column1, column2, column3,...columnN) are the names of the columns and (value1, value2, value3,...valueN) are the values in the record.</p>"+

        "</body></html>";

        noteTextView1.setText(Html.fromHtml(htmlNotes1));

    }
}


