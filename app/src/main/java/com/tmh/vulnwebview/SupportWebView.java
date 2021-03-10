package com.tmh.vulnwebview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SupportWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support_web_view);
        setTitle("Support");
        loadWebView();
    }

    public void loadWebView() {
        WebView webView = findViewById(R.id.webview2);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true); //Enabling javascript
        Map<String, String> extraHeaders = new HashMap<String, String>();
        extraHeaders.put("Authorization",getUserToken()); //Sending authorization header to server with user token

        webView.addJavascriptInterface(new WebAppInterface(this), "Android"); //Expose getUserToken java method to browser JS

        webView.loadUrl(getIntent().getStringExtra("support_url"), extraHeaders); //Launching web view
    }

    public static String getUserToken() {
        String uuid = UUID.randomUUID().toString(); //Generate user token
        return uuid;
    }
}