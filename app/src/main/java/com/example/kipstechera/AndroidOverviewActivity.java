package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AndroidOverviewActivity extends AppCompatActivity {
    private TextView noteTextView1;
    private TextView noteTextView2;
    private TextView noteTextView3;
    private TextView noteTextView4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_overview);
        noteTextView1 = findViewById(R.id.AndyIntro);
        noteTextView2 = findViewById(R.id.AndyFeatures);
        noteTextView3 = findViewById(R.id.AndyPros);
        noteTextView4 = findViewById(R.id.AndyCons);
        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center' color='blue'><u>Introduction to Android</u></h1>" +
                "<h2><U>What is it:</U></h2>"+
                "<ol><lI> Operating System</li> " +
                "<li>Modified form of linux kernel </li>" +
                "<li> Used for mobile applications</li>" +
                "<li> Open source software</li> " +
                "<li>Developed by- Google</li> " +
                "<li>Includes a software development kit(SDK) </li>" +
                "<li> Open handset Alliance </li>" +
                "<li>uses core java language for developing application </li></ol>"+
                "<p>Android is an open source , handset alliance and linux based operating system used for various mobile devices such as smart phones , tablets & now televisions as well. Android is a version of Linux just as Linux is an Operating System used in server and desktop systems similarly , Android is a modified version of Linux specially designed for touch screen devices or mobile phones.</p>" +
                "<p>Android OS works in a phone or mobile , in the same way OS works in a computer. It runs all the functions & operations of phone. In a way, whatever is shown to the used in the display of the phone is possible any because of it.\n+" +
                " For example:- To make a call, read a message, play a game , read E-mail etc. All these functions are processed by OS after that any user can see that in readable format.</p>"+
                "<p>Android can run from many different manufacturers on many different devices . Android includes a software development kit (SDK) that helps you write original code and assemble software modules to create apps for Android users. Android also provides a marketplace to distribute apps. All together , Android represents an ecosystem for mobile apps. Android is now a part of Google and the open Handset Alliance. It uses core Java language for developing applications.</p>\n"+
                "</body></html>";


        String htmlNotes2 = "<html><body>" +
                "<h1 align='center'>Features of Android</h1>" +
                "<ul type='1'><LI>Android is linux kernel based open source OS , which can be used easily by any user.</li>" +
                "<li>Android user interface is very simple. Anyone can use it very easily.</li>" +
                "<li>Android is a multi-tasking operating system. You can do a lot of things at once."+
                "For example:- A user can listen to songs along with using the internet in the phone</li>" +
                "<li>Android is multi-lingual, that is, android supports many languages. A user can use Android in his favorite language.</li>" +
                "<li>Android is multi-touch OS, it means, user can do any special work in their mobile via two fingers.</li>" +
                "<li>In Android, wi-fi, Bluetooth, 3G/4G etc. are available to users for connectivity.</li>" +
                "<li>Android is a product of Google so each Android version has the high security.</li></ul>"+
                "</body></html>";
        String htmlNotes3 = "<html><body>" +
                "<h1 align='center'>Advantages of Android Development</h1>"+
                "<ul type='1'><LI>The Android is an open-source Operating system and hence possesses a vast community for support.</li>" +
                "<li>The design of the Android Application has guidelines from Google, which becomes easier for developers to produce more intuitive user applications.</li>" +
                "<li>Fragmentation gives more power to Android Applications. This means the application can run two activities on a single screen.</li>" +
                "<li>Releasing the Android application in the Google play store is easier when it is compared to other platforms.</li></ul>\n" +
                "</body></html>";
        String htmlNotes4 = "<html><body>" +
                "<h1 align='center'>Disadvantages of Android Development</h1>"+
                "<ul type='1'><LI>Fragmentation provides a very intuitive approach to user experience but it has some drawbacks, where the development team needs time to adjust to the various screen sizes of mobile smartphones that are now available in the market and invoke the particular features in the application.</li>"+
                "<li>The Android devices might vary broadly. So the testing of the application becomes more difficult.</li>"+
                "<li>As the development and testing consume more time, the cost of the application may increase, depending on the application’s complexity and features.</li>"+
                "</body></html>";

        noteTextView1.setText(Html.fromHtml(htmlNotes1));
        noteTextView2.setText(Html.fromHtml(htmlNotes2));
        noteTextView3.setText(Html.fromHtml(htmlNotes3));
        noteTextView4.setText(Html.fromHtml(htmlNotes4));

    }
    }
