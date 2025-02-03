package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WebOverviewActivity extends AppCompatActivity {

    private TextView noteTextView1;
    private TextView noteTextView2;
    private TextView noteTextView3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_overview);
        noteTextView1 = findViewById(R.id.HtmlIntro);
        noteTextView2 = findViewById(R.id.CSSIntro);
        noteTextView3 = findViewById(R.id.JSIntro);

        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center' color='blue'><u>Introduction to HTML</u></h1>" +
                "<p>HTML (Hypertext Markup Language) is the standard markup language used to create and design web pages. It provides the structure and layout for content on the internet, allowing web browsers to interpret and display text, images, videos, and other media.\n" +
                "\n" +
                "HTML uses a system of tags and attributes to define the elements of a web page, such as headings, paragraphs, links, images, and forms. These tags are enclosed in angle brackets <> and can be nested within each other to create a hierarchical structure.\n" +
                "\n" +
                "HTML is a key component of web development and is often used in conjunction with other technologies such as CSS (Cascading Style Sheets) and JavaScript to create dynamic and interactive websites. By learning HTML, you can gain the skills needed to create your own web pages and customize their appearance and functionality.</p>"+
                "<h4><U>Features of HTML:</U></h4>"+
                "<ol><lI>It is a very easy and simple language. It can be easily understood and modified.</li> " +
                "<li>It is very easy to make an effective presentation with HTML because it has a lot of formatting tags.</li>" +
                "<li>It is a markup language, so it provides a flexible way to design web pages along with the text.</li>" +
                "<li>It facilitates programmers to add a link on the web pages (by html anchor tag), so it enhances the interest of browsing of the user.</li>" +
                "<li> It is platform-independent because it can be displayed on any platform like Windows, Linux, and Macintosh, etc.</li>" +
                "<li>It facilitates the programmer to add Graphics, Videos, and Sound to the web pages which makes it more attractive and interactive.</li>" +
                "<li>HTML is a case-insensitive language, which means we can use tags either in lower-case or upper-case.</li>" +
                "</ol>"+
                "<h4><U>History of HTML:</U></h4>"+
                "<p>HTML, which stands for HyperText Markup Language, is the standard markup language used to create web pages. It was first created in 1990 by Tim Berners-Lee, a British computer scientist who is often credited as the inventor of the World Wide Web.\n" +
                "\n" +
                "The first version of HTML, known as HTML 1.0, was very basic and only included a few tags for formatting text and creating links. Over the years, new versions of HTML were released with more features and capabilities. HTML 2.0 was released in 1995, followed by HTML 3.2 in 1997, HTML 4.01 in 1999, and XHTML in 2000.\n" +
                "\n" +
                "One of the most significant developments in the history of HTML was the release of HTML5 in 2014. HTML5 introduced a number of new features, such as native support for video and audio, canvas elements for drawing graphics, and new semantic elements for structuring web pages.\n" +
                "\n" +
                "Today, HTML is the foundation of the World Wide Web and is used by web developers around the world to create websites and web applications. It is constantly evolving, with new features and capabilities being added to the language on a regular basis.</p>"+
                "</body></html>";


        String htmlNotes2 = "<html><body>" +
                "<h1 align='center' color='blue'><u>Introduction to CSS</u></h1>" +
                "<p>CSS, or Cascading Style Sheets, is a language used to style the visual presentation of a web page. It allows web developers to control the layout, colors, fonts, and other design elements of a website. CSS works by targeting HTML elements and applying styles to them, such as changing the background color of a div element or setting the font size of a paragraph CSS is essential for creating visually appealing and user-friendly websites.</p>" +
                "<h4><U>Features of CSS:</U></h4>"+
                "<ol><li>First and foremost, It’s FREE.</li>" +
                "<li>CSS style definitions are saved in external CSS files so it is possible to change the entire website by changing just one file.</li>" +
                "<li>With the use of CSS, we can control various styles, such as the text color, the font style, the spacing among paragraphs, column size and layout, background color and images, design of the layout, display variations for distinct screens and device sizes, and many other effects as well.</li>" +
                "<li>CSS provides more detailed attributes than plain HTML to define the look and feel of the website.</li>" +
                "<li>If you are intended to make any global change, change the styling, and you can see all other elements in all other web pages getting automatically updated.</li>" +
                "<li> CSS is a convenient and easy-to-read styling sheet. This means that search engines don’t have to put in much effort trying to read the text.</li>" +
                "<li>CSS selectors are the ones that are used to find HTML elements that are based on the element name, id, attribute, class, and more.</li>" +
                "</ol>"+
                "<h2><U>History of CSS:</U></h2>"+
                "<p>CSS, or Cascading Style Sheets, is a style sheet language used to describe the presentation of a document written in a markup language like HTML. It was first proposed by Håkon Wium Lie in 1994 and later developed by Lie and Bert Bos. CSS was created to separate the content of a webpage from its presentation, allowing for more flexibility and control over the design of a website.\n" +
                "\n" +
                "The first version of CSS, CSS1, was released in 1996 and included basic styling properties such as font size, color, and text alignment. CSS2 followed in 1998 and introduced new features like positioning, floating elements, and media types. In 1999, the World Wide Web Consortium (W3C) released CSS2.1, which clarified and improved upon the CSS2 specification.\n" +
                "\n" +
                "In 2011, CSS3 was introduced, which brought even more advanced styling capabilities to the web. CSS3 includes features like animations, transitions, gradients, and flexible box layouts. It is still being developed and expanded upon by the W3C.\n" +
                "\n" +
                "Today, CSS is an essential tool for web developers and designers, allowing them to create visually appealing and responsive websites. With the continued development of CSS and the introduction of new features like CSS Grid and Flexbox, the possibilities for web design are endless.</p>"+
                "</body></html>";
        String htmlNotes3 = "<html><body>" +
                "<h1 align='center' color='blue'><u>Introduction to JavaScript</u></h1>" +
                "<p>JavaScript is a high-level programming language that is commonly used for creating interactive and dynamic websites. It is a versatile language that can be used for a wide range of applications, from creating simple animations to building complex web applications.\n" +
                "\n" +
                "JavaScript is a client-side scripting language, which means that it runs on the user's web browser rather than on the server. This allows for dynamic content to be generated and updated without the need to reload the entire webpage.\n" +
                "\n" +
                "JavaScript is known for its ease of use and flexibility, making it a popular choice for web developers. It is supported by all modern web browsers and has a large and active community of developers who contribute to its ongoing development and improvement.</p>"+
                "<h2><U>Features of JavaScript:</U></h2>"+
                "<ol>" +
                "<li>JavaScript is a lightweight scripting language because it is made for data handling in the browser or the client side.</li>" +
                "<li>JavaScript supports dynamic typing which means types of the variable are defined based on the stored value.</li>" +
                "<li>JavaScript uses a functional approach, even objects can be created using constructor functions and each constructor function represents a unique object type.</li>" +
                "<li>JavaScript is platform-independent or we can say it is portable.</li>" +
                "<li>JavaScript is a prototype-based scripting Language.</li>" +
                "<li>JavaScript is an interpreted language which means the script written inside JavaScript is processed line by line.</li>" +
                "<li>JavaScript doesn't support multi-threading, by default it is single-threaded, which means it can execute only a single task at a time.</li>" +
                "<li>JavaScript supports Promise which enables asynchronous requests wherein a request is initiated and JavaScript doesn't have to wait for the response if a request takes time and may block the request processing.</li>" +
                "</ol>"+
                "<h2><U>History of JavaScript:</U></h2>"+
                "<p>JavaScript was created by Brendan Eich in 1995 while he was working at Netscape Communications Corporation. It was originally called Mocha, but was later renamed to LiveScript and finally to JavaScript. The language was created in just 10 days and was designed to add interactivity to websites and make them more dynamic.\n" +
                "\n" +
                "JavaScript quickly gained popularity due to its ability to run on any web browser and its ease of use. In 1996, Microsoft released its own version of JavaScript called JScript, which was compatible with Internet Explorer.\n" +
                "\n" +
                "In 1997, JavaScript was standardized by the European Computer Manufacturers Association (ECMA) and became known as ECMAScript. This standardization helped to ensure that JavaScript code would work consistently across different browsers.\n" +
                "\n" +
                "Over the years, JavaScript has continued to evolve and improve. New features and updates have been added to the language, making it more powerful and versatile. Today, JavaScript is one of the most widely used programming languages in the world, and is used for a wide range of applications, including web development, mobile app development, and server-side programming.</p>"+
                "</body></html>";
        noteTextView1.setText(Html.fromHtml(htmlNotes1));
        noteTextView2.setText(Html.fromHtml(htmlNotes2));
        noteTextView3.setText(Html.fromHtml(htmlNotes3));
    }
}



