package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AndroidViewsActivity extends AppCompatActivity {
    private TextView noteTextView1;
    private TextView noteTextView2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_view);


        noteTextView1 = findViewById(R.id.AndyView);
        noteTextView2 = findViewById(R.id.AndyLayout);
        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center'><u>Android Views and Layouts</u></h1>" +
                "<h2><U>Android Views:</U></h2>"+
                "<p>A View is defined as the user interface which is used to create interactive UI components such as TextView, ImageView, EditText, RadioButton, etc., and is responsible for event handling and drawing. They are Generally Called Widgets.\n </p>"+
                "<p>A View is a simple building block of a user interface. It is a small rectangular box that can be TextView, EditText, or even a button. It occupies the area on the screen in a rectangular area and is responsible for drawing and event handling. View is a superclass of all the graphical user interface components.\n</p>"+
                "<h3>Types of Views in Android:</h3>"+
                "<ol>" +
                "<lI><b>TextView:</b> TextView is a UI Component that displays the text to the user on their Display Screen.TextView is a view that displays text content on the screen. It is a simple view that can be used to display static text or dynamically changeable text.We can use <TextView> tag to use this view in xml file.\n </li>"+
                "<lI><b>Button: </b>Button is a view that users can click on to perform an action. It is commonly used to trigger events or navigate to different screens in an app.This is a UI that is used to perform some action as soon as the user clicks on it.We can use <Button> tag to use this view in xml file.\n</li>" +
                "<lI><b>ImageButton:</b> It is the same as a Button but it’s used to display an image on the button to perform an Action. In this, we need to give the source of the image so that the system can load it.We can use <ImageButton> tag to use this view in xml file.\n</li>" +
                "<lI><b>ImageView:</b> ImageView is a view that displays an image on the screen. It can be used to show static images or dynamically changeable images.We can use <ImageView> tag to use this view in xml file.\n</li>" +
                "<lI><b>EditText: </b>EditText is a view that allows users to input text. It is commonly used in forms or search bars where users need to type in information.We can use <EditText> tag to use this view in xml file.\n</li>" +
                "<lI><b>ListView:</b> ListView is a view that displays a list of scrollable items. It is commonly used to show a list of items that users can interact with, such as a list of contacts or messages.We can use <ListView> tag to use this view in xml file.\n</li>" +
                "<lI> <b>RadioButton:</b> RadioButton is a view that allows users to select only one option from a list of choices. It is commonly used in forms or quizzes where users need to make a single selection.We can use <RadioButton> tag to use this view in xml file.</li>" +
                "<lI><b>CheckBoxButton:</b>A CheckBox is the UI control that has two states that are either checked or unchecked. If we have a group of CheckBox, we can select as many as we want, unlike RadioGroup.We can use <CheckBox> tag to use this view in xml file.\n</li>" +
                "<lI><b>RecyclerView: </b>RecyclerView is a more flexible and efficient version of ListView. It is used to display large sets of data that need to be dynamically updated or rearranged.We can use <RecycleView> tag to use this view in xml file.\n</li>" +
                "<lI><b>ScrollView: </b>ScrollView is a view that allows users to scroll through content that is larger than the screen size. It is commonly used to display long blocks of text or images.We can use <ScrollView> tag to use this view in xml file.\n</li>" +
                "<lI><b>Spinner: </b>Spinner is a view that displays a dropdown list of items that users can select from. It is commonly used in forms or settings menus.We can use <Spinner> tag to use this view in xml file.\n</li>" +
                "</ol>"+
                "</body></html>";


        String htmlNotes2 = "<html><body>" +
                "<h2><U>Android Layouts :</U></h2>"+
                "<p>Android Layout is used to define the user interface that holds the UI controls or widgets that will appear on the screen of an android application or activity screen. Generally, every application is a combination of View and ViewGroup. As we know, an android application contains a large number of activities and we can say each activity is one page of the application. So, each activity contains multiple user interface components and those components are the instances of the View and ViewGroup. All the elements in a layout are built using a hierarchy of View and ViewGroup objects.\n"+
                "In Android development, layouts are used to define the structure and appearance of user interface components within an app. Layouts are defined using XML files and are used to organize and position different views and widgets, such as buttons, text fields, images, and more.\n</p>"+
                "<h3>Types of Android Layouts:</h3>"+
                "<ul type='1'>" +
                "<LI><b>Linear Layout:</b> A layout that arranges its children in a single row or column.LinearLayout is a ViewGroup subclass, used to provide child View elements one by one either in a particular direction either horizontally or vertically based on the orientation property.A LinearLayout aligns each of the child View in either a vertical or a horizontal line. A vertical layout has a column of Views, whereas in a horizontal layout there is a row of Views. It supports a weight attribute for each child View that can control the relative size of each child View within the available space.\n  " +
                "In android, LinearLayout is a ViewGroup subclass which is used to render all child View instances one by one either in a horizontal direction or vertical direction based on the orientation property.\n</li>" +
                "<LI><b>Relative Layout:</b> A layout that positions its children relative to each other or to the parent.It is flexible than other native layouts as it lets us to define the position of each child View relative to the other views and the dimensions of the screen.RelativeLayout is a view group that places its child views relative to one another. Each view’s location can be set relative to sibling components (such as to the left or below another view) or relative to the RelativeLayout area of its parent (such as aligned to the bottom, left or center).\n" +
                "In android, RelativeLayout is a ViewGroup which is used to specify the position of child View instances relative to each other (Child A to the left of Child B) or relative to the parent (Aligned to the top of a parent).\n</li>" +
                "<LI><b>Constraint Layout: </b>A flexible layout that allows you to create complex layouts by setting constraints between views.\n " +
                "ConstraintLayout permits the creation of complicated layouts with a flat view hierarchy (no nested view groups). It is similar to RelativeLayout in that all views are set up according to the relationships between sibling views and the parent layout, but it is more flexible than RelativeLayout and easier to use with the Layout Editor in Android Studio.\n" +
                "Because the layout API and the Layout Editor were purpose-built for one another, all the power of ConstraintLayout is accessible immediately from the Layout Editor’s visual tools. So, developers may construct the layout with ConstraintLayout using only drag-and-drop instead of XML.</li>" +
                "<LI><b>Frame Layout: </b>A layout that displays one view at a time, stacking views on top of each other.It is the simplest of the Layout Managers that pins each child view within its frame. By default the position is the top-left corner, though the gravity attribute can be used to alter its locations. You can add multiple children stacks each new child on top of the one before, with each new View potentially obscuring the previous ones.\n " +
                " In android, FrameLayout is a ViewGroup subclass which is used to specify the position of View instances it contains on the top of each other to display only a single View inside the FrameLayout.\n</li>" +
                "<LI><b>Table Layout:</b> A layout that arranges its children in rows and columns, similar to an HTML table.TableLayout is a ViewGroup that presents its children in rows and columns. TableLayout arranges its children into columns and rows. TableLayout containers do not display row, column, and cell border lines. The table will have the same number of columns as the row with the most cells. A table can leave cells vacant. As in HTML, cells can span multiple columns in Tableau. Developers can span columns using the TableRow’s span field. Class layout parameters.\n" +
                "In android, TableLayout is a ViewGroup subclass which is used to display the child View elements in rows and columns.\n</li>" +
                "</ul>"+
                "<h3>Common Attributes of Android Layouts:</h3>"+
                "<ol>" +
                "<li><b>android:id-</b>This is the ID which uniquely identifies the view.\n</li>" +
                "<li><b>android:layout_width-</b>This is the width of the layout.\n</li>" +
                "<li><b>android:layout_height-</b>Specifies the height of the layout.\n</li>" +
                "<li><b>android:layout_marginTop-</b>This is the extra space on the top side of the layout.\n</li>" +
                "<li><b>android:layout_marginBottom-</b>This is the extra space on the bottom side of the layout.\n</li>" +
                "<li><b>android:layout_marginLeft-</b>This is the extra space on the left side of the layout.\n</li>" +
                "<li><b>android:layout_marginRight-</b>This is the extra space on the right side of the layout.\n</li>" +
                "<li><b>android:layout_gravity-</b>This specifies how child Views are positioned.\n</li>" +
                "<li><b>android:layout_weight-</b>This specifies how much of the extra space in the layout should be allocated to the View.\n</li>" +
                "<li><b>android:layout_x-</b>This specifies the x-coordinate of the layout.\n</li>" +
                "<li><b>android:layout_y-</b>This specifies the y-coordinate of the layout.\n</li>" +
                "<li><b>android:paddingLeft-</b>This is the left padding filled for the layout.\n</li>" +
                "<li><b>android:paddingRight-</b>This is the right padding filled for the layout.\n</li>" +
                "<li><b>android:paddingTop-</b>This is the top padding filled for the layout.\n</li>" +
                "<li><b>android:paddingBottom-</b>This is the bottom padding filled for the layout.\n</li>" +
                "</ol>"+
                "</body></html>";

        noteTextView1.setText(Html.fromHtml(htmlNotes1));
        noteTextView2.setText(Html.fromHtml(htmlNotes2));

    }
}

