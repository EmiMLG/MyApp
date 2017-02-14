package com.repaso.emi.myapplication.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.repaso.emi.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AgeActivity extends AppCompatActivity {

    @BindView(R.id.activity_main___select_age)TextView selectAge;
    @BindView(R.id.activity_age___button_less_20)Button lessTwenty;
    @BindView(R.id.activity_age___button_21)Button twentyOne;
    @BindView(R.id.activity_age___button_36)Button threetyThree;
    @BindView(R.id.activity_age___button_52)Button fiftyTwo;
    @BindView(R.id.activity_age___button_greater_65)Button sixtyFive;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        ButterKnife.bind(this);

        lessTwenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        twentyOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        threetyThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        fiftyTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sixtyFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
