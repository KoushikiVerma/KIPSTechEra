package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JavaAppletsActivity extends AppCompatActivity {
    private TextView noteTextView1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_applets);
        noteTextView1 = findViewById(R.id.JavaApplets);
        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h2><U>Java Applets :</U></h2>"+
                "<p>Java applets are small applications written in the Java programming language that are designed to run within a web browser. They are often used to add interactive features to websites, such as animations, games, and data visualization tools. Applets are embedded in web pages using HTML code and are executed by the Java Virtual Machine (JVM) within the browser.\n" +
                "\n" +
                "However, Java applets have fallen out of favor in recent years due to security concerns and the rise of other web technologies, such as HTML5 and JavaScript. Many modern web browsers no longer support Java applets, and they are considered to be outdated and potentially unsafe.\n" +
                "\n" +
                "Despite their decline in popularity, some legacy systems still rely on Java applets for certain functionalities. If you need to run a Java applet, you may need to use an older browser or enable Java support in your current browser. However, it is generally recommended to find alternative solutions that do not rely on Java applets for better security and compatibility.</p>"+
                "<h3> Life Cycle of an Applet in Java:</h3>"+
                "<p>Four methods in the Applet class gives you the framework on which you build any serious applet −</p>"+
                "<ol>"+
                "<lI><b>init :</b> This method is intended for whatever initialization is needed for your applet. It is called after the param tags inside the applet tag have been processed.</li>" +
                "<lI><b>start:</b> This method is automatically called after the browser calls the init method. It is also called whenever the user returns to the page containing the applet after having gone off to other pages.\n" +
                "\n</li>" +
                "<lI><b>stop:</b>This method is automatically called when the user moves off the page on which the applet sits. It can, therefore, be called repeatedly in the same applet.\n" +
                "\n</li>" +
                "<lI><b>destroy:</b>This method is only called when the browser shuts down normally. Because applets are meant to live on an HTML page, you should not normally leave resources behind after a user leaves the page that contains the applet.\n" +
                "\n</li>" +
                "<lI><b>paint:</b>Invoked immediately after the start() method, and also any time the applet needs to repaint itself in the browser. The paint() method is actually inherited from the java.awt.\n" +
                "\n</li>" +
                "<lI><b></li>" +
                "</ol>"+
                "<h3> Types of Applets:</h3>"+
                "<p>Java applets can be classified as either local or remote, depending on where they are stored and how easily they can be accessed.</p>"+
                "<ol>"+
                "<lI><b>Local Applet:</b>We will write the Local Applet ourselves and then integrate it into websites. A local applet is created locally and kept on the local machine. When a web page detects a local applet in the Java system's memory, it does not need to obtain data directly from the internet in order to function. It is defined or provided by the pathname or folder name. When constructing an applet, two properties are used: the source folder, which defines the path name, and the code itself, which defines the filename containing the applet's programming.</li>" +
                "<lI><b>Remote Applet:</b>The remote applet is stored or accessible on another computer that is linked to the world over the internet. We must have internet access on the system to be able to obtain and use the applet that resides on the other machine. We need to be familiar with a remote applet's Uniform Resource Locator (URL) or web location in order to find and download it.</li>" +
                "</ol>"+
                "<h3> Advantages of Java Applets:</h3>"+
                "<ol>"+
                "<lI><b>Interaction With Browsers:</b>Through a smooth integration with online sites, applets let viewers engage with dynamic information without exiting the browser. This results in improved customer service while eliminating the need to obtain and set up separate programs.</li>" +
                "<lI><b>Diminished Server Traffic:</b>Local execution of the applet's code allows functionality to occur on the front end or the user's workstation. In doing so, the server's workload is lessened, and it can process more inquiries and users at once.</li>" +
                "<lI><b>Availability:</b>Applets may adjust to changing frequency bands and computing power. They can be compact and quick to load for users with poorer interactions while providing more capability for those with greater capabilities.</li>" +
                "<lI><b>:</b></li>" +
                "</ol>"+
                "<h3> Disadvantages of Java Applets:</h3>"+
                "<ol>"+
                "<lI><b>Utilizing Excessive Performance And Resources:</b>A common complaint about Java applets is their resource use, particularly with complicated ones. In certain situations, they can even cause crashes, hinder browser performance, and deplete the gadget's batteries. This slowness and waste of resources are not acceptable in today's performance-driven online environment.</li>" +
                "<lI><b>Insufficient Development Support:</b>Application interest declined when major browsers discontinued supporting applets. Suppose you compare applet programming to contemporary website creation tools. In that case, it becomes less appealing and more difficult due to the decreased availability of programming frameworks, libraries, and debugging resources.</li>" +
                "<lI><b>Security Flaws:</b>Because of their architecture, applications operate inside the user's browser and provide access to a greater variety of resources than web pages. But this authority has a cost: possible security lapses. Fraudulent applets might exploit vulnerabilities to get access to private information, download malware, or interfere with system functions.</li>" +
                "</ol>"+
                "<h3> Running a Java Applet:</h3>"+
                "<p>We can run java applet using two methods, which are as given below-</p>"+
                "<ol>"+
                "<lI><b>Running An Applet Through An HTML File:</b>" +
                "<p>Despite their popularity on the web, Java applets still need to be rendered obsolete by security flaws. Most browsers no longer support them, making them a hazardous and obsolete technology. \n" +
                "\n" +
                "Here's a brief overview if you must run an applet, however:\n" +
                "\n" +
                "Prepare your applet as follows: Ensure that you have the Java Running Environment installed, then compile your code and include it within the HTML code file.\n" +
                "Make the HTML: Enter the parameters, required resources, and. class name using the <applet> tag.\n" +
                "Execute the HTML: Check if it works by opening it in a browser that remains compatible with applets and accepting prompts.0</P></li>" +
                "<lI><b>Run An Applet Using The Appletviewer Tool:</b>" +
                "<p>Though they are no longer as popular on the web, Java applets may still be used with the help of the handy applet viewer application. It can be used as follows:\n" +
                "\n" +
                "Prepare to Install Java and locate the—class file from your generated applet.\n" +
                "Gather around, command line! To access the directory containing the.class file, open your terminal, browse there, and write an applet viewer. The applet window pops up!\n" +
                "Run applets from HTML files using applet viewer, see troubleshooting information with -debug, and customize with the -J switch.</p></li>" +
                "</ol>"+
                "</body></html>";

        noteTextView1.setText(Html.fromHtml(htmlNotes1));



    }
}

