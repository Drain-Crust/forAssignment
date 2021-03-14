package com.example.forassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView mrgsWebView = findViewById(R.id.webviewID);
        mrgsWebView.loadUrl("https://www.mrgs.school.nz/");
    }
}