package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JavaThreadActivity extends AppCompatActivity {
    private TextView noteTextView1;
    private TextView noteTextView2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_thread);

        noteTextView1 = findViewById(R.id.JavaThread);
        noteTextView2 = findViewById(R.id.JavaException);
        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center'><u>Java Threads and Exceptions</u></h1>" +
                "<h2><U>Java Thread:</U></h2>"+
                "<p>A Java thread is a lightweight process that is used to execute tasks concurrently in a Java program. Threads allow multiple tasks to be executed simultaneously, improving the performance and responsiveness of the program. In Java, threads are created by extending the Thread class or implementing the Runnable interface. Threads can be started, paused, resumed, and stopped using various methods provided by the Thread class. Java also provides synchronization mechanisms such as locks and semaphores to coordinate the execution of multiple threads and prevent race conditions.</p>"+
                "<h3>Life Cycle Of Thread in Java:</h3>"+
                "<ol>" +
                "<lI><b>New State:</b>By default, a Thread will be in a new state,  in this state, code has not yet been run and the execution process is not yet initiated.</li>" +
                "<lI><b>Active State:</b>A Thread that is a new state by default gets transferred to Active state when it invokes the start() method, his Active state contains two sub-states namely:\n" +
                "\n" +
                "Runnable State: In This State, The Thread is ready to run at any given time and it’s the job of the Thread Scheduler to provide the thread time for the runnable state preserved threads. A program that has obtained Multithreading shares slices of time intervals which are shared between threads hence, these threads run for some short span of time and wait in the runnable state to get their schedules slice of a time interval.\n" +
                "Running State: When The Thread Receives CPU allocated by Thread Scheduler, it transfers from the “Runnable” state to the “Running” state. and after the expiry of its given time slice session, it again moves back to the “Runnable” state and waits for its next time slice.</li>" +
                "<lI><b>Waiting/Blocked State:</b>If a Thread is inactive but on a temporary time, then either it is a waiting or blocked state, for example, if there are two threads, T1 and T2 where T1 needs to communicate to the camera and the other thread T2 already using a camera to scan then T1 waits until T2 Thread completes its work, at this state T1 is parked in waiting for the state, and in another scenario, the user called two Threads T2 and T3 with the same functionality and both had same time slice given by Thread Scheduler then both Threads T1, T2 is in a blocked state. When there are multiple threads parked in a Blocked/Waiting state Thread Scheduler clears Queue by rejecting unwanted Threads and allocating CPU on a priority basis.</li>" +
                "<lI><b>Timed Waiting State:</b>Sometimes the longer duration of waiting for threads causes starvation, if we take an example like there are two threads T1, T2 waiting for CPU and T1 is undergoing a Critical Coding operation and if it does not exist the CPU until its operation gets executed then T2 will be exposed to longer waiting with undetermined certainty, In order to avoid this starvation situation, we had Timed Waiting for the state to avoid that kind of scenario as in Timed Waiting, each thread has a time period for which sleep() method is invoked and after the time expires the Threads starts executing its task.</li>" +
                "<lI><b>Terminated State:</b>A thread will be in Terminated State, due to the below reasons: \n" +
                "\n" +
                "Termination is achieved by a Thread when it finishes its task Normally.\n" +
                "Sometimes Threads may be terminated due to unusual events like segmentation faults, exceptions…etc. and such kind of Termination can be called Abnormal Termination.\n" +
                "A terminated Thread means it is dead and no longer available.</li>" +
                "<lI><b>:</b></li>" +
                "</ol>"+
                "<h3>Creating a Thread in Java:</h3>"+
                "<p>We can create Threads in java using two ways, namely : \n" +
                "\n" +
                "Extending Thread Class\n" +
                "Implementing a Runnable interface</p>"+
                "<ol>"+
                "<lI><b>By Extending Thread Class:</b>This is the simplest way to create a thread. You create a subclass of the Thread class and override the run() method. The run() method contains the code that you want to execute in the thread." +
                "We can run Threads in Java by using Thread Class, which provides constructors and methods for creating and performing operations on a Thread, which extends a Thread class that can implement Runnable Interface. We use the following constructors for creating the Thread: \n" +
                "\n" +
                "Thread\n" +
                "Thread(Runnable r)\n" +
                "Thread(String name)\n" +
                "Thread(Runnable r, String name)\n</li>" +
                "<lI><b>Implementing the Runnable interface:</b>This is a more flexible way to create threads. You create a class that implements the Runnable interface. The Runnable interface has a single method, run(), which contains the code that you want to execute in the thread.</li>" +
                "</ol>"+
                "<h3>Commonly used methods of Thread class:</h3>"+
                "<ol>"+
                "<lI><b>public void run():</b> is used to perform action for a thread.</li>" +
                "<lI><b>public void start(): </b>starts the execution of the thread.JVM calls the run() method on the thread.</li>" +
                "<lI><b>public void sleep(long miliseconds):</b> Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.</li>" +
                "<lI><b>public void join():</b> waits for a thread to die.</li>" +
                "<lI><b>public int getPriority():</b> returns the priority of the thread.</li>" +
                "<lI><b>public int setPriority(int priority):</b> changes the priority of the thread.</li>" +
                "<lI><b>public String getName():</b> returns the name of the thread.</li>" +
                "<lI><b>public void setName(String name):</b> changes the name of the thread.</li>" +
                "<lI><b>public Thread currentThread():</b> returns the reference of currently executing thread.</li>" +
                "<lI><b>public int getId():</b> returns the id of the thread.</li>" +
                "<lI><b>public Thread.State getState():</b> returns the state of the thread.</li>" +
                "<lI><b>public boolean isAlive():</b> tests if the thread is alive.</li>" +
                "<lI><b>public void yield(): </b>causes the currently executing thread object to temporarily pause and allow other threads to execute.</li>" +
                "<lI><b>public void suspend():</b> is used to suspend the thread(depricated).</li>" +
                "<lI><b>public void resume():</b> is used to resume the suspended thread(depricated).</li>" +
                "<lI><b> public void stop():</b> is used to stop the thread(depricated).</li>" +
                "</ol>"+
                "</body></html>";


        String htmlNotes2 = "<html><body>" +
                "<h2><U>Java Exceptions :</U></h2>"+
                "<p>A Java exception is an event that occurs during the execution of a program that disrupts the normal flow of the program's instructions. When an exception occurs, the program stops executing and an error message is displayed. Exceptions can be caused by a variety of reasons, such as invalid input, insufficient memory, or a programming error. Java provides a mechanism for handling exceptions using try-catch blocks, which allow the programmer to catch and handle the exception gracefully without crashing the program.</p>"+
                "<h3>Java Exception Types:</h3>"+
                "<p>There are two main types of exceptions in Java: checked exceptions and unchecked exceptions.</p>"+
                "<ol>"+
                "<lI><b>Checked exceptions:</b> Checked exceptions are exceptions that are checked at compile time. This means that the compiler will force you to handle these exceptions either by catching them or declaring them in the method signature using the throws keyword. Examples of checked exceptions include IOException, FileNotFoundException, and SQLException.</li>" +
                "<lI><b>Unchecked exceptions:</b> Unchecked exceptions are exceptions that are not checked at compile time. These exceptions are subclasses of RuntimeException and its subclasses. Unchecked exceptions do not need to be caught or declared in the method signature. Examples of unchecked exceptions include NullPointerException, ArrayIndexOutOfBoundsException, and ArithmeticException.</li>" +
                "</ol>"+
                "<h3>Java Exception Handling:</h3>"+
                "<p>Exception Handling in Java is one of the effective means to handle runtime errors so that the regular flow of the application can be preserved. Java Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc." +
                "Java provides five keywords that are used to handle the exception.</p>"+
                "<ul type='1'>" +
                "<LI><b>Try Block:</b> The \"try\" keyword is used to specify a block where we should place an exception code. It means we can't use try block alone. The try block must be followed by either catch or finally.</li>" +
                "<LI><b>Catch Block:</b>The \"catch\" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.</li>" +
                "<LI><b>Finally Block:</b>The \"finally\" block is used to execute the necessary code of the program. It is executed whether an exception is handled or not.</li>" +
                "<LI><b>Throw Block:</b>The \"throw\" keyword is used to throw an exception.\nThrow keyword is used to throw an exception explicitly.</li>" +
                "<lI><b>Throws Block:</b>The \"throws\" keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. It is always used with method signature.</li>" +
                "</ul>"+
                "</body></html>";

        noteTextView1.setText(Html.fromHtml(htmlNotes1));
        noteTextView2.setText(Html.fromHtml(htmlNotes2));

    }
}





