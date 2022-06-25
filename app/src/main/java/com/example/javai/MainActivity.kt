package com.example.javai

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this)

        webView.settings.javaScriptEnabled=true

        setContentView(webView)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://google.com")
    }
}