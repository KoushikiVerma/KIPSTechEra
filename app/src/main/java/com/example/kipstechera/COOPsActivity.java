package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class COOPsActivity extends AppCompatActivity {
    private TextView noteTextView1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_oops);
        noteTextView1 = findViewById(R.id.CPPOops);

        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center' color='blue'><u>OOPs Concept in Java</u></h1>" +
                "<p>OOP stands for Object-Oriented Programming.\n</p>" +
                "<ul>"+
                "<LI><b>Class:</b>The building block of C++ that leads to Object-Oriented programming is a Class. It is a user-defined data type, which holds its own data members and member functions, which can be accessed and used by creating an instance of that class. A class is like a blueprint for an object. For Example: Consider the Class of Cars. There may be many cars with different names and brands but all of them will share some common properties like all of them will have 4 wheels, Speed Limit, Mileage range, etc. So here, the Car is the class, and wheels, speed limits, and mileage are their properties.</li>" +
                "<LI><b>Object:</b>An Object is an identifiable entity with some characteristics and behavior. An Object is an instance of a Class. When a class is defined, no memory is allocated but when it is instantiated (i.e. an object is created) memory is allocated.</li>" +
                "<LI><b>Abstraction:</b>Data abstraction refers to, providing only essential information to the outside world and hiding their background details, i.e., to represent the needed information in program without presenting the details.\n" +
                "\n" +
                "For example, a database system hides certain details of how data is stored and created and maintained. Similar way, C++ classes provides different methods to the outside world without giving internal detail about those methods and data.</li>" +
                "<LI><b>Encapsulation:</b>Encapsulation is placing the data and the functions that work on that data in the same place. While working with procedural languages, it is not always clear which functions work on which variables but object-oriented programming provides you framework to place the data and the relevant functions together in the same object.\n" +
                "\n</li>" +
                "<LI><b>Inheritance:</b>One of the most useful aspects of object-oriented programming is code reusability. As the name suggests Inheritance is the process of forming a new class from an existing class that is from the existing class called as base class, new class is formed called as derived class.\n" +
                "\n" +
                "This is a very important concept of object-oriented programming since this feature helps to reduce the code size.</li>" +
                "<LI><b>Polymorphism:</b>The ability to use an operator or function in different ways in other words giving different meaning or functions to the operators or functions is called polymorphism. Poly refers to many. That is a single function or an operator functioning in many ways different upon the usage is called polymorphism.</li>" +
                "<LI><b>Overloading:</b>The concept of overloading is also a branch of polymorphism. When the exiting operator or function is made to operate on new data type, it is said to be overloaded.</li>" +
                "</ul>"+
                "</body></html>";
        noteTextView1.setText(Html.fromHtml(htmlNotes1));


    }
}

