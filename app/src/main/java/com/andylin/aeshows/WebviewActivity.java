package com.andylin.aeshows;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by admin on 8/31/2016.
 */
public class WebviewActivity extends Activity {

    private WebView webView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        //webView.loadUrl("http://www.aetv.com");
        webView.loadUrl("http://www.aetv.com/shows/60-days-in/season-2/episode-1");
        //webView.loadUrl("http://www.google.com");


    }

}