package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PythonExceptionsActivity extends AppCompatActivity {
    private TextView noteTextView1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_exception);
        noteTextView1 = findViewById(R.id.PythonException);
        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h2><U>Python Exceptions :</U></h2>"+
                "<p>Error in Python can be of two types i.e. Syntax errors and Exceptions. Errors are problems in a program due to which the program will stop the execution. On the other hand, exceptions are raised when some internal events occur which change the normal flow of the program.</p>"+
                "<h3>Python Exception Types:</h3>"+
                "<p>In Python, there are several built-in Python exceptions that can be raised when an error occurs during the execution of a program. Here are some of the most common types of exceptions in Python:</p>"+
                "<ol>"+
                "<lI><b>SyntaxError:</b> This exception is raised when the interpreter encounters a syntax error in the code, such as a misspelled keyword, a missing colon, or an unbalanced parenthesis.</li>" +
                "<lI><b>TypeError:</b> This exception is raised when an operation or function is applied to an object of the wrong type, such as adding a string to an integer.</li>" +
                "<lI><b>NameError:</b> This exception is raised when a variable or function name is not found in the current scope.</li>" +
                "<lI><b>IndexError:</b>This exception is raised when an index is out of range for a list, tuple, or other sequence types.</li>" +
                "<lI><b>KeyError:</b> This exception is raised when a key is not found in a dictionary.</li>" +
                "<lI><b>ValueError:</b> This exception is raised when a function or method is called with an invalid argument or input, such as trying to convert a string to an integer when the string does not represent a valid integer.</li>" +
                "<lI><b>AttributeError:</b> This exception is raised when an attribute or method is not found on an object, such as trying to access a non-existent attribute of a class instance.</li>" +
                "<lI><b>IOError:</b> This exception is raised when an I/O operation, such as reading or writing a file, fails due to an input/output error.</li>" +
                "<lI><b>ZeroDivisionError:</b> This exception is raised when an attempt is made to divide a number by zero.</li>" +
                "<lI><b>ImportError:</b> This exception is raised when an import statement fails to find or load a module.</li>" +
                "</ol>"+
                "<h3>Python Exception Handling:</h3>"+
                "<p>Exception handling in Python allows you to handle errors or exceptions that occur during the execution of your program. This helps prevent your program from crashing and allows you to handle errors gracefully.\n" +
                "\n" +
                "There are several ways to handle exceptions in Python:</p>"+
                "<ul type='1'>" +
                "<LI><b>1. Try-except block: </b>The try-except block allows you to catch and handle exceptions that occur within a block of code. Here's an example:\n" +
                "\n" +
                "python\n" +
                "try:\n" +
                "# code that may raise an exception\n" +
                "x = 10 / 0\n" +
                "except ZeroDivisionError:\n" +
                "print(\"Cannot divide by zero\")\n" +
                "In this example, the ZeroDivisionError exception is caught and the message \"Cannot divide by zero\" is printed.</li>" +
                "<LI><b>2. Try-except-else block:</b> You can also use the try-except-else block to handle exceptions that occur within a block of code, and execute code if no exceptions are raised. Here's an example:\n" +
                "\n" +
                "python\n" +
                "try:\n" +
                "x = 10 / 2\n" +
                "except ZeroDivisionError:\n" +
                "print(\"Cannot divide by zero\")\n" +
                "else:\n" +
                "print(\"Division successful\")\n" +
                          "In this example, the \"Division successful\" message is printed if no exceptions are raised.</li>" +
                "<LI><b>3. Try-except-finally block:</b> The try-except-finally block allows you to execute cleanup code, such as closing files or database connections, regardless of whether an exception is raised. Here's an example:\n" +
                "\n" +
                "python\n" +
                "try:\n" +
                "f = open(\"example.txt\", \"r\")\n" +
                "# code that may raise an exception\n" +
                "except FileNotFoundError:\n" +
                "print(\"File not found\")\n" +
                "finally:\n" +
                "f.close()\n" +
                "In this example, the file is closed in the finally block, even if an exception is raised.\n</li>" +
                "<LI><b>4. Raise an exception: You can also raise your own exceptions using the raise statement. Here's an example:\n" +
                "\n" +
                "python\n" +
                "x = -1\n" +
                "if x < 0:\n" +
                "raise ValueError(\"Number must be positive\")\n" +
                "\n" +
                "\n" +
                "In this example, a ValueError exception is raised if the number is negative.</b></li>" +
                "</ul>"+
                "<h4>Advantages of Exception Handling:</h4>"+
                "<ul type='1'>" +
                "<LI><b>Improved program reliability:</b> By handling exceptions properly, you can prevent your program from crashing or producing incorrect results due to unexpected errors or input.</li>" +
                "<LI><b>Simplified error handling:</b> Exception handling allows you to separate error handling code from the main program logic, making it easier to read and maintain your code.</li>" +
                "<LI><b>Cleaner code:</b> With exception handling, you can avoid using complex conditional statements to check for errors, leading to cleaner and more readable code.</li>" +
                "<LI><b>Easier debugging:</b> When an exception is raised, the Python interpreter prints a traceback that shows the exact location where the exception occurred, making it easier to debug your code.</li>" +
                "<LI><b></li>" +
                "</ul>"+
                "<h4>Disadvantages of Exception Handling:</h4>"+
                "<ul type='1'>" +
                "<LI><b>Performance overhead:</b> Exception handling can be slower than using conditional statements to check for errors, as the interpreter has to perform additional work to catch and handle the exception.</li>" +
                "<LI><b>Increased code complexity:</b> Exception handling can make your code more complex, especially if you have to handle multiple types of exceptions or implement complex error handling logic.</li>" +
                "<LI><b>Possible security risks:</b> Improperly handled exceptions can potentially reveal sensitive information or create security vulnerabilities in your code, so it’s important to handle exceptions carefully and avoid exposing too much information about your program.</li>" +
                "</ul>"+
                "</body></html>";

        noteTextView1.setText(Html.fromHtml(htmlNotes1));

    }
}


