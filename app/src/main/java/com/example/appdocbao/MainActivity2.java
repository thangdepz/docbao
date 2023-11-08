package com.example.appdocbao;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {
    WebView webView;
//Huỳnh Kim Thắng - 21115053120145
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        webView = (WebView) findViewById(R.id.webview);
        Intent intent = getIntent();
        webView.loadUrl(intent.getStringExtra("link"));
        webView.setWebViewClient(new WebViewClient());
    }
}