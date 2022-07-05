package com.example.multiplethemes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Constants.currentTheme = "GeneralTheme";
        ThemeManager.set(this, Constants.currentTheme);

        setContentView(R.layout.activity_home_page);


    }
}