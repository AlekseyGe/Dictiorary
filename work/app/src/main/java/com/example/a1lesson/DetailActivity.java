package com.example.a1lesson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        WebView WB = findViewById(R.id.webView);

        Intent intent = getIntent();
        String resName = "n" + intent.getIntExtra("title", 0);
        Context con = getBaseContext();

        String text = readRawTextFile(con, getResources().getIdentifier(resName, "raw", "com.example.a1lesson"));
        WB.loadDataWithBaseURL(null, text, "text/html", "en_US", null);

    }

    private String readRawTextFile(Context context, int resId) {
        InputStream inpStr = context.getResources().openRawResource(resId);
        InputStreamReader inpRead = new InputStreamReader(inpStr);
        BufferedReader buffRead = new BufferedReader((inpRead));
        String line;
        StringBuilder bulder = new StringBuilder();

        try {
            while ((line = buffRead.readLine()) != null){
                bulder.append(line);
                bulder.append("<br>");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bulder.toString();
    }

}
