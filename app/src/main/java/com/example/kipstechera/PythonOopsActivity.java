package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PythonOopsActivity extends AppCompatActivity {
    private TextView noteTextView1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_oops);
        noteTextView1 = findViewById(R.id.PythonOops);

        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h2><U>OOPs in Python:</U></h2>"+
                "<p></p>"+
                "<ul>"+
                "<lI><b>Python Class:</b>A class is a collection of objects. A class contains the blueprints or the prototype from which the objects are being created. It is a logical entity that contains some attributes and methods. " +
                "Classes are created by keyword class.\n" +
                "Attributes are the variables that belong to a class.\n" +
                "Attributes are always public and can be accessed using the dot (.) operator. Eg.: Myclass.Myattribute</li>" +
                "<lI><b>Python Object:</b>The object is an entity that has a state and behavior associated with it. It may be any real-world object like a mouse, keyboard, chair, table, pen, etc. Integers, strings, floating-point numbers, even arrays, and dictionaries, are all objects. More specifically, any single integer or any single string is an object. The number 12 is an object, the string “Hello, world” is an object, a list is an object that can hold other objects, and so on. You’ve been using objects all along and may not even realize it.\n" +
                "\n" +
                "An object consists of:\n" +
                "\n" +
                "State: It is represented by the attributes of an object. It also reflects the properties of an object.\n" +
                "Behavior: It is represented by the methods of an object. It also reflects the response of an object to other objects.\n" +
                "Identity: It gives a unique name to an object and enables one object to interact with other objects.</li>" +
                "<lI><b>Python Encapsulation:</b>Encapsulation is one of the fundamental concepts in object-oriented programming (OOP). It describes the idea of wrapping data and the methods that work on data within one unit. This puts restrictions on accessing variables and methods directly and can prevent the accidental modification of data. To prevent accidental change, an object’s variable can only be changed by an object’s method. Those types of variables are known as private variables.</li>" +
                "<lI><b>Python Data Abstraction:</b>It hides unnecessary code details from the user. Also,  when we do not want to give out sensitive parts of our code implementation and this is where data abstraction came.\n" +
                "Data Abstraction in Python can be achieved by creating abstract classes.</li>" +
                "<lI><b>Python Inheritance:</b>Inheritance is the capability of one class to derive or inherit the properties from another class. The class that derives properties is called the derived class or child class and the class from which the properties are being derived is called the base class or parent class. The benefits of inheritance are:\n" +
                "\n" +
                "It represents real-world relationships well.\n" +
                "It provides the reusability of a code. We don’t have to write the same code again and again. Also, it allows us to add more features to a class without modifying it.\n" +
                "It is transitive in nature, which means that if class B inherits from another class A, then all the subclasses of B would automatically inherit from class A.\n" +
                "Types of Inheritance\n" +
                "Single Inheritance: Single-level inheritance enables a derived class to inherit characteristics from a single-parent class.\n" +
                "Multilevel Inheritance: Multi-level inheritance enables a derived class to inherit properties from an immediate parent class which in turn inherits properties from his parent class. \n" +
                "Hierarchical Inheritance: Hierarchical-level inheritance enables more than one derived class to inherit properties from a parent class.\n" +
                "Multiple Inheritance: Multiple-level inheritance enables one derived class to inherit properties from more than one base class.</li>" +
                "<lI><b>Polymorphism:</b>Polymorphism simply means having many forms. For example, we need to determine if the given species of birds fly or not, using polymorphism we can do this using a single function.</li>" +
                "</ul>"+
                "</body></html>";

        noteTextView1.setText(Html.fromHtml(htmlNotes1));



    }
}


