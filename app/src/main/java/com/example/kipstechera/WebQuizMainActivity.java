package com.example.kipstechera;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WebQuizMainActivity extends AppCompatActivity implements View.OnClickListener{


    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA, ansB, ansC, ansD;
    Button submitBtn;
    int score=0;
    int totalQuestion=WebQuestionsAnswer.question.length;
    int currentQuestionIndex=0;
    String selectedAnswer="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webquiz);
        totalQuestionsTextView=findViewById(R.id.total_question);
        questionTextView=findViewById(R.id.question);
        ansA=findViewById(R.id.ans_A);
        ansB=findViewById(R.id.ans_B);
        ansC=findViewById(R.id.ans_C);
        ansD=findViewById(R.id.ans_D);
        submitBtn=findViewById(R.id.submit_btn);
        Button getCertificateButton = findViewById(R.id.getCertificateButton);


        // Set onClickListener for "Get Certificate" button
        getCertificateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Prompt the user to enter their name for the certificate
                promptUserName();
            }
        });

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);
        totalQuestionsTextView.setText("Total Questions: "+totalQuestion);
        loadNewQuestion();

    }

    @Override
    public void onClick(View v) {
        ansA.setBackgroundColor(Color.BLACK);
        ansB.setBackgroundColor(Color.BLACK);
        ansC.setBackgroundColor(Color.BLACK);
        ansD.setBackgroundColor(Color.BLACK);

        Button clickedButton=(Button) v;
        if(clickedButton.getId()==R.id.submit_btn){
            if(selectedAnswer.equals(WebQuestionsAnswer.correctAnswers[currentQuestionIndex])){
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();
        }
        else{
            selectedAnswer=clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.MAGENTA);
        }

    }

    void loadNewQuestion(){
        if(currentQuestionIndex ==totalQuestion){
            finishQuiz();
            return;
        }
        questionTextView.setText(WebQuestionsAnswer.question[currentQuestionIndex]);
        ansA.setText(WebQuestionsAnswer.choices[currentQuestionIndex][0]);
        ansB.setText(WebQuestionsAnswer.choices[currentQuestionIndex][1]);
        ansC.setText(WebQuestionsAnswer.choices[currentQuestionIndex][2]);
        ansD.setText(WebQuestionsAnswer.choices[currentQuestionIndex][3]);

    }
    void finishQuiz() {
        // Calculate the percentage score
        double percentage = (score * 100.0) / totalQuestion;
        // Check if the user's score meets the passing criteria
        if (percentage >= 60) {
            new AlertDialog.Builder(this)
                    .setMessage("Score is " + score + " out of " + totalQuestion)
                    .show();

            // Show "Get Certificate" button
            Button getCertificateButton = findViewById(R.id.getCertificateButton);
            getCertificateButton.setVisibility(View.VISIBLE);
        } else {
            // Display score and offer option to restart the quiz
            new AlertDialog.Builder(this)
                    .setMessage("Score is " + score + " out of " + totalQuestion)
                    .setPositiveButton("Restart", (dialogInterface, i) -> restartQuiz())
                    .setCancelable(false)
                    .show();
        }
    }

    void restartQuiz() {
        // Reset score and current question index, then load the first question
        score = 0;
        currentQuestionIndex = 0;
        loadNewQuestion();
    }

    private void promptUserName() {
        // Prompt the user to input their name for the certificate
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Confirm Your Name");

        // Set up the input
        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        builder.setView(input);

        // Set up the buttons
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String userName = input.getText().toString();
                generateCertificate(userName);

            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.show();
    }


    private void generateCertificate(String userName) {
        // Start CertificateActivity and pass the username
        Intent intent = new Intent(this, WebCertificateActivity.class);
        intent.putExtra("userName", userName);
        startActivity(intent);
    }
}
