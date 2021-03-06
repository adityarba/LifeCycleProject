package com.example.asp.lifecycleproject;


import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Rba_dkp7 on 7/21/2016.
 */
public class FragmentTwoActivity extends Fragment {

    ArrayList<String> arr = arr = new ArrayList<String>();
    private static int a =0;


    InterfaceForFragments interfaceForFragments;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Log.v("adi",getActivity().toString());

        arr.add("inside onCreateView() TWO");
        Log.d("yo","inside onCreateView() TWO");
        interfaceForFragments.intoTheList(arr);
        return inflater.inflate(R.layout.fragment_two,container,false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        arr.add("inside onActivityCreated() TWO");
        Log.d("yo","inside onActivityCreated() TWO");
        interfaceForFragments.intoTheList(arr);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            interfaceForFragments = (InterfaceForFragments) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement InterfaceForFragments");
        }

        arr.add("inside onAttach() TWO");
        Log.d("yo","inside onAttach() TWO");
        if(a == 0){
            a++;
            interfaceForFragments.intoTheList(arr);
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        arr.add("inside onCreate() TWO");
        Log.d("yo","inside onCreate() TWO");
        interfaceForFragments.intoTheList(arr);
    }

    @Override
    public void onStart() {
        super.onStart();
        arr.add("inside onStart() TWO");
        Log.d("yo","inside onStart() TWO");
        interfaceForFragments.intoTheList(arr);

    }

    @Override
    public void onResume() {
        super.onResume();
        arr.add("inside onResume() TWO");
        Log.d("yo","inside onResume() TWO");
        interfaceForFragments.intoTheList(arr);
    }

    @Override
    public void onPause() {
        super.onPause();
        arr.add("inside onPause() TWO");
        Log.d("yo","inside onPause() TWO");
        interfaceForFragments.intoTheList(arr);
    }

    @Override
    public void onStop() {
        super.onStop();
        arr.add("inside onStop() TWO");
        Log.d("yo","inside onStop() TWO");
        interfaceForFragments.intoTheList(arr);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        arr.add("inside onDestroy() TWO");
        Log.d("yo","inside onDestroy() TWO");
        interfaceForFragments.intoTheList(arr);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        arr.add("inside onDestroyView() TWO");
        Log.d("yo","inside onDestroyView() TWO");
        interfaceForFragments.intoTheList(arr);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        arr.add("inside onDetach() TWO");
        Log.d("yo","inside onDetach() TWO");
        interfaceForFragments.intoTheList(arr);

    }
}
