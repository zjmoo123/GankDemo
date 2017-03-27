package com.example.zjm.gankdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zjm.gankdemo.util.HtmlUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HtmlUtils htmlUtils =new HtmlUtils();
        htmlUtils.showHtml();
    }
}
