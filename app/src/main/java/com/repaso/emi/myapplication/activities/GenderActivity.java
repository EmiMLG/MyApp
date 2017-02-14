package com.repaso.emi.myapplication.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.repaso.emi.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GenderActivity extends AppCompatActivity {

    @BindView(R.id.activity_main___select_gender)TextView selectGender;
    @BindView(R.id.activity_main___button_man)ImageView buttonMan;
    @BindView(R.id.activity_main___button_woman)ImageView buttonWoman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        buttonMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent age = new Intent(getApplicationContext(), AgeActivity.class);
                startActivity(age);

            }
        });

        buttonWoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent age = new Intent(getApplicationContext(), AgeActivity.class);
                startActivity(age);

            }
        });
    }
}
