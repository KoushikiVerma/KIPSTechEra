package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WebHtmlActivity extends AppCompatActivity {
    private TextView noteTextView1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_html);
        noteTextView1 = findViewById(R.id.HtmlBasics);

        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center' color='blue'><u>HTML Basics</u></h1>" +
                "<h2>HTML Page Structure:</h2>"+
                "<p>The basic structure of an HTML page is shown below. It contains the essential building-block elements (i.e. doctype declaration, HTML, head, title, and body elements) upon which all web pages are created.</p>"+
                "<ol>" +
                "<li><b>'<!DOCTYPE html>' –</b> This is the document type declaration (not technically a tag). It declares a document as being an HTML document. The doctype declaration is not case-sensitive.\n</li>" +
                "<li><b>'<html>' – </b>This is called the HTML root element. All other elements are contained within it.\n</li>" +
                "<li><b>'<head>' – </b>The head tag contains the “behind the scenes” elements for a webpage. Elements within the head aren’t visible on the front end of a webpage.</li>" +
                "<li><b>'<style> '–</b> This HTML tag allows us to insert styling into our web pages and make them appealing to look at with the help of CSS.</li>" +
                "<li><b><title> –</b> The title is what is displayed on the top of your browser when you visit a website and contains the title of the webpage that you are viewing.</li>" +
                "<li><b><base> –</b> It specifies the base URL for all relative URL’s in a document.</li>" +
                "<li><b><noscript> –</b> Defines a section of HTML that is inserted when the scripting has been turned off in the user’s browser.</li>" +
                "<li><b><script> – </b>This tag is used to add functionality to the website with the help of JavaScript.</li>" +
                "<li><b><meta> – </b>This tag encloses the metadata of the website that must be loaded every time the website is visited. For eg:- the metadata charset allows you to use the standard UTF-8 encoding on your website. This in turn allows the users to view your webpage in the language of their choice. It is a self-closing tag.</li>" +
                "<li><b><link> – </b>The ‘link’ tag is used to tie together HTML, CSS, and JavaScript. It is self-closing.</li>" +
                "<li><b><body> –</b> The body tag is used to enclose all the visible content of a webpage. In other words, the body content is what the browser will show on the front end.</li>" +
                "</ol>"+
                "<h2>HTML Tags:</h2>"+
                "<ol>" +
                "<li><b>Unclosed HTML Tags:</b><p>Some HTML tags are not closed, for example br and hr.\n" +
                "\n" +
                "<br> Tag: br stands for break line, it breaks the line of the code.\n" +
                "\n" +
                "<hr> Tag: hr stands for Horizontal Rule. This tag is used to put a line across the webpage.</p></li>" +
                "<li><b>HTML Meta Tags:</b><p>DOCTYPE, title, link, meta and style\n" +
                "\n</p></li>" +
                "<li><b>HTML Text Tags:</b><p><p>, <h1>, <h2>, <h3>, <h4>, <h5>, <h6>, <strong>, <em>, <abbr>, <acronym>, <address>, <bdo>, <blockquote>, <cite>, <q>, <code>, <ins>, <del>, <dfn>, <kbd>, <pre>, <samp>, <var> and <br></p></li>" +
                "<li><b>HTML Link Tags:</b><p><a> and <base></p></li>" +
                "<li><b>HTML Image and Object Tags:</b><p><img>, <area>, <map>, <param> and <object></p></li>" +
                "<li><b>HTML List Tags:</b><p><ul>, <ol>, <li>, <dl>, <dt> and <dd></p></li>" +
                "<li><b>HTML Table Tags:</b><p>table, tr, td, th, tbody, thead, tfoot, col, colgroup and caption</p></li>" +
                "<li><b>HTML Form Tags:</b><p>form, input, textarea, select, option, optgroup, button, label, fieldset and legend</p></li>" +
                "<li><b>HTML Scripting Tags:</b><p>script and noscript</p></li>" +
                "<li><b>:</b><p></p></li>" +
                "</ol>"+
                "<p></p>"+


                "</body></html>";


        noteTextView1.setText(Html.fromHtml(htmlNotes1));
       }
}





