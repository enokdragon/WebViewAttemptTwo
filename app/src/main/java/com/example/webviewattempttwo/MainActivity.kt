package com.example.webviewattempttwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        webViewSetup()
    }


    private fun webViewSetup(){
        val wb_webView = findViewById<WebView>(R.id.wb_webView)
        wb_webView.webViewClient = WebViewClient()

        wb_webView.apply {
            settings.allowFileAccess
            loadUrl("file:///android_asset/index.html")

        }
    }
}