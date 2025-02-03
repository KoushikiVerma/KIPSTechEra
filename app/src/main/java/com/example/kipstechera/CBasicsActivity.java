package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CBasicsActivity extends AppCompatActivity {
    private TextView noteTextView1;
    private TextView noteTextView2;
    private TextView noteTextView3;
    private TextView noteTextView4;
    private TextView noteTextView5;
    private TextView noteTextView6;
    private TextView noteTextView7;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_basics);

        noteTextView1 = findViewById(R.id.C_CPP_DataTypes);
        noteTextView2 = findViewById(R.id.C_CPP_Variables);
        noteTextView3 = findViewById(R.id.C_CPP_Operators);
        noteTextView4 = findViewById(R.id.C_CPP_ControlStatements);
        noteTextView5 = findViewById(R.id.C_CPP_String);
        noteTextView6 = findViewById(R.id.C_CPP_Arrays);
        noteTextView7 = findViewById(R.id.C_CPP_Comments);
        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center'><u>Basics of C and C++</u></h1>" +
                "<h2><U>C DataTypes</U></h2>"+
                "<p>Data types specify the different sizes and values that can be stored in the variable. In C programming language, there are several data types that are used to define variables. Some of the common data types in C include:</p>"+
                "<ol>" +
                "<lI><b>1. int:</b> Used to store integer values.</li>" +
                "<lI><b>2. float:</b>Used to store floating-point numbers.</li>" +
                "<lI><b>3. double:</b> Used to store double-precision floating-point numbers.</li>" +
                "<lI><b>4. char:</b> Used to store single characters.</li>" +
                "<lI><b>5. short:</b> Used to store integers with a smaller range than int.</li>" +
                "<lI><b>6. long:</b> Used to store integers with a larger range than int.</li>" +
                "<lI><b>7. unsigned int:</b> Used to store non-negative integer values.</li>" +
                "<lI><b>8. long:</b> Used to store large integer values.</li>" +
                "<lI><b>9. unsigned char:</b> Used to store non-negative single characters.</li>" +
                "<lI><b>10. void:</b> Used to specify that a function does not return any value.</li>" +
                "<lI><b></li>" +
                "<lI><b></li>" +
                "<lI><b></li>" +
                "</ol>"+
                "<h2><U>C++ DataTypes</U></h2>"+
                "<p> In C++ programming language, there are several data types that are used to define variables. Some of the common data types in C include:</p>"+
                "<ol>" +
                "<lI><b>1. Integer (int):</b> Used to store whole numbers without decimal points.</li>" +
                "<lI><b>2. Double:</b> Used to store floating-point numbers with decimal points.</li>" +
                "<lI><b>3. Character (char):</b> Used to store single characters such as letters, digits, or symbols.</li>" +
                "<lI><b>4. Boolean (bool):</b> Used to store true or false values.</li>" +
                "<lI><b>5. String:</b> Used to store a sequence of characters.</li>" +
                "<lI><b>6. Array:</b> Used to store a collection of elements of the same data type.</li>" +
                "<lI><b>7. Pointer: </b>Used to store memory addresses of variables.</li>" +
                "<lI><b>8. Enum:</b> Used to define a set of named constants.</li>" +
                "<lI><b>9. Void:</b> Used to indicate that a function does not return any value.</li>" +
                "<lI><b>10. Struct:</b> Used to define a custom data type that can store multiple variables of different data types.</li>" +
                "<lI><b></li>" +
                "<lI><b></li>" +
                "</ol>"+
                "</body></html>";


        String htmlNotes2 = "<html><body>" +
                "<h2><u>C Variables:</U></h2>"+
                "<p>A variable in C is a memory location with some name that helps store some form of data and retrieves it when required. We can store different types of data in the variable and reuse the same variable for storing some other data any number of times.</p>"+
                "<h5>C Variable Syntax</h5>"+
                "<p>The syntax to declare a variable in C specifies the name and the type of the variable.\n" +
                "\ndata_type variable_name = value;    // defining single variable\n" +
                "            or\n" +
                "data_type variable_name1, variable_name2;    // defining multiple variable\n" +
                "\n" +
                "Here,\n" +
                "\n" +
                "data_type: Type of data that a variable can store.\n" +
                "variable_name: Name of the variable given by the user.\n" +
                "value: value assigned to the variable by the user.</p>"+
                "<h5>C Variable Example:</h5>"+
                "<p>int var;    // integer variable\n" +
                "char a;     // character variable\n" +
                "float fff;  // float variables</p>"+
                "<h5>Rules for Naming Variables in C:</h5>"+
                "<ol>" +
                "<li>A variable name must only contain alphabets, digits, and underscore.</li>" +
                "<li>A variable name must start with an alphabet or an underscore only. It cannot start with a digit.</li>" +
                "<li>No whitespace is allowed within the variable name.</li>" +
                "<li>A variable name must not be any reserved word or keyword.</li>" +
                "<li></li>" +
                "</ol>"+
                "<h4>C Variable Types:</h4>"+
                "<ol>"+
                "<lI><b>Local Variables in C:</b>A Local variable in C is a variable that is declared inside a function or a block of code. Its scope is limited to the block or function in which it is declared.</li>" +
                "<lI><b>Global Variables in C:</b>A Global variable in C is a variable that is declared outside the function or a block of code. Its scope is the whole program i.e. we can access the global variable anywhere in the C program after it is declared.</li>" +
                "<lI><b>Static Variables in C:</b>A static variable in C is a variable that is defined using the static keyword. It can be defined only once in a C program and its scope depends upon the region where it is declared (can be global or local).</li>" +
                "<lI><b>Automatic Variable in C:</b>All the local variables are automatic variables by default. They are also known as auto variables.\n" +
                "\n" +
                "Their scope is local and their lifetime is till the end of the block. If we need, we can use the auto keyword to define the auto variables.\n" +
                "\n" +
                "The default value of the auto variables is a garbage value.</li>" +
                "<lI><b>External Variables in C:</b>External variables in C can be shared between multiple C files. We can declare an external variable using the extern keyword.\n" +
                "\n" +
                "Their scope is global and they exist between multiple C files.</li>" +
                "<lI><b>Register Variables in C:</b>Register variables in C are those variables that are stored in the CPU register instead of the conventional storage place like RAM. Their scope is local and exists till the end of the block or a function.\n" +
                "\n" +
                "These variables are declared using the register keyword.\n" +
                "\n" +
                "The default value of register variables is a garbage value.</li>" +
                "<lI><b>Constant Variable in C:</b>A constant variable in C is a read-only variable whose value cannot be modified once it is defined. We can declare a constant variable using the const keyword.</li>" +
                "</ol>"+
                "<h2><u>C++ Variables:</U></h2>"+
                "<p>Variables are an essential part of C++ programming. They allow us to store data and use it in our programs.Variables in C++ is a name given to a memory location. It is the basic unit of storage in a program. \n" +
                "\n" +
                "The value stored in a variable can be changed during program execution.\n" +
                "A variable is only a name given to a memory location, all the operations done on the variable effects that memory location.\n" +
                "In C++, all the variables must be declared before use.\n</p>"+
                "<h5>Declaring Variable in c++</h5>"+
                "<p>A typical variable declaration is of the form: \n" +
                "\n" +
                "// Declaring a single variable\n" +
                "type variable_name;\n" +
                "\n" +
                "// Declaring multiple variables:\n" +
                "type variable1_name, variable2_name, variable3_name;\n" +
                "A variable name can consist of alphabets (both upper and lower case), numbers, and the underscore ‘_’ character. However, the name must not start with a number." +
                "datatype: Type of data that can be stored in this variable. \n" +
                "variable_name: Name given to the variable. \n" +
                "value: It is the initial value stored in the variable.</p>"+
                "<h5>Example of Variable Declaration</h5>"+
                "<p>// Declaring float variable\n" +
                "float simpleInterest; \n" +
                "\n" +
                "// Declaring integer variable\n" +
                "int time, speed; \n" +
                "\n" +
                "// Declaring character variable\n" +
                "char var;  \n" +
                "We can also provide values while declaring the variables as given below:\n" +
                "int a=50,b=100;  //declaring 2 variable of integer type    \n" +
                "float f=50.8;  //declaring 1 variable of float type     \n" +
                "char c='Z';    //declaring 1 variable of char type</p>"+
                "<h5>Rules for Naming Variables in C++:</h5>"+
                "<ol>" +
                "<li>The name of the variable contains letters, digits, and underscores.</li>" +
                "<li>The name of the variable is case sensitive (ex Arr and arr both are different variables).</li>" +
                "<li>The name of the variable does not contain any whitespace and special characters (ex #,$,%,*, etc).</li>" +
                "<li>All the variable names must begin with a letter of the alphabet or an underscore(_). </li>" +
                "<li>We cannot used C++ keyword(ex float,double,class)as a variable name.</li>" +
                "<li></li>" +
                "</ol>"+
                "<h4>C++ Variable Types:</h4>"+
                "<ol>" +
                "<li><b>Local Variables:</b><p>A variable defined within a block or method or constructor is called a local variable. \n" +
                "These variables are created when entered into the block or the function is called and destroyed after exiting from the block or when the call returns from the function.\n" +
                "The scope of these variables exists only within the block in which the variable is declared. i.e. we can access this variable only within that block.\n" +
                "Initialization of Local Variable is Mandatory.</p></li>" +
                "<li><b>Instance Variables:</b><p>Instance variables are non-static variables and are declared in a class outside any method, constructor, or block. \n" +
                "As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.\n" +
                "Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier then the default access specifier will be used.\n" +
                "Initialization of Instance Variable is not Mandatory.\n" +
                "Instance Variable can be accessed only by creating objects.</p></li>" +
                "<li><b>Static Variables:</b><p>Static variables are also known as Class variables. \n" +
                "These variables are declared similarly as instance variables, the difference is that static variables are declared using the static keyword within a class outside any method constructor or block.\n" +
                "Unlike instance variables, we can only have one copy of a static variable per class irrespective of how many objects we create.\n" +
                "Static variables are created at the start of program execution and destroyed automatically when execution ends.\n" +
                "Initialization of Static Variable is not Mandatory. Its default value is 0\n" +
                "If we access the static variable like the Instance variable (through an object), the compiler will show the warning message and it won’t halt the program. The compiler will replace the object name with the class name automatically.\n" +
                "If we access the static variable without the class name, the Compiler will automatically append the class name.</p></li>" +
                "<li><b>:</b><p></p></li>" +
                "</ol>"+
                "</body></html>";
        String htmlNotes3 ="<html><body>" +
                "<h2><u>C Operators:</U></h2>" +
                "<p>An operator in C can be defined as the symbol that helps us to perform some specific mathematical, relational, bitwise, conditional, or logical computations on values and variables. The values and variables used with operators are called operands. So we can say that the operators are the symbols that perform operations on operands.</p>"+
               "<ol>"+
                "<li><b>Arithmetic Operators:</b><p>These operators are used to perform mathematical operations on numbers. The arithmetic operators in C are:\n" +
                "Addition (+): This operator adds two numbers and returns the sum.\n" +
                "Subtraction (-): This operator subtracts two numbers and returns the difference.\n" +
                "Multiplication (*): This operator multiplies two numbers and returns the product.\n" +
                "Division (/): This operator divides two numbers and returns the quotient.\n" +
                "Modulus (%): This operator returns the remainder of the division of two numbers.</p></li>" +
                "<li><b>Relational Operators:</b><p>These operators are used to compare two values and return a Boolean value (true or false). The relational operators in C are:\n" +
                "Equal to (==): This operator returns true if the two values are equal, and false otherwise.\n" +
                "Not equal to (!=): This operator returns true if the two values are not equal, and false otherwise.\n" +
                "Greater than (>): This operator returns true if the left operand is greater than the right operand, and false otherwise.\n" +
                "Less than (<): This operator returns true if the left operand is less than the right operand, and false otherwise.\n" +
                "Greater than or equal to (>=): This operator returns true if the left operand is greater than or equal to the right operand, and false otherwise.\n" +
                "Less than or equal to (<=): This operator returns true if the left operand is less than or equal to the right operand, and false otherwise.</p></li>" +
                "<li><b>Logical Operators:</b><p>These operators are used to combine two Boolean values and return a single Boolean value. The logical operators in C are:\n" +
                "And (&&): This operator returns true if both operands are true, and false otherwise.\n" +
                "Or (||): This operator returns true if either operand is true, and false otherwise.\n" +
                "Not (!): This operator reverses the truth value of its operand.</p></li>" +
                "<li><b>Assignment Operators:</b><p>These operators are used to assign a value to a variable. The assignment operators in C are:\n" +
                "Simple assignment (=): This operator assigns the value of the right operand to the variable on the left.\n" +
                "Addition assignment (+=): This operator adds the value of the right operand to the variable on the left and assigns the result to the variable on the left.\n" +
                "Subtraction assignment (-=): This operator subtracts the value of the right operand from the variable on the left and assigns the result to the variable on the left.\n" +
                "Multiplication assignment (*=): This operator multiplies the value of the right operand by the variable on the left and assigns the result to the variable on the left.\n" +
                "Division assignment (/=): This operator divides the value of the variable on the left by the value of the right operand and assigns the result to the variable on the left.\n" +
                "Modulus assignment (%=): This operator assigns the remainder of the division of the value of the variable on the left by the value of the right operand to the variable on the left.\n</p></li>" +
                "<li><b>Increment and Decrement Operators:</b><p>These operators are used to increment or decrement the value of a variable by 1. The increment and decrement operators in C are:\n" +
                "Increment (++) operator: This operator increments the value of its operand by 1.\n" +
                "Decrement (--) operator: This operator decrements the value of its operand by 1.</p></li>" +
                "<li><b>Conditional Operator:</b><p>This operator is also known as the ternary operator. It takes three operands and returns one of two values depending on the value of the first operand. The conditional operator in C is:\n" +
                "Conditional operator (?:): This operator takes three operands: a condition, a value to return if the condition is true, and a value to return if the condition is false.</p></li>" +
                "<li><b>Bitwise Operators:</b><p>These operators are used to perform bit-level operations on numbers. The bitwise operators in C are:\n" +
                "Bitwise AND (&): This operator performs a bitwise AND operation on two numbers and returns a number with the bits that are set in both numbers set to 1, and the bits that are not set in either number set to 0.\n" +
                "Bitwise OR (|): This operator performs a bitwise OR operation on two numbers and returns a number with the bits that are set in either number set to 1.\n" +
                "Bitwise XOR (^): This operator performs a bitwise XOR operation on two numbers and returns a number with the bits that are set in one number but not the other set to 1, and the bits that are set in both numbers set to 0.\n" +
                "Bitwise NOT (~): This operator performs a bitwise NOT operation on a number and returns a number with the bits that are set in the original number set to</p></li>" +
                "<li><b>:</b><p></p></li>" +
                "<li><b>:</b><p></p></li>" +
                "</ol>"+
                "<h2><u>C++ Operators:</U></h2>" +
                "<ol>"+
                "<li><b>Arithmetic Operators:</b><p>These operators perform basic mathematical operations like addition, subtraction, multiplication, and division.\n" +
                "+: - Addition\n" +
                "-: - Subtraction\n" +
                ": * - Multiplication\n" +
                "/: - Division\n" +
                "%: - Modulus (remainder)\n</p></li>" +
                "<li><b>Assignment Operators:</b><p>These operators are used to assign values to variables.\n" +
                "=: - Assigns a value to a variable\n" +
                "+=: - Adds a value to a variable\n" +
                "-=: - Subtracts a value from a variable\n" +
                "\\*=: - Multiplies a variable by a value\n" +
                "\\/: =** - Divides a variable by a value\n" +
                "%=: - Assigns the remainder of a division operation to a variable\n</p></li>" +
                "<li><b>Relational Operators:</b><p>These operators compare the values of two operands.\n" +
                "==: - Equal to\n" +
                "!=: - Not equal to\n" +
                "<: - Less than\n" +
                ">: - Greater than\n" +
                "<=: - Less than or equal to\n" +
                ">=: - Greater than or equal to</p></li>" +
                "<li><b>Logical Operators:</b><p>These operators combine two or more conditions/constraints.\n" +
                "&&: - Logical AND\n" +
                "||: - Logical OR\n" +
                "!: - Logical NOT\n</p></li>" +
                "<li><b>Bitwise Operators:</b><p>These operators perform bit-level operations on operands.\n" +
                "&: - Bitwise AND\n" +
                "|: - Bitwise OR\n" +
                "^: - Bitwise XOR\n" +
                "~: - Bitwise NOT\n" +
                "<<: - Left shift\n" +
                ">>: - Right shift\n</p></li>" +
                "<li><b>Other Operators:</b><p>sizeof: - Returns the size of an operand in bytes\n" +
                "&: - Returns the address of an operand\n" +
                ": * - Dereferences an operand\n" +
                "->: - Member access operator\n" +
                ".: - Dot operator\n" +
                ",: - Comma operator</p></li>" +
                "<li><b>:</b><p></p></li>" +
                "<li><b>:</b><p></p></li>" +
                "</ol>"+
                "<p></p>"+
                "</body></html>";
        String htmlNotes4 ="<html><body>" +
                "<h2><u></U></h2>" +
                "</body></html>";
        String htmlNotes5 ="<html><body>" +
                "<h2><u></U></h2>" +
                "<p></P>"+
                "<ol" +
                "<ol><li></li>" +
                "</ol>"+
                "</body></html>";
        String htmlNotes6 ="<html><body>" +
                "<h2><u></U></h2>" +
                "<p></P>"+
                "<ol" +
                "<ol><li></li>" +
                "</ol>"+
                "</body></html>";
        String htmlNotes7 ="<html><body>" +
                "<h2><u></U></h2>" +
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

    }
}



