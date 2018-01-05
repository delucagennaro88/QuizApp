package com.example.utente.quizapp;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    final String Q1_ANSWER = "leonardo";
    final String Q2_ANSWER = "sodoma";
    final String Q3_ANSWER = "michelangelo";
    final String Q4_ANSWER = "athens";
    final int Q6_ANSWER = R.id.d6_option_two;
    final int Q7_ANSWER = R.id.d7_option_one;
    final int Q8_ANSWER = R.id.d8_option_three;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkQuiz(View v) {
        ArrayList<String> incorrectAnswersList = new ArrayList<String>();

        int numberOfQuestionsCorrect = 0;

        if (checkQuestion1()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Domanda 1");
        }

        if (checkQuestion2()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Domanda 2");
        }

        if (checkQuestion3()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Domanda 3");
        }

        if (checkQuestion4()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Domanda 4");
        }

        if (checkQuestion5()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Domanda 5");
        }

        if (checkQuestion6()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Domanda 6");
        }

        if (checkQuestion7()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Domanda 7");
        }

        if (checkQuestion8()) {
            numberOfQuestionsCorrect++;
        } else {
            incorrectAnswersList.add("Domanda 8");
        }


        StringBuilder sb = new StringBuilder();
        for (String s : incorrectAnswersList) {
            sb.append(s);
            sb.append("\n");
        }

        Context context = getApplicationContext();
        CharSequence text = "You got " + numberOfQuestionsCorrect + "/8 answers right.\n\nRecheck the following:\n" + sb.toString();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


    private boolean checkQuestion1() {
        EditText et = (EditText) findViewById(R.id.d1_edit_text);

        return et.getText().toString().equalsIgnoreCase(Q1_ANSWER);
    }

    private boolean checkQuestion2() {
        EditText et = (EditText) findViewById(R.id.d2_edit_text);

        return et.getText().toString().equalsIgnoreCase(Q2_ANSWER);
    }

    private boolean checkQuestion3() {
        EditText et = (EditText) findViewById(R.id.d3_edit_text);

        return et.getText().toString().equalsIgnoreCase(Q3_ANSWER);
    }

    private boolean checkQuestion4() {
        EditText et = (EditText) findViewById(R.id.d4_edit_text);

        return et.getText().toString().equalsIgnoreCase(Q4_ANSWER);
    }

    private boolean checkQuestion5() {
        CheckBox c1 = (CheckBox) findViewById(R.id.d5_first_checkbox);
        CheckBox c2 = (CheckBox) findViewById(R.id.d5_second_checkbox);
        CheckBox c3 = (CheckBox) findViewById(R.id.d5_third_checkbox);

        if (c1.isChecked() && c2.isChecked() && !c3.isChecked()) {
            return true;
        }

        return false;
    }


    private boolean checkQuestion6() {
        RadioGroup rg = (RadioGroup) findViewById(R.id.d6_radio_group);

        if (rg.getCheckedRadioButtonId() == Q6_ANSWER) {
            return true;
        }

        return false;
    }

    private boolean checkQuestion7() {
        RadioGroup rg = (RadioGroup) findViewById(R.id.d7_radio_group);

        if (rg.getCheckedRadioButtonId() == Q7_ANSWER) {
            return true;
        }

        return false;
    }

    private boolean checkQuestion8() {
        RadioGroup rg = (RadioGroup) findViewById(R.id.d8_radio_group);

        if (rg.getCheckedRadioButtonId() == Q8_ANSWER) {
            return true;
        }

        return false;
    }


}

