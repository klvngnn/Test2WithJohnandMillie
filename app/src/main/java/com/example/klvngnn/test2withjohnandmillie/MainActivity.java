package com.example.klvngnn.test2withjohnandmillie;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView testwebviews = (WebView) findViewById(R.id.whatever);
        testwebviews.loadUrl("https://blooming-mountain-15304.herokuapp.com/");
    }
}
