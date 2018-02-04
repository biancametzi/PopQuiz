package com.example.android.popquiz;

import android.content.Context;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Submit (View view) {

        int score = 0;
        int scoreGranularity = 100;

        // Check answers for each question
        // First question
        RadioButton firstQuestionFirstRadioButton = (RadioButton) findViewById(R.id.first_q_first_answer);
        boolean hasFirstQuestionRadioButton = firstQuestionFirstRadioButton.isChecked();

        if(hasFirstQuestionRadioButton){
            score += scoreGranularity;
        }

        // Second question
        CheckBox secondQuestionFirstCheckBox = (CheckBox) findViewById(R.id.second_q_first_answer);
        boolean hasSecondQuestionFirstCheckBox = secondQuestionFirstCheckBox.isChecked();

        CheckBox secondQuestionSecondCheckBox = (CheckBox) findViewById(R.id.second_q_second_answer);
        boolean hasSecondQuestionSecondCheckBox = secondQuestionSecondCheckBox.isChecked();

        CheckBox secondQuestionThirdCheckBox = (CheckBox) findViewById(R.id.second_q_third_answer);
        boolean hasSecondQuestionThirdCheckBox = secondQuestionThirdCheckBox.isChecked();

        if (hasSecondQuestionFirstCheckBox == true && hasSecondQuestionThirdCheckBox == true && hasSecondQuestionSecondCheckBox == false) {
            score += scoreGranularity;
        }

        // Third question
        EditText thirdQuestion = (EditText) findViewById(R.id.third_q_lyrics_answer);
        String thirdQuestionAnswer = thirdQuestion.getText().toString();

        String correctAnswer = getString(R.string.third_question_answer);

        if (correctAnswer.equals(thirdQuestionAnswer)) {
            score += scoreGranularity;
        }

        // Fourth question
        RadioButton fourthQuestionThirdRadioButton = (RadioButton) findViewById(R.id.fourth_q_third_answer);
        boolean hasFourthQuestionRadioButton = fourthQuestionThirdRadioButton.isChecked();

        if(hasFourthQuestionRadioButton){
            score += scoreGranularity;
        }

        // Fifth question
        CheckBox fifthQuestionFirstCheckBox = (CheckBox) findViewById(R.id.fifth_q_first_answer);
        boolean hasFifthQuestionFirstCheckBox = fifthQuestionFirstCheckBox.isChecked();

        CheckBox fifthQuestionSecondCheckBox = (CheckBox) findViewById(R.id.fifth_q_second_answer);
        boolean hasFifthQuestionSecondCheckBox = fifthQuestionSecondCheckBox.isChecked();

        CheckBox fifthQuestionThirdCheckBox = (CheckBox) findViewById(R.id.fifth_q_third_answer);
        boolean hasFifthQuestionThirdCheckBox = fifthQuestionThirdCheckBox.isChecked();

        if(hasFifthQuestionFirstCheckBox && hasFifthQuestionSecondCheckBox && hasFifthQuestionThirdCheckBox) {
            score += scoreGranularity;
        }

        Toast.makeText(this, "Your score is: " + score, Toast.LENGTH_SHORT).show();

    }

}
