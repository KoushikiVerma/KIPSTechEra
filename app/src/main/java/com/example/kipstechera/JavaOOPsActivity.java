package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JavaOOPsActivity extends AppCompatActivity {
    private TextView noteTextView1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_oops);

            noteTextView1 = findViewById(R.id.JavaOops);

            displayNotes();
        }

        private void displayNotes() {
            String htmlNotes1 = "<html><body>" +
                    "<h1 align='center' color='blue'><u>OOPs Concept in Java</u></h1>" +
                    "<p>OOP stands for Object-Oriented Programming.\n" +
                    "Object means a real-world entity such as a pen, chair, table, computer, watch, etc. Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. \n" +
                    "Object-oriented programming (OOP) is a programming paradigm based on the concept of \"objects\", which can contain data in the form of fields (often known as attributes or properties), and code, in the form of procedures (often known as methods or functions). Java is an object-oriented programming language, and it embodies the core principles of OOP. Here are the key concepts of OOP in Java:</p>\n"+
                    "<ul>"+
                    "<LI><b>Classes:</b>A class is a user-defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type. Using classes, you can create multiple objects with the same behavior instead of writing their code multiple times. This includes classes for objects occurring more than once in your code.\n" +
                    "Class is a predefined or user-defined template from which objects are created. It represents properties/methods that are common to all objects of the same class. It has several features, such as access modifiers, class names, interfaces, and class bodies.\n</li>" +
                    "<LI><b>Objects:</b>Objects are the basic unit of OOPS representing real-life entities. They are invoked with the help of methods. These methods are declared within a class. Usually, a new keyword is used to create an object of a class in Java.\n" +
                    "A Java object is an instance of a class and is analogous to a relational table row. Objects are collections of data values, the individual elements of which are described by the non-static field definitions of the class.\n</li>" +
                    "<LI><b>Abstraction:</b>Abstraction means showing only the relevant details to the end-user and hiding the irrelevant features that serve as a distraction. For example, during an ATM operation, we only answer a series of questions to process the transaction without any knowledge about what happens in the background between the bank and the ATM.\n</li>" +
                    "<LI><b>Encapsulation:</b>Encapsulation is a means of binding data variables and methods together in a class. Only objects of the class can then be allowed to access these entities. This is known as data hiding and helps in the insulation of data.\n" +
                    "Encapsulation describes the ability of an object to hide its data and methods from the rest of the world and is one of the fundamental principles of object-oriented programming. In Java, a class encapsulates the fields, which hold the state of an object, and the methods, which define the actions of the object. Encapsulation enables you to write reusable programs. It also enables you to restrict access only to those features of an object that are declared public. All other fields and methods are private and can be used for internal object processing.\n</li>" +
                    "<LI><b>Inheritance: </b>Inheritance is the process by which one class inherits the functions and properties of another class. The main function of inheritance is the reusability of code. Each subclass only has to define its features. The rest of the features can be derived directly from the parent class.\n" +
                    "Inheritance is an important feature of object-oriented programming languages. It enables classes to include properties of other classes. The class that inherits the properties is called a child class or subclass, and the class from which the properties are inherited is called a parent class or superclass. This feature also helps in reusing already defined code.\n</li>" +
                    "<LI><b>Polymorphism:</b>It is an object-oriented approach that allows the developer to assign and perform several actions using a single function. For example, “+” can be used for addition as well as string concatenation. Static Polymorphism is based on Method Overloading, and Dynamic Polymorphism is based on Method Overriding.\n" +
                    "Polymorphism is the ability for different objects to respond differently to the same message. In object-oriented programming languages, you can define one or more methods with the same name. These methods can perform different actions and return different values.\n</li>" +
                    "<LI><b></b></li>" +
                    "</ul>"+
                    "</body></html>";

            noteTextView1.setText(Html.fromHtml(htmlNotes1));


        }
}

