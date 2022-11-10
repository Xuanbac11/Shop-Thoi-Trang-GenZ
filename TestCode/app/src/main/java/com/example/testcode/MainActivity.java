package com.example.testcode;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  WebView oggy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oggy=new WebView(this);
        oggy.getSettings().setJavaScriptEnabled(true);
        String link="<iframe width=\"380\" height=\"320\" src=\"https://www.youtube.com/embed/xno-D8RCq1w\" title=\"Tik Tok\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>";
        oggy.loadData(link,"text/html", null);
        setContentView(oggy);

    }
}