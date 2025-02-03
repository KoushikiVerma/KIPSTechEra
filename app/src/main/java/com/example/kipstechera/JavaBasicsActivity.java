package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JavaBasicsActivity extends AppCompatActivity {
    private TextView noteTextView1;
    private TextView noteTextView2;
    private TextView noteTextView3;
    private TextView noteTextView4;
    private TextView noteTextView5;
    private TextView noteTextView6;
    private TextView noteTextView7;
    private TextView noteTextView8;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_basics);
        noteTextView1 = findViewById(R.id.JavaDataTypes);
        noteTextView2 = findViewById(R.id.JavaVariables);
        noteTextView3 = findViewById(R.id.JavaOperators);
        noteTextView4 = findViewById(R.id.JavaKeywords);
        noteTextView5 = findViewById(R.id.JavaControlStatements);
        noteTextView6 = findViewById(R.id.JavaString);
        noteTextView7 = findViewById(R.id.JavaArrays);
        noteTextView8 = findViewById(R.id.JavaComments);
        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center'><u>Basics of Java</u></h1>" +
                "<h2><U>Java DataTypes</U></h2>"+
                "<p>Data types specify the different sizes and values that can be stored in the variable. There are two types of data types in Java:</p>"+
                "<ol>" +
                "<li><b>Primitive data types:</b>The primitive data types include boolean, char, byte, short, int, long, float and double.</li>" +
                "<li><b>Non-primitive data types:</b>The non-primitive data types include Classes, Interfaces, and Arrays.</li>" +
                "</ol>"+
                "<h4>1.<u> Primitive DataTypes</u></h4>"+
                "<p>In Java language, primitive data types are the building blocks of data manipulation. These are the most basic data types available in Java language.There are 8 types of primitive data types:\n</p>"+
                "<ol>" +
                "<lI><b>Boolean Data Type:</b> The Boolean data type is used to store only two possible values: true and false. This data type is used for simple flags that track true/false conditions.\n" +
                "\n" +
                "The Boolean data type specifies one bit of information, but its \"size\" can't be defined precisely.\n" +
                "<b>Example:</b>Boolean one = false </li>" +
                "<lI><b>Byte Data Type:</b> The byte data type is an example of primitive data type. It isan 8-bit signed two's complement integer. Its value-range lies between -128 to 127 (inclusive). Its minimum value is -128 and maximum value is 127. Its default value is 0.\n" +
                "\n" +
                "The byte data type is used to save memory in large arrays where the memory savings is most required. It saves space because a byte is 4 times smaller than an integer. It can also be used in place of \"int\" data type.\n" +
                "<b>Example:</b> byte a = 10, byte b = -20 </li>" +
                "<lI><b>Short Data Type:</b>The short data type is a 16-bit signed two's complement integer. Its value-range lies between -32,768 to 32,767 (inclusive). Its minimum value is -32,768 and maximum value is 32,767. Its default value is 0.\n" +
                "\n" +
                "The short data type can also be used to save memory just like byte data type. A short data type is 2 times smaller than an integer.\n" +
                "<b>Example:</b>short s = 10000, short r = -5000 </li>" +
                "<lI><b>Int Data Type: </b>The int data type is a 32-bit signed two's complement integer. Its value-range lies between - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive). Its minimum value is - 2,147,483,648and maximum value is 2,147,483,647. Its default value is 0.\n" +
                "\n" +
                "The int data type is generally used as a default data type for integral values unless if there is no problem about memory.\n" +
                "<b>Example:</b>int a = 100000, int b = -200000 </li>" +
                "<lI><b>Long Data Type:</b>The long data type is a 64-bit two's complement integer. Its value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive). Its minimum value is - 9,223,372,036,854,775,808and maximum value is 9,223,372,036,854,775,807. Its default value is 0. The long data type is used when you need a range of values more than those provided by int.\n" +
                "<b>Example:</b>long a = 100000L, long b = -200000L </li>" +
                "<lI><b>Float Data Type:</b>The float data type is a single-precision 32-bit IEEE 754 floating point.Its value range is unlimited. It is recommended to use a float (instead of double) if you need to save memory in large arrays of floating point numbers. The float data type should never be used for precise values, such as currency. Its default value is 0.0F.\n" +
                "<b>Example:</b>float f1 = 234.5f </li>" +
                "<lI><b>Double Data Type:</b>The double data type is a double-precision 64-bit IEEE 754 floating point. Its value range is unlimited. The double data type is generally used for decimal values just like float. The double data type also should never be used for precise values, such as currency. Its default value is 0.0d.\n" +
                "<b>Example:</b>double d1 = 12.3</li>" +
                "<lI><b>Char Data Type:</b>The char data type is a single 16-bit Unicode character. Its value-range lies between '\\u0000' (or 0) to '\\uffff' (or 65,535 inclusive).The char data type is used to store characters.\n" +
                "<b>Example:</b>char letterA = 'A' </li>" +
                "<h4>2.<u> Non-Primitive Data Type or Reference Data Types</u></h4>"+
                "<p>The Reference Data Types will contain a memory address of variable values because the reference types won’t store the variable value directly in memory. They are strings, objects, arrays, etc. \n</p>"+
                "<ol>" +
                "<lI><b>Strings :</b>Strings are defined as an array of characters. The difference between a character array and a string in Java is, that the string is designed to hold a sequence of characters in a single variable whereas, a character array is a collection of separate char-type entities. Unlike C/C++, Java strings are not terminated with a null character.\n" +
                "<b>Example:</b>String s = \"Hello\"; </li>" +
                "<lI><b>Class:</b>A class is a user-defined blueprint or prototype from which objects are created.  It represents the set of properties or methods that are common to all objects of one type. " +
                "<lI><b>Object:</b>An Object is a basic unit of Object-Oriented Programming and represents real-life entities.  A typical Java program creates many objects, which as you know, interact by invoking methods." +
                "<lI><b>Interface:</b>Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, no body)."+
                "<lI><b>Array:</b>An Array is a group of like-typed variables that are referred to by a common name. Arrays in Java work differently than they do in C/C++." +
                "</ol>"+
                "</body></html>";


        String htmlNotes2 = "<html><body>" +
                "<h2><u>Java Variables:</U></h2>"+
                "<p>In Java, a variable is a container that holds a value that can be changed during the execution of a program. Variables are used to store data that can be accessed and manipulated by the program.variables in Java language are the names used to refer to data stored in the memory. One Java variable can hold only a single type of data. Before using a variable while programming, it is necessary to declare a variable. It means to assign data to a particular memory and use a name for that memory.</p>"+
                "<h4><b>Types of Variables:</b></h4>"+
                "<p>There are three types of variables in Java:</p>"+
                "<ul type='1'>" +
                "<LI><b>Local Variable:</b> A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.\n" +
                "A local variable cannot be defined with \"static\" keyword.</li>" +
                "<LI><b>Instance Variable:</b> A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static.\n" +
                "It is called an instance variable because its value is instance-specific and is not shared among instances.</li>" +
                "<LI><b>Static Variable:</b> A variable that is declared as static is called a static variable. It cannot be local. You can create a single copy of the static variable and share it among all the instances of the class. Memory allocation for static variables happens only once when the class is loaded in the memory.\n</li>" +
                "<h5><b>Example of Variables:</b></H5>"+
                "<p>public class A  \n" +
                "{  \n" +
                "    static int m=100;//static variable  \n" +
                "    void method()  \n" +
                "    {    \n" +
                "        int n=90;//local variable    \n" +
                "    }  \n" +
                "    public static void main(String args[])  \n" +
                "    {  \n" +
                "        int data=50;//instance variable    \n" +
                "    }  \n" +
                "}//end of class  </p>"+
                "</ul>"+
                "<h4><b><u>Naming Convention of Variable</u></b></h4>"+
                "<ol>"+
                "<LI>Class names should be nouns, in mixed cases with the first letter of each internal word capitalized. Interfaces names should also be capitalized just like class names. </li>" +
                "<LI> Methods should be verbs, in mixed case with the first letter lowercase and with the first letter of each internal word capitalized.</li>" +
                "<LI>Variable names should be short yet meaningful. </li>" +
                "<LI> Interface names should be capitalized like class names.</li>" +
                "<LI>All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).</li>" +
                "<LI>After the first character, identifiers or variables can have any combination of characters.</li>" +
                "<LI>A keyword cannot be used as variable name.</li>" +
                "<LI>Avoid using spaces in variable names.</li>" +
                "<LI>Avoid using abbreviations, unless they are well-known and understood.</li>" +
                "<LI>Avoid using numbers in variable names, unless they are absolutely necessary.</li>" +
                "</ol>"+
                "</body></html>";
        String htmlNotes3 ="<html><body>" +
                "<h2><u>Java Operators:</U></h2>" +
                "<p>Operators in Java are the symbols used for performing specific operations in Java. Operators make tasks like addition, multiplication, etc which look easy although the implementation of these tasks is quite complex.</p>"+
                "<ul type='disc'>" +
                "<li><b>1)Arithmetic Operators:</b>They are used to perform simple arithmetic operations on primitive data types. \n" +
                "<ol>" +
                "<li><b>*: </b>Multiplication</li>" +
                "<li><b>/:</b>Division</li>" +
                "<li><b>% :</b>Modulo</li>" +
                "<li><b>+ :</b>Addition</li>" +
                "<li><b>-:</b>Subtraction</li>" +
                "</ol>"+
                "</li>" +
                "<li><b>2)Unary Operators:</b>"+
                "<p>Unary operators need only one operand. They are used to increment, decrement, or negate a value. \n</p>"+
                "<ol>" +
                "<li><b>-:</b>Unary minus, used for negating the values.</li>" +
                "<li><b>+:</b>Unary plus indicates the positive value (numbers are positive without this, however). It performs an automatic conversion to int when the type of its operand is the byte, char, or short. This is called unary numeric promotion.</li>" +
                "<li><b>++:</b> Increment operator, used for incrementing the value by 1. There are two varieties of increment operators:\n" +
                "Post-Increment\n" +
                "Pre-Increment</li>" +
                "<li><b>--:</b>Decrement operator, used for decrementing the value by 1. There are two varieties of decrement operators:\n" +
                "Post-Decrement\n" +
                "Pre-Decrement</li>" +
                "<li><b>!:</b>Logical not operator, used for inverting a boolean value.</li>" +
                "</ol>"+
                "</li>" +
                "<li><b>3)Assignment Operator:</b>" +
                "<p> ‘=’ Assignment operator is used to assign a value to any variable. It has right-to-left associativity, i.e. value given on the right-hand side of the operator is assigned to the variable on the left, and therefore right-hand side value must be declared before using it or should be a constant.</p>" +
                "<ol>" +
                "<li><b>+=:</b>for adding the left operand with the right operand and then assigning it to the variable on the left.</li>" +
                "<li><b>-=:</b>for subtracting the right operand from the left operand and then assigning it to the variable on the left.</li>" +
                "<li><b>*=:</b>for multiplying the left operand with the right operand and then assigning it to the variable on the left.</li>" +
                "<li><b>/=:</b>for dividing the left operand by the right operand and then assigning it to the variable on the left.</li>" +
                "<li><b>%=:</b>for assigning the modulo of the left operand by the right operand and then assigning it to the variable on the left.</li>" +
                "</ol>"+
                "</li>" +
                "<li><b>4)Relational Operators:</b>"+
                "<p>These operators are used to check for relations like equality, greater than, and less than. They return boolean results after the comparison and are extensively used in looping statements as well as conditional if-else statements.</p>"+
                "<ol>" +
                "<li><b>==:</b>Equal to returns true if the left-hand side is equal to the right-hand side.</li>" +
                "<li><b>!=:</b>Not Equal to returns true if the left-hand side is not equal to the right-hand side.</li>" +
                "<li><b>less than(<):</b> returns true if the left-hand side is less than the right-hand side.</li>" +
                "<li><b>less than or equal to(<=):</b> returns true if the left-hand side is less than or equal to the right-hand side.</li>" +
                "<li><b>Greater than(>):</b> returns true if the left-hand side is greater than the right-hand side.</li>" +
                "<li><b>Greater than or equal to(>=):</b> returns true if the left-hand side is greater than or equal to the right-hand side.</li>" +
                "</ol>"+
                "</li>" +
                "<li><b>5)Logical  Operators:</b>"+
                "<p>These operators are used to perform “logical AND” and “logical OR” operations, i.e., a function similar to AND gate and OR gate in digital electronics. One thing to keep in mind is the second condition is not evaluated if the first one is false, i.e., it has a short-circuiting effect. Used extensively to test for several conditions for making a decision. Java also has “Logical NOT”, which returns true when the condition is false and vice-versa</p>"+
                "<ol>" +
                "<li><b>&&, Logical AND:</b> returns true when both conditions are true.</li>" +
                "<li><b> ||, Logical OR:</b>returns true if at least one condition is true.</li>" +
                "<li><b>!, Logical NOT:</b>returns true when a condition is false and vice-versa</li>" +
                "</ol>"+
                "</li>" +
                "<li><b>6)Ternary Operators:</b>"+
                "<p>The ternary operator is a shorthand version of the if-else statement. It has three operands and hence the name Ternary.</p>"+
                "<h6>General Format:</h6><p>condition ? if true : if false\n</p>"+
                "</li>" +
                "<li><b>7)Bitwise  Operators:</b>"+
                "<p>These operators are used to perform the manipulation of individual bits of a number. They can be used with any of the integer types. They are used when performing update and query operations of the Binary indexed trees.</p>"+
                "<ol>" +
                "<li><b>&, Bitwise AND operator:</b> returns bit by bit AND of input values.</li>" +
                "<li><b>|, Bitwise OR operator:</b>returns bit by bit OR of input values.</li>" +
                "<li><b>^, Bitwise XOR operator:</b>returns bit-by-bit XOR of input values.</li>" +
                "<li><b>~, Bitwise Complement Operator:</b>This is a unary operator which returns the one’s complement representation of the input value, i.e., with all bits inverted.</li>" +
                "</ol>"+
                "</li>" +
                "<li><b>8)Shift Operators:</b>"+
                "<p>These operators are used to shift the bits of a number left or right, thereby multiplying or dividing the number by two, respectively. They can be used when we have to multiply or divide a number by two.</p>"+
                "<ol>" +
                "<li><b><<, Left shift operator:</b>shifts the bits of the number to the left and fills 0 on voids left as a result. Similar effect as multiplying the number with some power of two.</li>" +
                "<li><b>>>, Signed Right shift operator:</b> shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit depends on the sign of the initial number. Similar effect to dividing the number with some power of two.</li>" +
                "<li><b>>>>, Unsigned Right shift operator:</b>shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit is set to 0.</li>" +
                "</ol>"+
                "</li>" +
                "<li><b>9)instanceof  Operators:</b>"+
                "<p>The instance of the operator is used for type checking. It can be used to test if an object is an instance of a class, a subclass, or an interface. General format-\n</p>"+
                "object instance of class/subclass/interface</li>" +
                "</ul>"+
                "</body></html>";
        String htmlNotes4 ="<html><body>" +
                "<h2><u>Java Keywords:</U></h2>" +
                "<p>Java keywords are also known as reserved words. Keywords are particular words that act as a key to a code. These are predefined words by Java so they cannot be used as a variable or object name or class name.\n</p>"+
                "<ol" +
                "<ol>" +
                "<li><b>abstract:</b>A non-access modifier. Used for classes and methods: An abstract class cannot be used to create objects (to access it, it must be inherited from another class). An abstract method can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from)\n</li>" +
                "<li><b>assert:</b>For debugging</li>" +
                "<li><b>boolean:</b>A data type that can only store true or false values</li>" +
                "<li><b>break:</b>Breaks out of a loop or a switch block</li>" +
                "<li><b>byte:</b>A data type that can store whole numbers from -128 and 127</li>" +
                "<li><b>case:</b>Marks a block of code in switch statements</li>" +
                "<li><b>catch:</b>Catches exceptions generated by try statements</li>" +
                "<li><b>char:</b>A data type that is used to store a single character</li>" +
                "<li><b>class:</b>Defines a class</li>" +
                "<li><b>continue:</b>Continues to the next iteration of a loop</li>" +
                "<li><b>const:</b>Defines a constant. Not in use - use final instead</li>" +
                "<li><b>default:</b>Specifies the default block of code in a switch statement</li>" +
                "<li><b>do:</b>Used together with while to create a do-while loop</li>" +
                "<li><b>double:</b>A data type that can store whole numbers from 1.7e−308 to 1.7e+308</li>" +
                "<li><b>else:</b>Used in conditional statements</li>" +
                "<li><b>enum:</b>Declares an enumerated (unchangeable) type</li>" +
                "<li><b>exports:</b>Exports a package with a module. New in Java 9.</li>" +
                "<li><b>extends:</b>Extends a class (indicates that a class is inherited from another class)</li>" +
                "<li><b>final:</b>A non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override)</li>" +
                "<li><b>finally:</b>Used with exceptions, a block of code that will be executed no matter if there is an exception or not</li>" +
                "<li><b>float:</b>A data type that can store whole numbers from 3.4e−038 to 3.4e+038</li>" +
                "<li><b>for:</b>Create a for loop</li>" +
                "<li><b>goto:</b>Not in use, and has no function</li>" +
                "<li><b>if:</b>Makes a conditional statement</li>" +
                "<li><b>implements:</b>Implements an interface</li>" +
                "<li><b>import:</b>Used to import a package, class or interface</li>" +
                "<li><b>instanceof:</b>Checks whether an object is an instance of a specific class or an interface</li>" +
                "<li><b>int:</b>A data type that can store whole numbers from -2147483648 to 2147483647</li>" +
                "<li><b>interface:</b>Used to declare a special type of class that only contains abstract methods</li>" +
                "<li><b>long:</b>A data type that can store whole numbers from -9223372036854775808 to 9223372036854775808</li>" +
                "<li><b>module:</b>Declares a module. New in Java 9</li>" +
                "<li><b>native:</b>Specifies that a method is not implemented in the same Java source file (but in another language)</li>" +
                "<li><b>new:</b>Creates new objects</li>" +
                "<li><b>package:</b>Declares a package</li>" +
                "<li><b>private:</b>An access modifier used for attributes, methods and constructors, making them only accessible within the declared class</li>" +
                "<li><b>protected:</b>An access modifier used for attributes, methods and constructors, making them accessible in the same package and subclasses</li>" +
                "<li><b>public:</b>An access modifier used for classes, attributes, methods and constructors, making them accessible by any other class</li>" +
                "<li><b>requires:</b>Specifies required libraries inside a module. New in Java 9</li>" +
                "<li><b>return:</b>Finished the execution of a method, and can be used to return a value from a method</li>" +
                "<li><b>short:</b>A data type that can store whole numbers from -32768 to 32767</li>" +
                "<li><b>static:</b>A non-access modifier used for methods and attributes. Static methods/attributes can be accessed without creating an object of a class</li>" +
                "<li><b>super:</b>Refers to superclass (parent) objects</li>" +
                "<li><b>switch:</b>Selects one of many code blocks to be executed</li>" +
                "<li><b>synchronized:</b>A non-access modifier, which specifies that methods can only be accessed by one thread at a time</li>" +
                "<li><b>this:</b>Refers to the current object in a method or constructor</li>" +
                "<li><b>throw:</b>Creates a custom error</li>" +
                "<li><b>throws:</b>Indicates what exceptions may be thrown by a method</li>" +
                "<li><b>try:</b>Creates a try...catch statement</li>" +
                "<li><b>var:</b>Declares a variable. New in Java 10</li>" +
                "<li><b>void:</b>Specifies that a method should not have a return value</li>" +
                "<li><b>while:</b>Creates a while loop</li>" +
                "</ol>"+
                "</body></html>";
        String htmlNotes5 ="<html><body>" +
                "<h2><u>Java ControlStatements :</U></h2>" +
                "<p></P>"+
                "<ol" +
                "<ol><li></li>" +
                "</ol>"+
                "</body></html>";
        String htmlNotes6 ="<html><body>" +
                "<h2><u>Java :</U></h2>" +
                "<p></P>"+
                "<ol" +
                "<ol><li></li>" +
                "</ol>"+
                "</body></html>";
        String htmlNotes7 ="<html><body>" +
                "<h2><u>Java :</U></h2>" +
                "<p></P>"+
                "<ol" +
                "<ol><li></li>" +
                "</ol>"+
                "</body></html>";
        String htmlNotes8 ="<html><body>" +
                "<h2><u>Java :</U></h2>" +
                "<p></P>"+
                "<ol" +
                "<ol><li></li>" +
                "</ol>"+
                "</body></html>";
        noteTextView1.setText(Html.fromHtml(htmlNotes1));
        noteTextView2.setText(Html.fromHtml(htmlNotes2));
        noteTextView3.setText(Html.fromHtml(htmlNotes3));
        noteTextView4.setText(Html.fromHtml(htmlNotes4));
        noteTextView5.setText(Html.fromHtml(htmlNotes5));
        noteTextView6.setText(Html.fromHtml(htmlNotes6));
        noteTextView7.setText(Html.fromHtml(htmlNotes7));
        noteTextView8.setText(Html.fromHtml(htmlNotes8));

    }
}



