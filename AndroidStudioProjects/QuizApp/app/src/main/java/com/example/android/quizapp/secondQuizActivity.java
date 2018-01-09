package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class secondQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_quiz);
    }

    int numberOfPoints=0;


    public void pressReceiveScoreButton(View view)
    {

        RadioButton radioButtonAnswer1b= (RadioButton) findViewById(R.id.id_answer1b);
        RadioButton radioButtonAnswer4a= (RadioButton) findViewById(R.id.id_answer4a);
        RadioButton radioButtonAnswer5a= (RadioButton) findViewById(R.id.id_answer5a);
        RadioButton radioButtonAnswer9a= (RadioButton) findViewById(R.id.id_answer9a);
        CheckBox checkBoxAnswer3a= (CheckBox) findViewById(R.id.id_answer3a);
        CheckBox checkBoxAnswer3c= (CheckBox) findViewById(R.id.id_answer3c);
        CheckBox checkBoxAnswer7a= (CheckBox) findViewById(R.id.id_answer7a);
        CheckBox checkBoxAnswer7b= (CheckBox) findViewById(R.id.id_answer7b);
        CheckBox checkBoxAnswer7c= (CheckBox) findViewById(R.id.id_answer7c);
        CheckBox checkBoxAnswer10b= (CheckBox) findViewById(R.id.id_answer10b);
        CheckBox checkBoxAnswer10c= (CheckBox) findViewById(R.id.id_answer10c);
        EditText editTextQuestion2= (EditText) findViewById(R.id.id_edit_text_view2);
        String answerQuestion2= editTextQuestion2.getText().toString();
        EditText editTextQuestion6= (EditText) findViewById(R.id.id_edit_text_view6);
        String answerQuestion6= editTextQuestion6.getText().toString();
        EditText editTextQuestion8= (EditText) findViewById(R.id.id_edit_text_view8);
        String answerQuestion8= editTextQuestion8.getText().toString();

        /**
         * Question 1: Answer b
         */
        if(radioButtonAnswer1b.isChecked()){
            numberOfPoints++;
        }

        /**
         * Question 2: Answer: vin
         */
        if(answerQuestion2.equalsIgnoreCase(getString(R.string.quiz2_question2_answer)))
        {
            numberOfPoints++;
        }


        /**
         * Question 3: Answers b,c
         */
        if(checkBoxAnswer3a.isChecked() && checkBoxAnswer3c.isChecked())
        {
            numberOfPoints++;
        }


        /**
         * Question 4: Answer a
         */
        if(radioButtonAnswer4a.isChecked())
        {
            numberOfPoints++;
        }

        /**
         * Question 5: Answer a
         */
        if(radioButtonAnswer5a.isChecked())
        {
            numberOfPoints++;
        }

        /**
         * Question 6: Answer breakfast
         */

        if(answerQuestion6.equalsIgnoreCase(getString(R.string.quiz2_question6_answer)))
        {
            numberOfPoints++;
        }


        /**
         * Question 7: Answers a,b,c
         */
        if(checkBoxAnswer7a.isChecked() && checkBoxAnswer7b.isChecked() && checkBoxAnswer7c.isChecked())
        {
            numberOfPoints++;
        }


        /**
         * Question 8: Answer jour
         */

        if(answerQuestion8.equalsIgnoreCase(getString(R.string.quiz2_question8_answer)))
        {
            numberOfPoints++;
        }

        /**
         * Question 9: Answer a
         */
        if(radioButtonAnswer9a.isChecked())
        {
            numberOfPoints++;
        }

        /**
         * Question 10: Answers b,c
         */
        if(checkBoxAnswer10b.isChecked() && checkBoxAnswer10c.isChecked())
        {
            numberOfPoints++;
        }

        TextView textViewScore= (TextView) findViewById(R.id.id_text_view_score);
        String score= getString(R.string.your_score_part1)+" "+numberOfPoints+" "+getString(R.string.your_score_part2);
        if(numberOfPoints==0)
        {
            score=score+"\n"+getString(R.string.score_message_for_score_0_quiz2);
        }
        else if(numberOfPoints>=1 && numberOfPoints<=5)
        {
            score=score+"\n"+getString(R.string.score_message_for_score_between_1_and_5_quiz2);

        }
        else if(numberOfPoints>=6 && numberOfPoints<=9)
        {
            score=score+"\n"+getString(R.string.score_message_for_score_between_6_and_9_quiz2);
        }
        else if(numberOfPoints==10)
        {
            score=score+"\n"+getString(R.string.score_message_for_perfect_score_quiz2);
        }

        textViewScore.setText(score);
        textViewScore.setBackgroundResource(R.drawable.border_style_score);

        numberOfPoints=0;
    }
}
