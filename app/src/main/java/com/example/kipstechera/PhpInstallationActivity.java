package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PhpInstallationActivity extends AppCompatActivity {
    private TextView noteTextView1;
    private TextView noteTextView2;
    private TextView noteTextView3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php_install);
        noteTextView1 = findViewById(R.id.PhpRequireHW);
        noteTextView2 = findViewById(R.id.PhpRequireSW);
        noteTextView3 = findViewById(R.id.PhpInstall);
        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center'><u>PHP Installation</u></h1>" +
                "<h2><U>Hardware Requirements:</U></h2>"+
                "<p> </p>"+
                "<ol>" +
                "<lI>Minimum 512MB of RAM (1GB recommended)</li>" +
                "<lI>Minimum 500MB of disk space</li>" +
                "<lI>Processor speed of at least 1GHz</li>" +
                "</ol>"+
                "</body></html>";


        String htmlNotes2 = "<html><body>" +
                "<h2><U>Software Requirements:</U></h2>"+
                "<ol>"+
                "<lI><b>Operating system:</b> PHP is compatible with Windows, macOS, and Linux operating systems</li>" +
                "<lI><b>Web server:</b> PHP can be installed with popular web servers like Apache, Nginx, or IIS</li>" +
                "<lI><b>Database:</b> PHP can work with various databases like MySQL, PostgreSQL, SQLite, etc.</li>" +
                "<lI><b>PHP version:</b> Choose the latest stable version of PHP for better performance and security</li>" +
                "</ol>"+
                "</body></html>";
        String htmlNotes3 = "<html><body>" +
                "<h2><U>Installation Process:</U></h2>"+
                "<p>To install PHP, we will suggest you to install AMP (Apache, MySQL, PHP) software stack. It is available for all operating systems. There are many AMP options available in the market that are given below:\n" +
                "\nWAMP for Windows\n" +
                "LAMP for Linux\n" +
                "MAMP for Mac\n" +
                "SAMP for Solaris\n" +
                "FAMP for FreeBSD\n" +
                "XAMPP (Cross, Apache, MySQL, PHP, Perl) for Cross Platform: It includes some other components too such as FileZilla, OpenSSL, Webalizer, Mercury Mail, etc.\n</p>"+
                "<p>Here are some steps to install PHP:</p>"+
                "<ul type='1'>" +
                "<lI>Go to https://www.php.net/downloads and click Downloads</li>" +
                "<lI>Click Windows Downloads</li>" +
                "<lI>Choose Thread safe version</li>" +
                "<lI>Click zip and Download it</li>" +
                "<lI>Extract the files</li>" +
                "<lI>Create a new php folder in the root of your *C:\\* drive</li>" +
                "<lI>Configure php.ini</li>" +
                "<lI>Add C:\\php to the PATH environment variable</li>" +
                "<lI>Configure PHP as an Apache module</li>" +
                "<lI>Test a PHP file </li>" +
                "</ul>" +
                "</body></html>";

        noteTextView1.setText(Html.fromHtml(htmlNotes1));
        noteTextView2.setText(Html.fromHtml(htmlNotes2));
        noteTextView3.setText(Html.fromHtml(htmlNotes3));

    }
}


