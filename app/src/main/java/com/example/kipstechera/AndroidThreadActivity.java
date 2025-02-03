package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AndroidThreadActivity extends AppCompatActivity {
    private TextView noteTextView1;
    private TextView noteTextView2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_thread);

        noteTextView1 = findViewById(R.id.AndyThread);
        noteTextView2 = findViewById(R.id.AndyException);
        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center'><u>Android Threads and Exceptions</u></h1>" +
                "<h2><U>Android Thread:</U></h2>"+
                "<p>Thread is one of the important concepts in Android. Thread is a lightweight sub-process that provides us a way to do background operations without interrupting the User Interface (UI). When an app is launched, it creates a single thread in which all app components will run by default. The thread which is created by the runtime system is known as the main thread. The main thread’s primary role is to handle the UI in terms of event handling and interaction with views in the UI. If there is a task that is time-consuming and that task is run on the main thread, then it will stop other tasks until it gets completed, which in turn may result in displaying a warning “Application is unresponsive” to the user by the operating system. So we need different threads for such tasks and some other tasks.\n</p>"+
                "<p>All threading components belong to one of two basic categories.\n" +
                "\n" +
                "The fragment or activity attached threads: This category of threads are bound to the lifecycle of the activity/fragment and these are terminated as soon as the activity/fragment is destroyed.\n" +
                "Thread components:\n" +
                "AsyncTask, Loaders.\n" +
                "\n" +
                "The fragment or activity not attached threads: These types of threads can continue to run beyond the lifetime of the activity or fragment from which they were spawned.\n" +
                "\n" +
                "Threading Components: Service, Intent Service.\n" +
                "\n</p>"+
                "<h3>Types of Threads in Android:</h3>"+
                "<ol>" +
                "<lI><b>Main Thread:</b>When we launch our app on Android, it creates the first thread of execution called the “Main Thread”. The communication between the components from the Android UI toolkit and the dispatching of events to their appropriate UI widgets is handled by the main thread. We should avoid network operations, database calls, and the loading of certain components in the main thread. Because the main thread is called synchronously when executed, that means the user interface will remain completely unresponsive until the performance completes.</li>" +
                "<lI><b>UI Thread:</b>Every app in Android has its own thread which is responsible for running the UI objects, like view objects. Such a thread is known as the UI thread. The UI thread is the main thread of execution for our app as this is where most of the app code is run. The UI thread is where all of our app components (like activities, services, content providers, and broadcast receivers) are created. This thread allows our tasks to perform their background work and then move the results to UI elements such as bitmaps. All objects running on our UI thread will be able to access other objects which are also running on the same UI thread. The tasks that we run on a thread from a thread pool do not run on our UI thread, so they will not have access to UI objects. The data moves from a background thread to the UI thread, using a handler that runs on the UI thread.</li>" +
                "<lI><b>Worker Thread:</b>The worker thread is a background thread. The worker threads are created separately, other than threads like the UI thread. As we know from the rules, we cannot block a UI thread so this is where the worker thread comes into play since we can use them to run the child processes and tasks.\n</li>" +
                "<lI><b>Any Thread:</b>In Any thread, the annotated method can be called from any thread. If the annotated element is a class, then all methods in the class can be called from Any Thread.\n</li>" +
                "<lI><b>Binder Thread:</b> Binder thread represents a separate thread of service. The binder is a mechanism that provides inter-process communication. The binder thread is used in service binding with interprocess communication. This concept is mainly related to service calls with interfaces defined by Android Interface Definition Language (AIDL).\n</li>" +
                "</ol>"+
                "</body></html>";


        String htmlNotes2 = "<html><body>" +
                "<h2><U>Android Exceptions :</U></h2>"+
                "<p>An exception in Android is an unexpected event or condition that can cause an app to crash or behave unexpectedly.Exceptions in Android refer to abnormal events or conditions that occur during the execution of an app, which can cause the app to crash or behave unexpectedly. </p>"+
                "<p>An \"Android exception\" typically refers to an error or problem that occurs within an Android application while it's running. In Android development, exceptions are thrown when something unexpected happens during the execution of the program. These exceptions could be due to various reasons such as null pointer exceptions, illegal argument exceptions, or other runtime errors.\n" +
                "\n" +
                "When an exception occurs in an Android application, it can cause the app to crash or behave unexpectedly. Developers use try-catch blocks to handle exceptions gracefully, which means they can detect when an exception occurs and respond to it appropriately rather than letting the app crash.\n" +
                "\n</p>"+
                "<h3>Android Exception Handling:</h3>"+
                "<p>Exception handling is a technique which handles the runtime problems and maintains the flow of program execution.Android exception handling is the process of managing and responding to exceptions that occur during the execution of an Android application. Exception handling is crucial in Android development to ensure that the application remains stable and responsive even when unexpected errors occur.\n" +
                "There are four different keywords used in exception handling. These are:\n</p>"+
                "<ul type='1'>" +
                "<LI><b>Try Block:</b> Try block contains set of statements which might generate an exception. It must be followed by either catch or finally or both.\n</li>" +
                "<LI><b>Catch Block:</b>Catch block is used to catch the exception thrown from try block.\n</li>" +
                "<LI><b>Finally Block:</b>Finally block always execute whether exception is handled or not. So it is used to execute important code statement.\n</li>" +
                "<LI><b>Throw Block:</b>Throw keyword is used to throw an exception explicitly.</li>\n" +
                "</ol>"+
                "</body></html>";

        noteTextView1.setText(Html.fromHtml(htmlNotes1));
        noteTextView2.setText(Html.fromHtml(htmlNotes2));

    }
}


