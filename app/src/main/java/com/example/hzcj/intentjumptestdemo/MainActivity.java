package com.example.hzcj.intentjumptestdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView= (TextView) findViewById(R.id.tv_jump);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.example.hzcj.intentjumptestdemo.ACTION_START");
                intent.addCategory("com.example.hzcj.intentjumptestdemo.MY_CATEGORY");
                startActivity(intent);
            }
        });
    }
}
