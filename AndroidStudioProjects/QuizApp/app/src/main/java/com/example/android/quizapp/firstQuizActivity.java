package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.lang.reflect.Array;
import java.nio.file.StandardWatchEventKinds;


public class firstQuizActivity extends AppCompatActivity {

    private EditText editTextAnswer;
    private CheckBox checkBoxAnswer1a;
    private CheckBox checkBoxAnswer1b;
    private CheckBox checkBoxAnswer1c;
    private CheckBox checkBoxAnswer2a;
    private CheckBox checkBoxAnswer2b;
    private CheckBox checkBoxAnswer2c;
    private CheckBox checkBoxAnswer3a;
    private CheckBox checkBoxAnswer3b;
    private CheckBox checkBoxAnswer3c;
    private CheckBox checkBoxAnswer4a;
    private CheckBox checkBoxAnswer4b;
    private CheckBox checkBoxAnswer4c;
    private CheckBox checkBoxAnswer6a;
    private CheckBox checkBoxAnswer6b;
    private CheckBox checkBoxAnswer6c;
    private ImageView imageViewQuestion1;
    private TextView textViewQuestion1;
    private LinearLayout linearLayoutQuestion1;
    private ImageView imageViewQuestion2;
    private TextView textViewQuestion2;
    private LinearLayout linearLayoutQuestion2;
    private ImageView imageViewQuestion3;
    private TextView textViewQuestion3;
    private LinearLayout linearLayoutQuestion3;
    private ImageView imageViewQuestion4;
    private TextView textViewQuestion4;
    private LinearLayout linearLayoutQuestion4;
    private ImageView imageViewQuestion5;
    private TextView textViewQuestion5;
    private LinearLayout linearLayoutQuestion5;
    private ImageView imageViewQuestion6;
    private TextView textViewQuestion6;
    private LinearLayout linearLayoutQuestion6;









    int numberOfPoints=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_quiz);
    }


    /**
     * If the user doesn't get the right answer from the first time, a give up pops up and allows him to see the right answer.
     * If the answer the user input was right, the border of the editTextView is set to green, otherwise is set to red.
     * @param view
     */

    /**
     * Question 5, correct answer:HOWARD
     * @param view
     */
    public void makeGiveUpButtonVisible(View view)
    {
        Button giveUpButton= (Button) findViewById(R.id.id_give_up);
        editTextAnswer= (EditText) findViewById(R.id.id_edit_text_view);
        String answer= editTextAnswer.getText().toString();
        linearLayoutQuestion5 = (LinearLayout) findViewById(R.id.id_layout_question5);
        imageViewQuestion5= (ImageView) findViewById(R.id.id_image_question5);
        textViewQuestion5= (TextView) findViewById(R.id.id_text_question5);

        if(answer.equalsIgnoreCase("HOWARD")){
                  editTextAnswer.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_right_answer));
                  editTextAnswer.setEnabled(false);
                  giveUpButton.setEnabled(false);
                  imageViewQuestion5.setImageResource(R.drawable.right_answer);
                  textViewQuestion5.setText(R.string.right_answer);
                  linearLayoutQuestion5.setVisibility(View.VISIBLE);
                  numberOfPoints++;
        }
        else
        {
            editTextAnswer.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_wrong_answer));
            giveUpButton.setVisibility(View.VISIBLE);
        }

    }
    public void GiveUpButtonIsPressed(View view)
    {
        editTextAnswer= (EditText) findViewById(R.id.id_edit_text_view);
        editTextAnswer.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_wrong_answer));
        editTextAnswer.setText("Howard");
        imageViewQuestion5.setImageResource(R.drawable.wrong_answer);
        textViewQuestion5.setText(R.string.wrong_answer);
        linearLayoutQuestion5.setVisibility(View.VISIBLE);
        editTextAnswer.setEnabled(false);
    }

    /**
     * when the user chooses an answer all the checkboxes are displayed and if the answer was wrong, the border around the checkbox is set to red and the one around the right answer is set to green
     * @param view
     */


    /**
     * Question1: correct answer is c.
     * @param view
     */
    public void answer1aIsChecked(View view)
    {

        linearLayoutQuestion1 = (LinearLayout) findViewById(R.id.id_layout_question1);
        imageViewQuestion1= (ImageView) findViewById(R.id.id_image_question1);
        textViewQuestion1= (TextView) findViewById(R.id.id_text_question1);
        checkBoxAnswer1a= (CheckBox) findViewById(R.id.id_question1a);
        checkBoxAnswer1b= (CheckBox) findViewById(R.id.id_question1b);
        checkBoxAnswer1c= (CheckBox) findViewById(R.id.id_question1c);
        checkBoxAnswer1a.setEnabled(false);
        checkBoxAnswer1b.setEnabled(false);
        checkBoxAnswer1c.setEnabled(false);
        checkBoxAnswer1a.setBackgroundResource(R.drawable.border_wrong_answer);
        checkBoxAnswer1c.setBackgroundResource(R.drawable.border_right_answer);
        imageViewQuestion1.setImageResource(R.drawable.wrong_answer);
        textViewQuestion1.setText(R.string.wrong_answer);
        linearLayoutQuestion1.setVisibility(View.VISIBLE);

    }

    public void answer1bIsChecked(View view)
    {
        linearLayoutQuestion1 = (LinearLayout) findViewById(R.id.id_layout_question1);
        imageViewQuestion1= (ImageView) findViewById(R.id.id_image_question1);
        textViewQuestion1= (TextView) findViewById(R.id.id_text_question1);
        checkBoxAnswer1a= (CheckBox) findViewById(R.id.id_question1a);
        checkBoxAnswer1b= (CheckBox) findViewById(R.id.id_question1b);
        checkBoxAnswer1c= (CheckBox) findViewById(R.id.id_question1c);
        checkBoxAnswer1b.setBackgroundResource(R.drawable.border_wrong_answer);
        checkBoxAnswer1c.setBackgroundResource(R.drawable.border_right_answer);
        imageViewQuestion1.setImageResource(R.drawable.wrong_answer);
        textViewQuestion1.setText(R.string.wrong_answer);
        linearLayoutQuestion1.setVisibility(View.VISIBLE);
        checkBoxAnswer1a.setEnabled(false);
        checkBoxAnswer1b.setEnabled(false);
        checkBoxAnswer1c.setEnabled(false);
    }
    public void answer1cIsChecked(View view)
    {
        linearLayoutQuestion1 = (LinearLayout) findViewById(R.id.id_layout_question1);
        imageViewQuestion1= (ImageView) findViewById(R.id.id_image_question1);
        textViewQuestion1= (TextView) findViewById(R.id.id_text_question1);
        checkBoxAnswer1a= (CheckBox) findViewById(R.id.id_question1a);
        checkBoxAnswer1b= (CheckBox) findViewById(R.id.id_question1b);
        checkBoxAnswer1c= (CheckBox) findViewById(R.id.id_question1c);
        checkBoxAnswer1c.setBackgroundResource(R.drawable.border_right_answer);
        imageViewQuestion1.setImageResource(R.drawable.right_answer);
        textViewQuestion1.setText(R.string.right_answer);
        linearLayoutQuestion1.setVisibility(View.VISIBLE);
        checkBoxAnswer1a.setEnabled(false);
        checkBoxAnswer1b.setEnabled(false);
        checkBoxAnswer1c.setEnabled(false);
        numberOfPoints++;
    }

    /**
     * Question 2, the correct answer is a
     * @param view
     */
    public void answer2aIsChecked(View view)
    {
        linearLayoutQuestion2 = (LinearLayout) findViewById(R.id.id_layout_question2);
        imageViewQuestion2= (ImageView) findViewById(R.id.id_image_question2);
        textViewQuestion2= (TextView) findViewById(R.id.id_text_question2);
        checkBoxAnswer2a= (CheckBox) findViewById(R.id.id_question2a);
        checkBoxAnswer2b= (CheckBox) findViewById(R.id.id_question2b);
        checkBoxAnswer2c= (CheckBox) findViewById(R.id.id_question2c);
        checkBoxAnswer2a.setBackgroundResource(R.drawable.border_right_answer);
        imageViewQuestion2.setImageResource(R.drawable.right_answer);
        textViewQuestion2.setText(R.string.right_answer);
        linearLayoutQuestion2.setVisibility(View.VISIBLE);
        checkBoxAnswer2a.setEnabled(false);
        checkBoxAnswer2b.setEnabled(false);
        checkBoxAnswer2c.setEnabled(false);
        numberOfPoints++;
    }
    public void answer2bIsChecked(View view)
    {
        linearLayoutQuestion2 = (LinearLayout) findViewById(R.id.id_layout_question2);
        imageViewQuestion2= (ImageView) findViewById(R.id.id_image_question2);
        textViewQuestion2= (TextView) findViewById(R.id.id_text_question2);
        checkBoxAnswer2a= (CheckBox) findViewById(R.id.id_question2a);
        checkBoxAnswer2b= (CheckBox) findViewById(R.id.id_question2b);
        checkBoxAnswer2c= (CheckBox) findViewById(R.id.id_question2c);
        checkBoxAnswer2b.setBackgroundResource(R.drawable.border_wrong_answer);
        checkBoxAnswer2a.setBackgroundResource(R.drawable.border_right_answer);
        imageViewQuestion2.setImageResource(R.drawable.wrong_answer);
        textViewQuestion2.setText(R.string.wrong_answer);
        linearLayoutQuestion2.setVisibility(View.VISIBLE);
        checkBoxAnswer2a.setEnabled(false);
        checkBoxAnswer2b.setEnabled(false);
        checkBoxAnswer2c.setEnabled(false);
    }
    public void answer2cIsChecked(View view)
    {
        linearLayoutQuestion2 = (LinearLayout) findViewById(R.id.id_layout_question2);
        imageViewQuestion2= (ImageView) findViewById(R.id.id_image_question2);
        textViewQuestion2= (TextView) findViewById(R.id.id_text_question2);
        checkBoxAnswer2a= (CheckBox) findViewById(R.id.id_question2a);
        checkBoxAnswer2b= (CheckBox) findViewById(R.id.id_question2b);
        checkBoxAnswer2c= (CheckBox) findViewById(R.id.id_question2c);
        checkBoxAnswer2c.setBackgroundResource(R.drawable.border_wrong_answer);
        checkBoxAnswer2a.setBackgroundResource(R.drawable.border_right_answer);
        imageViewQuestion2.setImageResource(R.drawable.wrong_answer);
        textViewQuestion2.setText(R.string.wrong_answer);
        linearLayoutQuestion2.setVisibility(View.VISIBLE);
        checkBoxAnswer2a.setEnabled(false);
        checkBoxAnswer2b.setEnabled(false);
        checkBoxAnswer2c.setEnabled(false);
    }

    /**
     * Question 3, the correct answer is b
     * @param view
     */
    public void answer3aIsChecked(View view)
    {
        linearLayoutQuestion3 = (LinearLayout) findViewById(R.id.id_layout_question3);
        imageViewQuestion3= (ImageView) findViewById(R.id.id_image_question3);
        textViewQuestion3= (TextView) findViewById(R.id.id_text_question3);
        checkBoxAnswer3a= (CheckBox) findViewById(R.id.id_question3a);
        checkBoxAnswer3b= (CheckBox) findViewById(R.id.id_question3b);
        checkBoxAnswer3c= (CheckBox) findViewById(R.id.id_question3c);
        checkBoxAnswer3a.setBackgroundResource(R.drawable.border_wrong_answer);
        checkBoxAnswer3b.setBackgroundResource(R.drawable.border_right_answer);
        imageViewQuestion3.setImageResource(R.drawable.wrong_answer);
        textViewQuestion3.setText(R.string.wrong_answer);
        linearLayoutQuestion3.setVisibility(View.VISIBLE);
        checkBoxAnswer3a.setEnabled(false);
        checkBoxAnswer3b.setEnabled(false);
        checkBoxAnswer3c.setEnabled(false);
    }

    public void answer3bIsChecked(View view)
    {
        linearLayoutQuestion3 = (LinearLayout) findViewById(R.id.id_layout_question3);
        imageViewQuestion3= (ImageView) findViewById(R.id.id_image_question3);
        textViewQuestion3= (TextView) findViewById(R.id.id_text_question3);
        checkBoxAnswer3a= (CheckBox) findViewById(R.id.id_question3a);
        checkBoxAnswer3b= (CheckBox) findViewById(R.id.id_question3b);
        checkBoxAnswer3c= (CheckBox) findViewById(R.id.id_question3c);
        checkBoxAnswer3b.setBackgroundResource(R.drawable.border_right_answer);
        imageViewQuestion3.setImageResource(R.drawable.right_answer);
        textViewQuestion3.setText(R.string.right_answer);
        linearLayoutQuestion3.setVisibility(View.VISIBLE);
        checkBoxAnswer3a.setEnabled(false);
        checkBoxAnswer3b.setEnabled(false);
        checkBoxAnswer3c.setEnabled(false);
        numberOfPoints++;
    }


    public void answer3cIsChecked(View view)
    {
        linearLayoutQuestion3 = (LinearLayout) findViewById(R.id.id_layout_question3);
        imageViewQuestion3= (ImageView) findViewById(R.id.id_image_question3);
        textViewQuestion3= (TextView) findViewById(R.id.id_text_question3);
        checkBoxAnswer3a= (CheckBox) findViewById(R.id.id_question3a);
        checkBoxAnswer3b= (CheckBox) findViewById(R.id.id_question3b);
        checkBoxAnswer3c= (CheckBox) findViewById(R.id.id_question3c);
        checkBoxAnswer3c.setBackgroundResource(R.drawable.border_wrong_answer);
        checkBoxAnswer3b.setBackgroundResource(R.drawable.border_right_answer);
        imageViewQuestion3.setImageResource(R.drawable.wrong_answer);
        textViewQuestion3.setText(R.string.wrong_answer);
        linearLayoutQuestion3.setVisibility(View.VISIBLE);
        checkBoxAnswer3a.setEnabled(false);
        checkBoxAnswer3b.setEnabled(false);
        checkBoxAnswer3c.setEnabled(false);
    }

    /**
     * Question 4, the correct answer is b
     * @param view
     */
    public void answer4aIsChecked(View view)
    {
        linearLayoutQuestion4 = (LinearLayout) findViewById(R.id.id_layout_question4);
        imageViewQuestion4= (ImageView) findViewById(R.id.id_image_question4);
        textViewQuestion4= (TextView) findViewById(R.id.id_text_question4);
        checkBoxAnswer4a= (CheckBox) findViewById(R.id.id_question4a);
        checkBoxAnswer4b= (CheckBox) findViewById(R.id.id_question4b);
        checkBoxAnswer4c= (CheckBox) findViewById(R.id.id_question4c);
        checkBoxAnswer4a.setBackgroundResource(R.drawable.border_wrong_answer);
        checkBoxAnswer4b.setBackgroundResource(R.drawable.border_right_answer);
        imageViewQuestion4.setImageResource(R.drawable.wrong_answer);
        textViewQuestion4.setText(R.string.wrong_answer);
        linearLayoutQuestion4.setVisibility(View.VISIBLE);
        checkBoxAnswer4a.setEnabled(false);
        checkBoxAnswer4b.setEnabled(false);
        checkBoxAnswer4c.setEnabled(false);
    }

    public void answer4bIsChecked(View view)
    {
        linearLayoutQuestion4 = (LinearLayout) findViewById(R.id.id_layout_question4);
        imageViewQuestion4= (ImageView) findViewById(R.id.id_image_question4);
        textViewQuestion4= (TextView) findViewById(R.id.id_text_question4);
        checkBoxAnswer4a= (CheckBox) findViewById(R.id.id_question4a);
        checkBoxAnswer4b= (CheckBox) findViewById(R.id.id_question4b);
        checkBoxAnswer4c= (CheckBox) findViewById(R.id.id_question4c);
        checkBoxAnswer4b.setBackgroundResource(R.drawable.border_right_answer);
        imageViewQuestion4.setImageResource(R.drawable.right_answer);
        textViewQuestion4.setText(R.string.right_answer);
        linearLayoutQuestion4.setVisibility(View.VISIBLE);
        checkBoxAnswer4a.setEnabled(false);
        checkBoxAnswer4b.setEnabled(false);
        checkBoxAnswer4c.setEnabled(false);
        numberOfPoints++;
    }
    public void answer4cIsChecked(View view)
    {
        linearLayoutQuestion4 = (LinearLayout) findViewById(R.id.id_layout_question4);
        imageViewQuestion4= (ImageView) findViewById(R.id.id_image_question4);
        textViewQuestion4= (TextView) findViewById(R.id.id_text_question4);
        checkBoxAnswer4a= (CheckBox) findViewById(R.id.id_question4a);
        checkBoxAnswer4b= (CheckBox) findViewById(R.id.id_question4b);
        checkBoxAnswer4c= (CheckBox) findViewById(R.id.id_question4c);
        checkBoxAnswer4c.setBackgroundResource(R.drawable.border_wrong_answer);
        checkBoxAnswer4b.setBackgroundResource(R.drawable.border_right_answer);
        imageViewQuestion4.setImageResource(R.drawable.wrong_answer);
        textViewQuestion4.setText(R.string.wrong_answer);
        linearLayoutQuestion4.setVisibility(View.VISIBLE);
        checkBoxAnswer4a.setEnabled(false);
        checkBoxAnswer4b.setEnabled(false);
        checkBoxAnswer4c.setEnabled(false);
    }
    /**
     * Question 6, the correct answer is c
     * @param view
     */
    public void answer6aIsChecked(View view)
    {
        linearLayoutQuestion6 = (LinearLayout) findViewById(R.id.id_layout_question6);
        imageViewQuestion6= (ImageView) findViewById(R.id.id_image_question6);
        textViewQuestion6= (TextView) findViewById(R.id.id_text_question6);
        checkBoxAnswer6a= (CheckBox) findViewById(R.id.id_question6a);
        checkBoxAnswer6b= (CheckBox) findViewById(R.id.id_question6b);
        checkBoxAnswer6c= (CheckBox) findViewById(R.id.id_question6c);
        checkBoxAnswer6a.setBackgroundResource(R.drawable.border_wrong_answer);
        checkBoxAnswer6c.setBackgroundResource(R.drawable.border_right_answer);
        imageViewQuestion6.setImageResource(R.drawable.wrong_answer);
        textViewQuestion6.setText(R.string.wrong_answer);
        linearLayoutQuestion6.setVisibility(View.VISIBLE);
        checkBoxAnswer6a.setEnabled(false);
        checkBoxAnswer6b.setEnabled(false);
        checkBoxAnswer6c.setEnabled(false);

    }

    public void answer6bIsChecked(View view)
    {
        linearLayoutQuestion6 = (LinearLayout) findViewById(R.id.id_layout_question6);
        imageViewQuestion6= (ImageView) findViewById(R.id.id_image_question6);
        textViewQuestion6= (TextView) findViewById(R.id.id_text_question6);
        checkBoxAnswer6a= (CheckBox) findViewById(R.id.id_question6a);
        checkBoxAnswer6b= (CheckBox) findViewById(R.id.id_question6b);
        checkBoxAnswer6c= (CheckBox) findViewById(R.id.id_question6c);
        checkBoxAnswer6b.setBackgroundResource(R.drawable.border_wrong_answer);
        checkBoxAnswer6c.setBackgroundResource(R.drawable.border_right_answer);
        imageViewQuestion6.setImageResource(R.drawable.wrong_answer);
        textViewQuestion6.setText(R.string.wrong_answer);
        linearLayoutQuestion6.setVisibility(View.VISIBLE);
        checkBoxAnswer6a.setEnabled(false);
        checkBoxAnswer6b.setEnabled(false);
        checkBoxAnswer6c.setEnabled(false);

    }

    public void answer6cIsChecked(View view)
    {
        linearLayoutQuestion6 = (LinearLayout) findViewById(R.id.id_layout_question6);
        imageViewQuestion6= (ImageView) findViewById(R.id.id_image_question6);
        textViewQuestion6= (TextView) findViewById(R.id.id_text_question6);
        checkBoxAnswer6a= (CheckBox) findViewById(R.id.id_question6a);
        checkBoxAnswer6b= (CheckBox) findViewById(R.id.id_question6b);
        checkBoxAnswer6c= (CheckBox) findViewById(R.id.id_question6c);
        checkBoxAnswer6c.setBackgroundResource(R.drawable.border_right_answer);
        imageViewQuestion6.setImageResource(R.drawable.right_answer);
        textViewQuestion6.setText(R.string.right_answer);
        linearLayoutQuestion6.setVisibility(View.VISIBLE);
        checkBoxAnswer6a.setEnabled(false);
        checkBoxAnswer6b.setEnabled(false);
        checkBoxAnswer6c.setEnabled(false);
        numberOfPoints++;
    }

    public void receiveTheScore(View view)
    {
        TextView textViewResult = (TextView) findViewById(R.id.result_text_view);
        String result = getString(R.string.your_score_part1)+ " " + numberOfPoints + " " + getString(R.string.your_score_part2_marvel) ;
        if(numberOfPoints==0)
        {
            result=result+"\n"+getString(R.string.score_message_for_score_0_quiz1);

        }
        else if(numberOfPoints>=1 && numberOfPoints<=3)
        {
            result=result+"\n"+getString(R.string.score_message_for_score_between_1_and_3_quiz1);
        }
             else if(numberOfPoints>=4 && numberOfPoints<=5)
        {
            result=result+"\n"+getString(R.string.score_message_for_score_between_4_and_5_quiz1);
        }
               else if(numberOfPoints==6)
        {
            result=result+"\n"+getString(R.string.score_message_for_perfect_score_quiz1);
        }

        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();

    }





}
