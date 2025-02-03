package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WebDiffHtmlCssJSActivity extends AppCompatActivity {
    private TextView noteTextView1;
    private TextView noteTextView2;
    private TextView noteTextView3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_html_css_js);
        noteTextView1 = findViewById(R.id.Html_vs_CSS);
        noteTextView2 = findViewById(R.id.Html_vs_JS);
        noteTextView3 = findViewById(R.id.CSS_vs_JS);

        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center' color='blue'><u>HTML vs. CSS</u></h1>" +
                "<ol>" +
                "<li>HTML is Hypertext Markup Language, and CSS is Cascading Style Sheet language.</li>" +
                "<li>HTML is used to structure the content on the web page, whereas CSS is used to add style to the content of a web page.</li>" +
                "<li>HTML provides display information of various tags to the browser, but CSS enhances that information by providing styling to those same HTML tags. </li>" +
                "<li>HTML is just like the skeleton of the human body, whereas CSS is like providing looks and appearance to that body</li>" +
                "<li>Using HTML, you can insert video, images, and hyperlinks, whereas CSS places those images, videos, etc. in appropriate positions with required indentation, padding, and other styling like border colour, so that it looks awesome.</li>" +
                "<li>We can use CSS inside as well as outside of HTML using style and link tags respectively. But, CSS is useless without HTML.</li>" +
                "<li>HTML tags have limited attributes inside them.But, using CSS we can enhance any tag by adding more properties/attributes.</li>" +
                "<li>Animation and transitions are not possible in HTML, but CSS facilitates animation and transition, which can be added to tags to improve UI.</li>" +
                "<li>HTML may or may not be responsive to all devices. But using CSS, we can make responsive web applications.</li>" +
                "<li>HTML tags have style attributes to provide inline CSS.Whereas, In CSS, we have different selectors to select tags or set to tags. (e.g., class selector, id selector, tag name selector, etc…)</li>" +
                "<li>It is not used for presentation and visualization.Whereas, CSS is used for presentation and visualization.</li>" +
                "<li></li>" +
                "</ol>"+
                "</body></html>";
        String htmlNotes2 = "<html><body>" +
                "<h1 align='center' color='blue'><u>HTML vs. JavaScript</u></h1>" +
                "<ol>" +
                "<li>HTML is a standard markup language that gives structure to a website. Whereas, JavaScript is a high-level programming language that web pages are made more interactive and dynamic</li>" +
                "<li>HTML is the stepping stone in the development of a website, which generates a basic structure of a web page. HTML is how a website should appear without any interactive effects.Whereas, JavaScript manages the content of the page to generate effects on the user actions. It simply incorporates dynamic content into websites to make them look good.</li>" +
                "<li>HTML is rendered from the web server, which means the markup code is processed by the server before it is sent to the client browser.Whereas, JavaScript is synchronous and single-threaded with client-side scripting, meaning each code written is composed and run on the web browser.  If you’re running a JavaScript block of code on a page then no other JavaScript on that page will be executed</li>" +
                "<li>HTML is cross-browser compatible, implying it works well with all versions of web browsers. All old and new browsers handle unrecognized elements as inline elements by default, thus making it easy for older web browsers to manipulate unknown HTML elements.Whereas, JavaScript lacks cross-browser compatibility, making a few functions incompatible with some browsers.</li>" +
                "<li>Standard HTML pages are static, meaning the content is fixed and presents the same information to every user who accesses the website.Whereas, Implementing JavaScript would enable programmers to develop user actions for both web pages and web applications. It turns a web page dynamic by manipulating the content of the page.</li>" +
                "<li>HTML needs CSS to format and present the data properly in a structured format. Whereas, JavaScript renders dynamic functionality by combining it into HTML code.JavaScript can be used in combination with HTML to power modern web applications that are intuitive, interactive, and user-friendly.</li>" +
                "<li>HTML’s DOM (Document Object Model) in every page is deemed as an object, which can be handled using the APIs that have been given by the HTML’s specification.Whereas, JavaScript’s specification is used for managing some complex functional requirements by making use of functional programming benefits.</li>" +
                "</ol>"+
                "</body></html>";
        String htmlNotes3 = "<html><body>" +
                "<h1 align='center' color='blue'><u>CSS vs. JavaScript</u></h1>" +
                "<ol>" +
                "<li>CSS is a styling language that designs the interface of the websites. Whereas,JavaScript is a light weight programming language which helps in making interactive web pages</li>" +
                "<li>The file extension of CSS is \".css\". Whereas, The file extension of JavaScript is \".js\"</li>" +
                "<li>CSS is defined using '<style>' tag. Whereas, JavaScript is defined by using '<script>' tag.</li>" +
                "<li>CSS is simple and easy. But,JavaScript is complex and somewhat difficult compared to CSS</li>" +
                "<li>An error in CSS code doesn’t affect the entire website. The website runs as usual except that formatting might not be applied. Whereas, Any error in the code of JavaScript results in complete breakdown of the website</li>" +
                "<li>CSS is supported by all browsers. Whereas, JavaScript is supported by almost all major browsers</li>" +
                "<li>CSS adds colors, changes font styles, layouts etc. Whereas, JavaScript adds animations, embedded video media, etc.</li>" +
                "<li>CSS is applied to both HTML and XML.But, JavaScript is applied on HTML only.</li>" +
                "<li>There is more scope for Optimization in the case of CSS.Whereas, JavaScript does not support these types of optimizations because it does not have access to those APIs.</li>" +
                "</ol>"+
                "</body></html>";
        noteTextView1.setText(Html.fromHtml(htmlNotes1));
        noteTextView2.setText(Html.fromHtml(htmlNotes2));
        noteTextView3.setText(Html.fromHtml(htmlNotes3));


    }
}

