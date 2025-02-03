package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class COverviewActivity extends AppCompatActivity {
    private TextView noteTextView1;
    private TextView noteTextView2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_overview);
        noteTextView1 = findViewById(R.id.CIntro);
        noteTextView2 = findViewById(R.id.CPPIntro);
        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center'><u>C an C++ Overview</u></h1>" +
                "<h2><U>Introduction to C:</U></h2>"+
                "<p>C is a powerful and widely-used programming language that was developed in the early 1970s by Dennis Ritchie at Bell Labs. It is known for its efficiency, flexibility, and portability, making it a popular choice for a wide range of applications, from operating systems and system software to games and applications.\n" +
                "\n" +
                "C is a low-level language, meaning that it provides a high level of control over the hardware and memory of a computer. This makes it ideal for writing programs that require precise control over system resources, such as device drivers or operating systems.</p>"+
                "<h3>Features of C:</h3>"+
                "<p></p>"+
                "<ol>"+
                "<lI><b>Procedural programming language:</b> C is a procedural programming language, which means that it follows a top-down approach to solving problems.</li>" +
                "<lI><b>Low-level language:</b> C is considered a low-level language because it allows direct manipulation of memory addresses and hardware.</li>" +
                "<lI><b>Portability:</b> C is a portable language, meaning that programs written in C can be run on different platforms with minimal modifications</li>" +
                "<lI><b>Efficiency:</b> C is known for its efficiency in terms of speed and memory usage. It allows for direct access to hardware, which can result in faster performance.</li>" +
                "<lI><b>Extensibility:</b> C allows for the creation of user-defined functions and data types, making it highly extensible.</li>" +
                "<lI><b>Standard library:</b> C comes with a standard library that provides a wide range of functions for tasks such as input/output, string manipulation, and memory allocation.</li>" +
                "<lI><b>Pointers:</b> C supports the use of pointers, which are variables that store memory addresses. Pointers are used for tasks such as dynamic memory allocation and passing functions as arguments.</li>" +
                "<lI><b>Control structures:</b> C provides a variety of control structures, such as loops and conditional statements, to control the flow of a program.</li>" +
                "<lI><b>Preprocessor directives:</b> C allows for the use of preprocessor directives, which are commands that are processed before the compilation of the program. Directives are used for tasks such as including header files and defining constants.</li>" +
                "<lI><b>Recursion: </b>C supports recursion, which is the ability of a function to call itself. Recursion is useful for solving problems that can be broken down into smaller subproblems.</li>" +
                "<h3>History of C:</h3>"+
                "<lI>C is one of the high-level programming languages developed by Dennis Ritchie.</li>" +
                "<lI>C was originally developed for UNIX operating system to beat the issues of previous languages such as B, BCPL, etc.</li>" +
                "<lI>The UNIX operating system development started in the year 1969, and its code was rewritten in C in the year 1972.</li>" +
                "<lI>The UNIX operating system development started in the year 1969, and its code was rewritten in C in the year 1972.</li>" +
                "<lI>In 1985, Windows 1.0 was released. Even though Windows source code isn’t publicly available on the market, it’s been stated that its kernel is mostly written in C.</li>" +
                "<lI>In 1991, Linux kernel development started, and it’s additionally written in C.</li>" +
                "<lI>After a year it was released under the GNU license and was used as part of the GNU Operating System.</li>" +
                "<lI>The GNU operating system was started using C and Lisp programming languages. So, many of its components are written in C.</li>" +
                "<lI>In 1977, Oracle database development started, and in 1983 its code was rewritten from assembly to C. It became one in all the foremost widespread databases within the world.</li>" +
                "<lI>Now a days C is exclusively used for building OS, application packages and customized software. Because of its power and efficiency, it has gained more popularity.</li>" +
                "<lI>C is increasingly used by system programmers, application developers and researchers for a spread of programming tasks.</li>" +
                "<lI></li>" +
                "<lI></li>" +
                "</ol>"+
                "</body></html>";

        String htmlNotes2 = "<html><body>" +
                "<h2><U>Introduction to C++ :</U></h2>"+
                "<p>C++ is a powerful and versatile programming language that is widely used for developing software applications, games, and system software. It is an extension of the C programming language, with added features such as object-oriented programming and generic programming capabilities.\n" +
                "\n" +
                "C++ is known for its high performance and efficiency, making it a popular choice for developing applications that require speed and resource optimization. It also offers a wide range of libraries and tools that help developers create complex and sophisticated programs.</p>"+
                "<h3>Features of C++:</h3>"+
                "<p>C++ has a number of features, including:</p>"+
                "<ol>"+
                "<lI><b>Object-Oriented Programming:</b>C++ is an Object-Oriented Programming Language, unlike C which is a procedural programming language. This is the most important feature of C++. It can create/destroy objects while programming. Also, It can create blueprints with which objects can be created.</li>" +
                "<lI><b>Machine Independent:</b>A C++ executable is not platform-independent (compiled programs on Linux won’t run on Windows), however, they are machine-independent. Let us understand this feature of C++ with the help of an example. Suppose you have written a piece of code that can run on Linux/Windows/Mac OSx which makes the C++ Machine Independent but the executable file of the C++ cannot run on different operating systems.</li>" +
                "<lI><b>Simple:</b>It is a simple language in the sense that programs can be broken down into logical units and parts, has rich library support and has a variety of data types. Also, the Auto Keyword of C++ makes life easier.</li>" +
                "<lI><b>High-Level Language:</b>C++ is a High-Level Language, unlike C which is a Mid-Level Programming Language. It makes life easier to work in C++ as it is a high-level language it is closely associated with the human-comprehensible English language.</li>" +
                "<lI><b>Popular:</b>C++ can be the base language for many other programming languages that supports the feature of object-oriented programming. Bjarne Stroustrup found Simula 67, the first object-oriented language ever, lacking simulations, and decided to develop C++.</li>" +
                "<lI><b>Case-sensitive:</b>It is clear that C++ is a case-sensitive programming language. For example, cin is used to take input from the input stream. But if the “Cin” won’t work. Other languages like HTML and MySQL are not case-sensitive languages.</li>" +
                "<lI><b>Compiler Based:</b>C++ is a compiler-based language, unlike Python. That is C++ programs used to be compiled and their executable file is used to run them. C++ is a relatively faster language than Java and Python.</li>" +
                "<lI><b>Dynamic Memory Allocation:</b>When the program executes in C++ then the variables are allocated the dynamical heap space. Inside the functions, the variables are allocated in the stack space. Many times, We are not aware in advance how much memory is needed to store particular information in a defined variable and the size of required memory can be determined at run time.</li>" +
                "<lI><b>Memory Management:</b>C++ allows us to allocate the memory of a variable or an array in run time. This is known as Dynamic Memory Allocation.\n" +
                "In other programming languages such as Java and Python, the compiler automatically manages the memories allocated to variables. But this is not the case in C++.\n" +
                "In C++, the memory must be de-allocated dynamically allocated memory manually after it is of no use.\n" +
                "The allocation and deallocation of the memory can be done using the new and delete operators respectively.</li>" +
                "<lI><b>Multi-threading:</b>Multithreading is a specialized form of multitasking and multitasking is a feature that allows your system to execute two or more programs concurrently. In general, there are two sorts of multitasking: process-based and thread-based.\n" +
                "Process-based multitasking handles the concurrent execution of programs. Thread-based multitasking deals with the multiprogramming of pieces of an equivalent program.\n" +
                "A multithreaded program contains two or more parts that will run concurrently. Each part of such a program is named a thread, and every thread defines a separate path of execution.\n" +
                "C++ doesn’t contain any built-in support for multithreaded applications. Instead, it relies entirely upon the OS to supply this feature.</li>" +
                "</ol>"+
                "<h3>History of C++:</h3>"+
                "<p>The C++ programming language has a history going back to 1979, when Bjarne Stroustrup was doing work for his Ph.D. thesis. He began work on \"C with Classes\", which as the name implies was meant to be a superset of the C language. His goal was to add object-oriented programming into the C language, which was and still is a language well-respected for its portability without sacrificing speed or low-level functionality.\n" +
                "\n" +
                "His language included classes, basic inheritance, inlining, default function arguments, and strong type checking in addition to all the features of the C language. The first C with Classes compiler was called Cfront, which was derived from a C compiler called CPre. It was a program designed to translate C with Classes code to ordinary C.\n" +
                "\n" +
                "In 1983, the name of the language was changed from C with Classes to C++. The ++ operator in the C language is an operator for incrementing a variable, which gives some insight into how Stroustrup regarded the language. Many new features were added around this time, the most notable of which are virtual functions, function overloading, references with the & symbol, the const keyword, and single-line comments using two forward slashes.\n" +
                "\n" +
                "In 1985, C++ was implemented as a commercial product. The language was not officially standardized yet. The language was updated again in 1989 to include protected and static members, as well as an inheritance from several classes.\n" +
                "\n" +
                "In 1990, Turbo C++ was released as a commercial product. Turbo C++ added a lot of additional libraries which have had a considerable impact on C++'s development.\n" +
                "\n" +
                "In 1998, the C++ standards committee published the first international standard for C++ ISO/IEC 14882:1998, which is informally known as C++98. The Standard Template Library, which began its conceptual development in 1979, was also included. In 2003, the committee responded to multiple problems that were reported with their 1998 standard and revised it accordingly. The changed language was named C++03.\n" +
                "\n" +
                "In mid-2011, the new C++ standard (C++11) was finished. The new features included Regex support, a randomization library, a new C++ time library, atomics support, a standard threading library, a new for loop syntax providing functionality similar to for each loops in certain other languages, the auto keyword, new container classes, better support for unions and array-initialization lists and variadic templates.</p>"+
                "</body></html>";
        noteTextView1.setText(Html.fromHtml(htmlNotes1));
        noteTextView2.setText(Html.fromHtml(htmlNotes2));

    }
}
