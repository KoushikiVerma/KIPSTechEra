package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WebCssActivity extends AppCompatActivity {
    private TextView noteTextView1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_css);
        noteTextView1 = findViewById(R.id.CSSBasics);

        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center' color='blue'><u>CSS Basics</u></h1>" +
                "<h2>Types of CSS:</h2>"+
                "<p>There are three types of CSS which are given below:</p>"+
                "<ol>" +
                "<li><b>Inline CSS:</b>Inline CSS is a method of applying styling directly to individual HTML elements using the “style” attribute within the HTML tag,allowing for specific styling of individual elements within the HTML document, overriding any external or internal styles.\n</li>" +
                "<li><b>Internal or Embedded CSS:</b>The Internal CSS has <style> tag in the <head> section of the HTML document. This CSS style is an effective way to style single pages. Using the CSS style for multiple web pages is time-consuming because we require placing the style on each web page.\n</li>" +
                "<li><b>External CSS:</b>External CSS contains separate CSS files that contain only style properties with the help of tag attributes (For example class, id, heading, … etc). CSS property is written in a separate file with a .css extension and should be linked to the HTML document using a link tag. It means that, for each element, style can be set only once and will be applied across web pages</li>" +
                "</ol>"+
                "</body></html>";


        noteTextView1.setText(Html.fromHtml(htmlNotes1));


    }
}

