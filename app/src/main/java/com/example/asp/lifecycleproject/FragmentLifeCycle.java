package com.example.asp.lifecycleproject;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class FragmentLifeCycle extends Activity implements InterfaceForFragments {
    private static final String TAG = "FragmentLifeCycle";
    FragmentManager manager;
    ListView lv;
    public static Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fragment_lifecycle);
        this.context = this.getApplicationContext();

        lv = (ListView) findViewById(R.id.fragment_listview);
        manager = getFragmentManager();

        Log.d("yo","Inside onCreate()");
        Button b = (Button) findViewById(R.id.button1_frag_trans);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("yo", "Add 1");
                FragmentOne f1 = new FragmentOne();
                FragmentTransaction trans = manager.beginTransaction();
                trans.add(R.id.fragment_display, f1, "one");
                trans.addToBackStack(null);
                trans.commit();
            }
        });

    }


    public void add1(View view) {

    }

    public void add2(View view) {
        Log.d("yo", "Add 2");
        FragmentTwoActivity f2 = new FragmentTwoActivity();
        FragmentTransaction trans = manager.beginTransaction();
        trans.add(R.id.fragment_display, f2, "two");
        trans.addToBackStack(null);
        trans.commit();
    }

    public void replace1(View view) {
        Log.d("yo", "Replace 1");
        FragmentTwoActivity f2 = new FragmentTwoActivity();
        FragmentTransaction trans = manager.beginTransaction();
        trans.addToBackStack(null);
        trans.replace(R.id.fragment_display, f2, "two");
        trans.commit();
    }

    public void replace2(View view) {
        Log.d("yo", "Replace 2");
        FragmentOne f1 = new FragmentOne();
        FragmentTransaction trans = manager.beginTransaction();
        trans.addToBackStack(null);
        trans.replace(R.id.fragment_display, f1, "two");
        trans.commit();
    }

    public void remove1(View view) {
        Log.d("yo", "Remove 1");
        FragmentOne f1 = (FragmentOne) manager.findFragmentByTag("one");
        FragmentTransaction trans = manager.beginTransaction();
        if (f1 != null) {
            trans.remove(f1);
            trans.commit();
        } else {
            Toast.makeText(this, "No ONE to remove", Toast.LENGTH_SHORT).show();
        }
    }

    public void remove2(View view) {
        Log.d("yo", "Remove 1");
        FragmentTwoActivity f2 = (FragmentTwoActivity) manager.findFragmentByTag("two");
        FragmentTransaction trans = manager.beginTransaction();
        if (f2 != null) {
            trans.remove(f2);
            trans.commit();
        } else {
            Toast.makeText(this, "No TWO to replace", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: ");

    }

    public void clearList(View view) {
        lv.setAdapter(null);
    }

    public void intoTheList(ArrayList<String> arr) {
//            Toast.makeText(context,"sdf",Toast.LENGTH_SHORT).show();
        ListAdapter adapter = new ArrayAdapter<String>(context, R.layout.textview, arr);
        lv.setAdapter(adapter);
    }

    public void insertIntoListview(ArrayList<String> msg){
        ListAdapter adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.textview,msg);
        lv.setAdapter(adapter);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("yo","Inside onStart()");

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("yo","Inside onPostResume()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("yo","Inside onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        lv.setAdapter(null);
        Log.d("yo", "Inside onPause()");
    }
//
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        Log.d("yo","Inside onSavedInstanceState()");
//    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("yo","Inside onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("yo","Inside onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("yo","Inside onRestart()");
    }

    @Override
    public void finish() {
        super.finish();
        Log.d("yo","Inside finish()");
    }

    @Override
    public void finishActivity(int requestCode) {
        super.finishActivity(requestCode);
        Log.d("yo","Inside finishActivity()");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);


    }}
