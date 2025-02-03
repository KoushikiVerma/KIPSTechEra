package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CvsCPPActivity extends AppCompatActivity {
    private TextView noteTextView1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_diff_cpp);
        noteTextView1 = findViewById(R.id.C_vs_CPP);

        String htmlNotes1 ="<html><body>" +
                "<h2><u>Difference between C and C++:</U></h2>" +
                "<ol" +
                "<lI><b>Definition:</b>C is a structural programming language, and it does not support classes and objects, while C++ is an object-oriented programming language that supports the concept of classes and objects.</li>" +
                "<lI><b>Type of programming language:</b>C supports the structural programming language where the code is checked line by line, while C++ is an object-oriented programming language that supports the concept of classes and objects.</li>" +
                "<lI><b>Developer of the language:</b>Dennis Ritchie developed C language at Bell Laboratories while Bjarne Stroustrup developed the C++ language at Bell Labs circa 1980.</li>" +
                "<lI><b>Subset:</b>C++ is a superset of C programming language. C++ can run 99% of C code but C language cannot run C++ code.</li>" +
                "<lI><b>Type of approach:</b>C follows the top-down approach, while C++ follows the bottom-up approach. The top-down approach breaks the main modules into tasks; these tasks are broken into sub-tasks, and so on. The bottom-down approach develops the lower level modules first and then the next level modules.</li>" +
                "<lI><b>Security:</b>In C, the data can be easily manipulated by the outsiders as it does not support the encapsulation and information hiding while C++ is a very secure language, i.e., no outsiders can manipulate its data as it supports both encapsulation and data hiding. In C language, functions and data are the free entities, and in C++ language, all the functions and data are encapsulated in the form of objects.</li>" +
                "<lI><b>Function Overloading:</b>Function overloading is a feature that allows you to have more than one function with the same name but varies in the parameters. C does not support the function overloading, while C++ supports the function overloading.</li>" +
                "<lI><b>Function Overriding:</b>Function overriding is a feature that provides the specific implementation to the function, which is already defined in the base class. C does not support the function overriding, while C++ supports the function overriding.</li>" +
                "<lI><b>Reference variables:</b>C does not support the reference variables, while C++ supports the reference variables.</li>" +
                "<lI><b>Keywords:</b>C contains 32 keywords, and C++ supports 52 keywords.</li>" +
                "<lI><b>Namespace feature:</b>A namespace is a feature that groups the entities like classes, objects, and functions under some specific name. C does not contain the namespace feature, while C++ supports the namespace feature that avoids the name collisions.</li>" +
                "<lI><b>Exception handling:</b>C does not provide direct support to the exception handling; it needs to use functions that support exception handling. C++ provides direct support to exception handling by using a try-catch block.</li>" +
                "<lI><b>Input/Output functions:</b>In C, scanf and printf functions are used for input and output operations, respectively, while in C++, cin and cout are used for input and output operations, respectively.</li>" +
                "<lI><b>Memory allocation and de-allocation:</b>C supports calloc() and malloc() functions for the memory allocation, and free() function for the memory de-allocation. C++ supports a new operator for the memory allocation and delete operator for the memory de-allocation.</li>" +
                "<lI><b>Inheritance:</b>Inheritance is a feature that allows the child class to reuse the properties of the parent class. C language does not support the inheritance while C++ supports the inheritance.</li>" +
                "<lI><b>Header file:</b>C program uses <stdio.h> header file while C++ program uses <iostream.h> header file.</li>" +
                "<lI><b>:</b></li>" +
                "</ol>"+
                "<h2><u>Similarities between C and C++:</U></h2>" +
                "<ol" +
                "<lI>Both the languages have a similar syntax.</li>"+
                "<lI>Code structure of both the languages are same.</li>"+
                "<lI>The compilation of both the languages is similar.</li>"+
                "<lI>They share the same basic syntax. Nearly all of C’s operators and keywords are also present in C++ and do the same thing.</li>"+
                "<lI>C++ has a slightly extended grammar than C, but the basic grammar is the same.</li>"+
                "<lI>Basic memory model of both is very close to the hardware.</li>"+
                "<lI>Same notions of stack, heap, file-scope and static variables are present in both the languages.</li>"+
                "</ol>"+
                "</body></html>";
        noteTextView1.setText(Html.fromHtml(htmlNotes1));


    }
}

