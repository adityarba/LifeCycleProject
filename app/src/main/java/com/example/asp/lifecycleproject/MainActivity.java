package com.example.asp.lifecycleproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void gotoFragmentLifecycle(View view) {
        Intent i = new Intent(MainActivity.this,FragmentLifeCycle.class);
        startActivity(i);
    }

    public void gotoActivityLifecycle(View view) {
        Intent i1 = new Intent(MainActivity.this,ActivityLifeCycle.class);
        startActivity(i1);
    }
}
