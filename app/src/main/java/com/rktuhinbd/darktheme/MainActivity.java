package com.rktuhinbd.darktheme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class MainActivity extends AppCompatActivity {

    private Button btnLightTheme;
    private Button btnDarkTheme;
    private Button btnNextActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.Theme_Dark);
        } else {
            setTheme(R.style.Theme_Light);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLightTheme = findViewById(R.id.btnLightTheme);
        btnDarkTheme = findViewById(R.id.btnDarkTheme);
        btnNextActivity = findViewById(R.id.btnNextActivity);

        btnLightTheme.setOnClickListener(v -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO));

        btnDarkTheme.setOnClickListener(v -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES));

        btnNextActivity.setOnClickListener(v -> startActivity(new Intent(this, SecondActivity.class)));
    }
}