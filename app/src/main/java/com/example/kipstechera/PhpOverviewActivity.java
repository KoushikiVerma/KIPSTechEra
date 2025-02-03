package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PhpOverviewActivity extends AppCompatActivity {
    private TextView noteTextView1;
    private TextView noteTextView2;
    private TextView noteTextView3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php_overview);
        noteTextView1 = findViewById(R.id.PhpIntro);
        noteTextView2 = findViewById(R.id.PhpFeatures);
        noteTextView3 = findViewById(R.id.PhpHistory);
        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center' color='blue'><u>Introduction to Php</u></h1>" +
                "<p>PHP (Hypertext Preprocessor) is a server-side scripting language that is widely used for web development. It is a powerful tool for creating dynamic and interactive websites. PHP can be embedded into HTML code, making it easy to generate dynamic content on web pages.\n" +
                "\n" +
                "PHP is an open-source language, which means it is free to use and is constantly being improved by a community of developers. It is supported by most web hosting providers and is compatible with various operating systems, including Windows, Linux, and macOS." +
                "PHP can output HTML, images, PDF files, XHTML, and XML. It runs on various platforms, including Windows, Linux, Unix, and Mac OS X. PHP is compatible with almost all servers used today, including Apache and IIS.</p>"+
                "</body></html>";


        String htmlNotes2 = "<html><body>" +
                "<h1 align='center'>Features of Php</h1>" +
                "<ol>"+
                "<lI><b>Performance:</b>PHP script is executed much faster than those scripts which are written in other languages such as JSP and ASP. PHP uses its own memory, so the server workload and loading time is automatically reduced, which results in faster processing speed and better performance.</li>" +
                "<lI><b>Open Source:</b>PHP source code and software are freely available on the web. You can develop all the versions of PHP according to your requirement without paying any cost. All its components are free to download and use.</li>" +
                "<lI><b>Familiarity with syntax:</b>PHP has easily understandable syntax. Programmers are comfortable coding with it.</li>" +
                "<lI><b>Embedded: </b>PHP code can be easily embedded within HTML tags and script.</li>" +
                "<lI><b>Platform Independent:</b>PHP is available for WINDOWS, MAC, LINUX & UNIX operating system. A PHP application developed in one OS can be easily executed in other OS also.</li>" +
                "<lI><b>Database Support:</b>PHP supports all the leading databases such as MySQL, SQLite, ODBC, etc.</li>" +
                "<lI><b>Error Reporting:</b>PHP has predefined error reporting constants to generate an error notice or warning at runtime. E.g., E_ERROR, E_WARNING, E_STRICT, E_PARSE.</li>" +
                "<lI><b>Loosely Typed Language:</b>PHP allows us to use a variable without declaring its datatype. It will be taken automatically at the time of execution based on the type of data it contains on its value.</li>" +
                "<lI><b>Web servers Support:</b>PHP is compatible with almost all local servers used today like Apache, Netscape, Microsoft IIS, etc.</li>" +
                "<lI><b>Security:</b>PHP is a secure language to develop the website. It consists of multiple layers of security to prevent threads and malicious attacks.</li>" +
                "<lI><b>Control:</b>Different programming languages require long script or code, whereas PHP can do the same work in a few lines of code. It has maximum control over the websites like you can make changes easily whenever you want.</li>" +
                "<lI><b>A Helpful PHP Community:</b>It has a large community of developers who regularly updates documentation, tutorials, online help, and FAQs. Learning PHP from the communities is one of the significant benefits.</li>" +
                "</ol>"+
                "</body></html>";
        String htmlNotes3 = "<html><body>" +
                "<h1 align='center'>History and Version of Php</h1>"+
                "<ol>"+
                "<lI><b>The Origin:</b>Rasmus Lerdorf started developing PHP in 1994. A lot of CGI programs were written by him which were used for maintenance of his personal website. He modified these programs to make them work with web forms and to interact with databases. The implementation of this modification was termed as “Personal Home Page/Forms Interpreter” (PHP/FI). The first version of PHP/FI was made available to the world by Lerdorf in June 1995 for Bug Reporting and Code Improvement. Features like Form Handling, Variables similar to Perl and HTML embedding were present in this first version.</li>" +
                "<lI><b>PHP 2:</b>After the first version of PHP/FI, a development team formed which worked for months to finally release official version 2 of PHP/FI in late 1997 after a lot of beta testing. As PHP was developed organically, there was a lot of inconsistency in function names and parameter order. While in early versions of PHP, functions were named to enhance the distribution of hash values, in later versions function names were selected to match lower-level libraries that were being wrapped by PHP.</li>" +
                "<lI><b>PHP 3:</b>The parser was rewritten in 1997 by Zeev Suraski and Andi Gutmans which led to the formation of PHP 3 base. After changing its name to PHP which meant Hypertext Preprocessor, its public testing was started. PHP 3 was officially launched in June 1998. A fresh rewriting of the PHP core was again started by Zeev and Andi. In 1999, they produced the Zend Engine and also established Zend Technologies in Israel.</li>" +
                "<lI><b>PHP 4:</b>Zend Engine 1.0 powered PHP 4 was released in May 2000. PHP 4 reached its version 4.4.9 in August 2008.</li>" +
                "<lI><b>PHP 5:</b>Powered by Zend Engine 2, PHP 5 was launched in July 2004. It had features like PDO Extension, improved support for OOPS and many other performance improvements. PHP was able to become the only stable version by 2008. A consortium of PHP developers started the GoPHP5 initiative which promoted the transition from PHP 4 to PHP 5. As a result of this, many open-source projects stopped the PHP 4 support in their new code.</li>" +
                "<lI><b>PHP 6 (Never Released):</b>Due to the lack of support for native Unicode, PHP received mixed reviews. A project was initiated in 2005 to introduce native Unicode support through PHP. This project was headed by Andrei Zmievski. As it would require major changes, it was decided to launch this update as a new version naming it PHP 6.0. But the shortage of developers who understood the necessary changes resulted in the delay of the project. Considering this delay, PHP 5.3 was released in 2009 which included many features from the PHP 6 project. The project development was stopped in March 2010.</li>" +
                "<lI><b>PHP 7:</b>Another major version of PHP was developed in 2014 and 2015. This version was termed as PHP 7 which caused some confusion as PHP 6 was never released. PHP 7 was also known as PHP next generation(phpng). The aim of this version was to optimize the performance by refactoring the Zend Engine and preserving the near-complete language compatibility. In July 2014, benchmarks showed a nearly 100% increase in performance. The reworked Zend Engine is called Zend Engine 3 due to some notable changes.</li>" +
                "</ol>"+
                "</body></html>";
        noteTextView1.setText(Html.fromHtml(htmlNotes1));
        noteTextView2.setText(Html.fromHtml(htmlNotes2));
        noteTextView3.setText(Html.fromHtml(htmlNotes3));

    }
}
