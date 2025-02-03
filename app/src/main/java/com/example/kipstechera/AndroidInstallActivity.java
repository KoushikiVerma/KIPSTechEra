package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AndroidInstallActivity extends AppCompatActivity {
    private TextView noteTextView1;
    private TextView noteTextView2;
    private TextView noteTextView3;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_installation);
        noteTextView1 = findViewById(R.id.AndyRequireHW);
        noteTextView2 = findViewById(R.id.AndyRequireSW);
        noteTextView3 = findViewById(R.id.AndyInstall);
        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center'><u>Android Installation</u></h1>" +
                "<h2><U>Hardware Requirements:</U></h2>"+
                "<p> The hardware requirements for installing Android Studio are as follows:\n</p>"+
                "<ol><lI> Windows: Microsoft® Windows® 7/8/10 (32- or 64-bit)\n</li> " +
                "<li> Mac: Mac® OS X® 10.10 (Yosemite) or higher, up to 10.15 (macOS Catalina)\n </li>" +
                "<li>Linux: GNOME or KDE desktop\n</li>" +
                "<p><u>Minimum requirements:</u>\n</p>"+
                "<li> 3 GB RAM minimum, 8 GB RAM recommended\n</li> " +
                "<li> 2 GB of available disk space minimum, 4 GB recommended\n</li> " +
                "<li> 1280 x 800 minimum screen resolution\n</li> " +
                "<p><u>Additional  requirements:</u>\n</p>"+
                "<li>4 GB RAM minimum, 8 GB RAM recommended\n</li> " +
                "<li>2 GB of available disk space minimum, 4 GB recommended\n</li> " +
                "<li>1280 x 800 minimum screen resolution\n</li> " +
                "</ol>"+
                "</body></html>";


        String htmlNotes2 = "<html><body>" +
                "<h2><U>Software Requirements:</U></h2>"+
                "<ul type='1'><LI>   </li>" +
                "<li>Operating System: Android Studio is compatible with Windows, macOS, and Linux operating systems. Make sure your system meets the minimum requirements for the specific operating system you are using.\n</li> " +
                "<li>Java Development Kit (JDK): Android Studio requires JDK 8 or higher to be installed on your system. You can download the JDK from the Oracle website.\n</li> " +
                "<li>RAM: Android Studio requires a minimum of 4GB of RAM, but 8GB or more is recommended for better performance.\n</li> " +
                "<li>Disk Space: Android Studio requires at least 2GB of disk space for a minimal installation, but more space is recommended for additional components and SDKs.\n</li> " +
                "<li>Screen Resolution: Android Studio requires a minimum screen resolution of 1280x800 pixels.\n</li> " +
                "<li>Internet Connection: An internet connection is required to download additional components and updates for Android Studio.\n</li> " +
                "<li>Android SDK: Android Studio comes with the Android SDK, but you may need to download additional SDK components depending on the type of app you are developing.\n</li> " +
                "<li>Emulator: Android Studio includes an emulator for testing your apps, but you can also use a physical Android device for testing.\n</li> " +
                "<li>Integrated Development Environment (IDE): Android Studio is a full-featured IDE for Android app development, so make sure you are familiar with the basic concepts of software development and programming.\n</li> " +
                "<li>Optional Components: Android Studio also supports additional tools and plugins for enhanced development capabilities, such as the Android NDK for native development, C++ support, and more.\n</li> </ul>"+
                "</body></html>";
        String htmlNotes3 = "<html><body>" +
                "<h2><U>Installation Process:</U></h2>"+
                "<ul type='1'>" +
                "<LI>Download Android Studio: Visit the official Android Studio website (https://developer.android.com/studio) and click on the \"Download Android Studio\" button.\n</li>" +
                "<LI>Install Android Studio: Once the download is complete, run the installer file and follow the on-screen instructions to install Android Studio on your computer.\n</li>" +
                "<LI>Choose Components: During the installation process, you will be prompted to choose the components you want to install. Make sure to select the \"Android Virtual Device\" option if you plan to run Android emulators.\n</li>" +
                "<LI>Choose Installation Location: Select the location on your computer where you want to install Android Studio. The default location is usually in the \"Program Files\" directory on Windows.\n</li>" +
                "<LI>Finish Installation: Once the installation is complete, click on the \"Finish\" button to launch Android Studio.\n</li>" +
                "<LI>Setup Android Studio: When you first launch Android Studio, you will be prompted to set up your development environment. Follow the on-screen instructions to configure your preferences, such as theme, keymaps, and SDK components.\n</li>" +
                "<LI>Download SDK Components: Android Studio will automatically download and install the necessary SDK components and tools required for app development. This process may take some time depending on your internet connection speed.\n</li>" +
                "<LI>Create a New Project: Once the setup is complete, you can start creating a new Android project by clicking on the \"Start a new Android Studio project\" option on the welcome screen.\n</li>" +
                "<LI>Choose Project Template: Select a project template from the available options, such as \"Empty Activity\" or \"Basic Activity,\" and click \"Next.\"\n</li>" +
                "<LI>Configure Project Details: Enter the project name, package name, and other details for your new Android app. You can also choose the minimum SDK version and target SDK version for your project.\n</li>" +
                "<LI>Finish Project Setup: Click on the \"Finish\" button to create your new Android project. Android Studio will generate the necessary files and folders for your app, and you can start coding and designing your app.\n</li>" +
                "</ul>\n" +
                "<p>You have successfully installed Android Studio and set up your development environment. You can now start building and testing Android apps on your computer.</p>"+
                "</body></html>";

        noteTextView1.setText(Html.fromHtml(htmlNotes1));
        noteTextView2.setText(Html.fromHtml(htmlNotes2));
        noteTextView3.setText(Html.fromHtml(htmlNotes3));

    }
}

