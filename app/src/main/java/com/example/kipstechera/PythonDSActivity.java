package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PythonDSActivity extends AppCompatActivity {
    private TextView noteTextView1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_ds);
    noteTextView1=findViewById(R.id.PythonDS);
    displayNotes();
    }
    private void displayNotes(){
        String htmlNotes1="<html><body>" +
                "<h1><U>Python Data Structure:</U></h1>"+
                "<p>Organizing, managing and storing data is important as it enables easier access and efficient modifications. Data Structures allows you to organize your data in such a way that enables you to store collections of data, relate them and perform operations on them accordingly.</p>"+
                "<h2>Types of Data Structures in Python</h2>"+
                "<p>Python has implicit support for Data Structures which enable you to store and access data. These structures are called List, Dictionary, Tuple and Set.\n" +
                "\n" +
                "Python allows its users to create their own Data Structures enabling them to have full control over their functionality. The most prominent Data Structures are Stack, Queue, Tree, Linked List and so on which are also available to you in other programming languages. So now that you know what are the types available to you, why don’t we move ahead to the Data Structures and implement them using Python.</p>"+
               "<h5>1. Built-in Data Structures</h5>"+
                "<p>As the name suggests, these Data Structures are built-in with Python which makes programming easier and helps programmers use them to obtain solutions faster. Let’s discuss each of them in detail.</p>"+
                "<ol>" +
                "<h6><b>1.1 Lists:</b><h6>" +
                "<p>Lists are used to store data of different data types in a sequential manner. There are addresses assigned to every element of the list, which is called as Index. The index value starts from 0 and goes on until the last element called the positive index. There is also negative indexing which starts from -1 enabling you to access elements from the last to first.</p>" +
                "<li><b>Creating a list</b><p>To create a list, you use the square brackets and add elements into it accordingly. If you do not pass any elements inside the square brackets, you get an empty list as the output.\n" +
                "my_list = [] #create empty list\n" +
                "print(my_list)\n" +
                "my_list = [1, 2, 3, 'example', 3.132] #creating list with data\n" +
                "print(my_list)" +
                "Output:\n" +
                "[]\n" +
                "[1, 2, 3, ‘example’, 3.132]\n" +
                "\n</p></li>" +
                "<li><b>Adding Elements</b><p>Adding the elements in the list can be achieved using the append(), extend() and insert() functions.\n" +
                "\n" +
                "The append() function adds all the elements passed to it as a single element.\n" +
                "The extend() function adds the elements one-by-one into the list.\n" +
                "The insert() function adds the element passed to the index value and increase the size of the list too." +
                "my_list = [1, 2, 3]\n" +
                "print(my_list)\n" +
                "my_list.append([555, 12]) #add as a single element\n" +
                "print(my_list)\n" +
                "my_list.extend([234, 'more_example']) #add as different elements\n" +
                "print(my_list)\n" +
                "my_list.insert(1, 'insert_example') #add element i\n" +
                "print(my_list)" +
                "Output:\n" +
                "[1, 2, 3]\n" +
                "[1, 2, 3, [555, 12]]\n" +
                "[1, 2, 3, [555, 12], 234, ‘more_example’]\n" +
                "[1, ‘insert_example’, 2, 3, [555, 12], 234, ‘more_example’]</p></li>" +
                "<li><b>Deleting Elements</b><p>To delete elements, use the del keyword which is built-in into Python but this does not return anything back to us.\n" +
                "If you want the element back, you use the pop() function which takes the index value.\n" +
                "To remove an element by its value, you use the remove() function." +
                "Example:" +
                "my_list = [1, 2, 3, 'example', 3.132, 10, 30]\n" +
                "del my_list[5] #delete element at index 5\n" +
                "print(my_list)\n" +
                "my_list.remove('example') #remove element with value\n" +
                "print(my_list)\n" +
                "a = my_list.pop(1) #pop element from list\n" +
                "print('Popped Element: ', a, ' List remaining: ', my_list)\n" +
                "my_list.clear() #empty the list\n" +
                "print(my_list)" +
                "Output:\n" +
                "[1, 2, 3, ‘example’, 3.132, 30]\n" +
                "[1, 2, 3, 3.132, 30]\n" +
                "Popped Element: 2 List remaining: [1, 3, 3.132, 30]\n" +
                "[]</p></li>" +
                "<li><b>Accessing Elements</b><p>Accessing elements is the same as accessing Strings in Python. You pass the index values and hence can obtain the values as needed." +
                "my_list = [1, 2, 3, 'example', 3.132, 10, 30]\n" +
                "for element in my_list: #access elements one by one\n" +
                "    print(element)\n" +
                "print(my_list) #access all elements\n" +
                "print(my_list[3]) #access index 3 element\n" +
                "print(my_list[0:2]) #access elements from 0 to 1 and exclude 2\n" +
                "print(my_list[::-1]) #access elements in reverse\n" +
                "Output:\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "example\n" +
                "3.132\n" +
                "10\n" +
                "30\n" +
                "[1, 2, 3, ‘example’, 3.132, 10, 30]\n" +
                "example\n" +
                "[1, 2]\n" +
                "[30, 10, 3.132, ‘example’, 3, 2, 1]</p></li>" +
                "<li><b></li>" +
                "</ol>"+
                "<h6><b>1.2 Dictionary:</b><h6>" +
                "<p>Dictionaries are used to store key-value pairs. To understand better, think of a phone directory where hundreds and thousands of names and their corresponding numbers have been added. Now the constant values here are Name and the Phone Numbers which are called as the keys. And the various names and phone numbers are the values that have been fed to the keys. If you access the values of the keys, you will obtain all the names and phone numbers. So that is what a key-value pair is. And in Python, this structure is stored using Dictionaries.</p>"+
                "<ol>"+
                "<li><b>Creating a Dictionary</b><p>Dictionaries can be created using the flower braces or using the dict() function. You need to add the key-value pairs whenever you work with dictionaries." +
                "my_dict = {} #empty dictionary\n" +
                "print(my_dict)\n" +
                "my_dict = {1: 'Python', 2: 'Java'} #dictionary with elements\n" +
                "print(my_dict)\n" +
                "Output:\n" +
                "{}\n" +
                "{1: ‘Python’, 2: ‘Java’}</p></li>" +
                "<li><b>Changing and Adding key, value pairs</b><p>To change the values of the dictionary, you need to do that using the keys. So, you firstly access the key and then change the value accordingly. To add values, you simply just add another key-value pair as shown below.\n" +
                "my_dict = {'First': 'Python', 'Second': 'Java'}\n" +
                "print(my_dict)\n" +
                "my_dict['Second'] = 'C++' #changing element\n" +
                "print(my_dict)\n" +
                "my_dict['Third'] = 'Ruby' #adding key-value pair\n" +
                "print(my_dict)\n" +
                "Output:\n" +
                "{‘First’: ‘Python’, ‘Second’: ‘Java’}\n" +
                "{‘First’: ‘Python’, ‘Second’: ‘C++’}\n" +
                "{‘First’: ‘Python’, ‘Second’: ‘C++’, ‘Third’: ‘Ruby’}</p></li>" +
                "<li><b>Deleting key, value pairs</b><p>To delete the values, you use the pop() function which returns the value that has been deleted.\n" +
                "To retrieve the key-value pair, you use the popitem() function which returns a tuple of the key and value.\n" +
                "To clear the entire dictionary, you use the clear() function.\n" +
                "my_dict = {'First': 'Python', 'Second': 'Java', 'Third': 'Ruby'}\n" +
                "a = my_dict.pop('Third') #pop element\n" +
                "print('Value:', a)\n" +
                "print('Dictionary:', my_dict)\n" +
                "b = my_dict.popitem() #pop the key-value pair\n" +
                "print('Key, value pair:', b)\n" +
                "print('Dictionary', my_dict)\n" +
                "my_dict.clear() #empty dictionary\n" +
                "print('n', my_dict)\n" +
                "Output:\n" +
                "\n" +
                "Value: Ruby\n" +
                "Dictionary: {‘First’: ‘Python’, ‘Second’: ‘Java’}\n" +
                "\n" +
                "Key, value pair: (‘Second’, ‘Java’)\n" +
                "Dictionary {‘First’: ‘Python’}\n" +
                "\n" +
                "{}</p></li>" +
                "<li><b>Accessing Elements</b><p>You can access elements using the keys only. You can use either the get() function or just pass the key values and you will be retrieving the values.\n" +
                "my_dict = {'First': 'Python', 'Second': 'Java'}\n" +
                "print(my_dict['First']) #access elements using keys\n" +
                "print(my_dict.get('Second'))\n" +
                "Output:\n" +
                "Python\n" +
                "Java\n</p></li>" +
                "</ol>"+
                "<h6><b>1.3 Tuple:</b><h6>" +
                "<p>Tuples are the same as lists are with the exception that the data once entered into the tuple cannot be changed no matter what. The only exception is when the data inside the tuple is mutable, only then the tuple data can be changed. The example program will help you understand better.</p>"+
                "<ol>"+
                "<li><b>Creating a Tuple</b><p>You create a tuple using parenthesis or using the tuple() function.\n" +
                "my_tuple = (1, 2, 3) #create tuple\n" +
                "print(my_tuple) \n" +
                "Output:\n" +
                "(1, 2, 3)</p></li>" +
                "<li><b>Accessing Elements</b><p></p>Accessing elements is the same as it is for accessing values in lists.\n" +
                "my_tuple2 = (1, 2, 3, 'edureka') #access elements\n" +
                "for x in my_tuple2:\n" +
                "    print(x)\n" +
                "print(my_tuple2)\n" +
                "print(my_tuple2[0])\n" +
                "print(my_tuple2[:])\n" +
                "print(my_tuple2[3][4])\n" +
                "Output:\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "edureka\n" +
                "(1, 2, 3, ‘edureka’)\n" +
                "1\n" +
                "(1, 2, 3, ‘edureka’)\n" +
                "e</li>" +
                "<li><b>Appending Elements</b><p>To append the values, you use the ‘+’ operator which will take another tuple to be appended to it.\n" +
                "my_tuple = (1, 2, 3)\n" +
                "my_tuple = my_tuple + (4, 5, 6) #add elements\n" +
                "print(my_tuple)\n" +
                "Output:\n" +
                "(1, 2, 3, 4, 5, 6)</p></li>" +
                "</ol>"+
                "<h6><b>1.4 Sets:</b><h6>" +
                "<p>Sets are a collection of unordered elements that are unique. Meaning that even if the data is repeated more than one time, it would be entered into the set only once. It resembles the sets that you have learnt in arithmetic. The operations also are the same as is with the arithmetic sets. An example program would help you understand better.</p>"+
                "<ol>"+
                "<li><b>Creating a set</b><p>Sets are created using the flower braces but instead of adding key-value pairs, you just pass values to it.\n" +
                "my_set = {1, 2, 3, 4, 5, 5, 5} #create set\n" +
                "print(my_set)\n" +
                "Output:\n" +
                "{1, 2, 3, 4, 5}</p></li>" +
                "<li><b>Adding elements</b><p>To add elements, you use the add() function and pass the value to it.\n" +
                "my_set = {1, 2, 3}\n" +
                "my_set.add(4) #add element to set\n" +
                "print(my_set)\n" +
                "Output:\n" +
                "{1, 2, 3, 4}</p></li>" +
                "</ol>"+
                "<h5>2.User-Defined Data Structures</h5>"+
                "<h6><b>2.1 Arrays vs. Lists:</b><h6>" +
                "<p>Arrays and lists are the same structure with one difference. Lists allow heterogeneous data element storage whereas Arrays allow only homogenous elements to be stored within them.</p>"+
                "<h6><b>2.2 Stack:</b><h6>" +
                "<p>Stacks are linear Data Structures which are based on the principle of Last-In-First-Out (LIFO) where data which is entered last will be the first to get accessed. It is built using the array structure and has operations namely, pushing (adding) elements, popping (deleting) elements and accessing elements only from one point in the stack called as the TOP. This TOP is the pointer to the current position of the stack. Stacks are prominently used in applications such as Recursive Programming, reversing words, undo mechanisms in word editors and so forth.</p>"+
                "<h6><b>2.3 Queue:</b><h6>" +
                "<p>A queue is also a linear data structure which is based on the principle of First-In-First-Out (FIFO) where the data entered first will be accessed first. It is built using the array structure and has operations which can be performed from both ends of the Queue, that is, head-tail or front-back. Operations such as adding and deleting elements are called En-Queue and De-Queue and accessing the elements can be performed. Queues are used as Network Buffers for traffic congestion management, used in Operating Systems for Job Scheduling and many more.</p>"+
                "<h6><b>2.4 Tree:</b><h6>" +
                "<p>Trees are non-linear Data Structures which have root and nodes. The root is the node from where the data originates and the nodes are the other data points that are available to us. The node that precedes is the parent and the node after is called the child. There are levels a tree has to show the depth of information. The last nodes are called the leaves. Trees create a hierarchy which can be used in a lot of real-world applications such as the HTML pages use trees to distinguish which tag comes under which block. It is also efficient in searching purposes and much more.</p>"+
                "<h6><b>2.5 Linked List:</b><h6>" +
                "<p>Linked lists are linear Data Structures which are not stored consequently but are linked with each other using pointers. The node of a linked list is composed of data and a pointer called next. These structures are most widely used in image viewing applications, music player applications and so forth.</p>"+
                "<h6><b>2.6: Graph</b><h6>" +
                "<p>Graphs are used to store data collection of points called vertices (nodes) and edges (edges). Graphs can be called as the most accurate representation of a real-world map. They are used to find the various cost-to-distance between the various data points called as the nodes and hence find the least path. Many applications such as Google Maps, Uber, and many more use Graphs to find the least distance and increase profits in the best ways.</p>"+
                "<h6><b>2.7 HashMaps:</b><h6>" +
                "<p>HashMaps are the same as what dictionaries are in Python. They can be used to implement applications such as phonebooks, populate data according to the lists and much more.</p>"+
                "</body></html>";

        noteTextView1.setText(Html.fromHtml(htmlNotes1));

    }
}


