package com.example.asp.lifecycleproject;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Rba_dkp7 on 8/5/2016.
 */
public class ActivityLifeCycle extends Activity {
    ListView lv ;
    public ArrayList<String> msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_lifecycle);
        msg = new ArrayList<String>();

        lv = (ListView)findViewById(R.id.activity_listview);
    }

    public void insertIntoListview(ArrayList<String> msg){
        ListAdapter adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.textview,msg);
        lv.setAdapter(adapter);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("yo","Inside onStart()");
        msg.add("Inside onStart()");
        insertIntoListview(msg);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("yo","Inside onPostResume()");
        msg.add("Inside onPostResume()");
        insertIntoListview(msg);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("yo","Inside onResume()");
        msg.add("Inside onResume()");
        insertIntoListview(msg);
    }

    @Override
    protected void onPause() {
        super.onPause();
        lv.setAdapter(null);
        Log.d("yo","Inside onPause()");
        msg.add("Inside onPause()");
        insertIntoListview(msg);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d("yo","Inside onPostCreate()");
        msg.add("Inside onPostCreate()");
        insertIntoListview(msg);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("yo","Inside onSavedInstanceState()");
        msg.add("Inside onSavedInstanceState()");
        insertIntoListview(msg);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("yo","Inside onStop()");
        msg.add("Inside onStop()");
        insertIntoListview(msg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("yo","Inside onDestroy()");
        msg.add("Inside onDestroy()");
        insertIntoListview(msg);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("yo","Inside onRestart()");
        msg.add("Inside onRestart()");
        insertIntoListview(msg);
    }

    @Override
    public void finish() {
        super.finish();
        Log.d("yo","Inside finish()");
        msg.add("Inside finish()");
        insertIntoListview(msg);
    }

    @Override
    public void finishActivity(int requestCode) {
        super.finishActivity(requestCode);
        Log.d("yo","Inside finishActivity()");
        msg.add("Inside finishActivity()");
        insertIntoListview(msg);
    }
}
