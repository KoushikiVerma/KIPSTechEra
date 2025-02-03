package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PhpOopsActivity extends AppCompatActivity {
    private TextView noteTextView1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php_oops);
        noteTextView1 = findViewById(R.id.PhpOops);

        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h2><U>OOPs in PHP:</U></h2>"+
                "<p></p>"+
                "<ul>"+
                "<lI><b>Class:</b>A class is an entity that determines how an object will behave and what the object will contain. In other words, it is a blueprint or a set of instruction to build a specific type of object.\n" +
                "\n" +
                "In PHP, declare a class using the class keyword, followed by the name of the class and a set of curly braces ({}).\n" +
                "Syntax to Create Class in PHP\n" +
                "<?php  \n" +
                "class MyClass  \n" +
                "    {  \n" +
                "        // Class properties and methods go here  \n" +
                "    }  \n" +
                "?>  \n</li>" +
                "<lI><b>Object:</b>A class defines an individual instance of the data structure. We define a class once and then make many objects that belong to it. Objects are also known as an instance.\n" +
                "\n" +
                "An object is something that can perform a set of related activities.\n" +
                "Syntax:\n" +
                "<?php  \n" +
                "class MyClass  \n" +
                "{  \n" +
                "        // Class properties and methods go here  \n" +
                "}  \n" +
                "$obj = new MyClass;  \n" +
                "var_dump($obj);  \n" +
                "?></li>" +
                "<lI><b>Encapsulation:</b>this is concerned with hiding the implementation details and only exposing the methods. The main purpose of encapsulation is to;\n" +
                "Reduce software development complexity – by hiding the implementation details and only exposing the operations, using a class becomes easy.\n" +
                "Protect the internal state of an object – access to the class variables is via methods such as get and set, this makes the class flexible and easy to maintain.\n" +
                "The internal implementation of the class can be changed without worrying about breaking the code that uses the class.</li>" +
                "<lI><b>Abstraction:</b>Abstraction in object-oriented programming (OOP) refers to the concept of hiding the complex implementation details of an object and exposing only the essential features or functionalities. It allows you to focus on what an object does rather than how it achieves its functionality. In PHP, abstraction is achieved through abstract classes and interfaces.</li>" +
                "<lI><b>Inheritance:</b>this is concerned with the relationship between classes. The relationship takes the form of a parent and child. The child uses the methods defined in the parent class. The main purpose of inheritance is;\n" +
                "Re-usability– a number of children, can inherit from the same parent. This is very useful when we have to provide common functionality such as adding, updating and deleting data from the database.</li>" +
                "<lI><b>Polymorphism:</b>this is concerned with having a single form but many different implementation ways. The main purpose of polymorphism is;\n" +
                "Simplify maintaining applications and making them more extendable.</li>" +
                "</ul>"+
                "</body></html>";

        noteTextView1.setText(Html.fromHtml(htmlNotes1));



    }
}


