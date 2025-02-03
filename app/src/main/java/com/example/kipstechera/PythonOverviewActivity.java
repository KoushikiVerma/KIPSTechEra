package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PythonOverviewActivity extends AppCompatActivity {
    private TextView noteTextView1;
    private TextView noteTextView2;
    private TextView noteTextView3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python__overview);
        noteTextView1 = findViewById(R.id.PythonIntro);
        noteTextView2 = findViewById(R.id.PythonFeatures);
        noteTextView3 = findViewById(R.id.PythonHistory);
        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center' color='blue'><u>Introduction to Python</u></h1>" +
               "<p>Python is an interpreted, high-level, general-purpose programming language. Its design philosophy emphasizes code readability with its notable use of significant whitespace. Its language constructs and object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.\n" +
                "Python is dynamically typed and garbage-collected. It supports multiple programming paradigms, including structured (particularly, procedural), object-oriented, and functional programming. Python is often described as a \"batteries included\" language due to its comprehensive standard library.\n" +
                "Python is widely used for developing desktop GUI applications, web applications, software development, mathematics, system scripting, and rapid application development. Python is also used in data science and machine learning.</p>"+
                "</body></html>";


        String htmlNotes2 = "<html><body>" +
                "<h1 align='center'>Features of Python</h1>" +
                "<ul type='1'>" +
                "<li><b>Easy to learn and use:</b> Python's syntax is clear and concise, making it easy for beginners to pick up and start coding quickly.</li>" +
                "<li><b>Interpreted language:</b>Python code is executed line by line, making it easy to test and debug programs.</li>" +
                "<li><b>Extensive standard library:</b> Python comes with a large standard library that provides support for a wide range of tasks, from working with files and databases to web development and networking.</li>" +
                "<li><b>Open-source:</b> Python is open-source, meaning it is free to use and distribute, and the community is constantly contributing new libraries and tools to enhance its capabilities.</li>" +
                "<li><b>Cross-platform:</b> Python code can run on various operating systems, including Windows, macOS, and Linux, making it a versatile choice for developers.</li>" +
                "<li><b>Powerful:</b> Python is a powerful language that can be used to create a wide variety of applications, from simple scripts to complex web applications.</li>" +
                "<li><b>Versatile:</b>Python is a versatile language that can be used for a variety of tasks, including web development, data science, machine learning, and more.</li>" +
                "<li><b>Portable:</b>Python code can be run on a variety of platforms, including Windows, Mac, Linux, and Unix.</li>" +
                "<li><b>Free and open source:</b>Python is free and open source software, which means that it is freely available to use and distribute.</li>" +
                "</ul>"+
                "</body></html>";
        String htmlNotes3 = "<html><body>" +
                "<h1 align='center'>History of Python</h1>"+
                "<ol>"+
                "<lI>Python laid its foundation in the late 1980s.</li>" +
                "<lI>The implementation of Python was started in December 1989 by Guido Van Rossum at CWI in Netherland.</li>" +
                "<lI>In February 1991, Guido Van Rossum published the code (labeled version 0.9.0) to alt.sources.</li>" +
                "<lI>In 1994, Python 1.0 was released with new features like lambda, map, filter, and reduce.</li>" +
                "<lI>Python 2.0 added new features such as list comprehensions, garbage collection systems.</li>" +
                "<lI>On December 3, 2008, Python 3.0 (also called \"Py3K\") was released. It was designed to rectify the fundamental flaw of the language.</li>" +
                "<lI>ABC programming language is said to be the predecessor of Python language, which was capable of Exception Handling and interfacing with the Amoeba Operating System.</li>" +
                "<lI>The following programming languages influence Python:\n" +
                "ABC language.\n" +
                "Modula-3</li>" +
                "</ol>"+
                "<H3>Why the Name Python?</H3>"+
                "<p>There is a fact behind choosing the name Python. Guido van Rossum was reading the script of a popular BBC comedy series \"Monty Python's Flying Circus\". It was late on-air 1970s.\n" +
                "\n" +
                "Van Rossum wanted to select a name which unique, sort, and little-bit mysterious. So he decided to select naming Python after the \"Monty Python's Flying Circus\" for their newly created programming language.\n" +
                "\n" +
                "The comedy series was creative and well random. It talks about everything. Thus it is slow and unpredictable, which made it very interesting.\n" +
                "\n" +
                "Python is also versatile and widely used in every technical field, such as Machine Learning, Artificial Intelligence, Web Development, Mobile Application, Desktop Application, Scientific Calculation, etc.</p>"+
                "</body></html>";
        noteTextView1.setText(Html.fromHtml(htmlNotes1));
        noteTextView2.setText(Html.fromHtml(htmlNotes2));
        noteTextView3.setText(Html.fromHtml(htmlNotes3));



    }
}

