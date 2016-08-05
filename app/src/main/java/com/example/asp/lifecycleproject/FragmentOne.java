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
public class FragmentOne extends Fragment {
    ListView lv;
    ArrayList<String> arr = arr = new ArrayList<String>();
    private static int a =0;


    InterfaceForFragments interfaceForFragments;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Log.v("adi",getActivity().toString());

        arr.add("inside onCreateView() one");
        Log.d("yo","inside onCreateView() ONE");
        interfaceForFragments.intoTheList(arr);
        return inflater.inflate(R.layout.fragment_one,container,false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        arr.add("inside onActivityCreated() one");
        Log.d("yo","inside onActivityCreated() ONE");
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

        arr.add("inside onAttach() ONE");
        Log.d("yo","inside onAttach() ONE");

            interfaceForFragments.intoTheList(arr);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        arr.add("inside onCreate() ONE");
        Log.d("yo","inside onCreate() ONE");
//        interfaceForFragments.intoTheList(arr);
    }

    @Override
    public void onStart() {
        super.onStart();
        arr.add("inside onStart() ONE");
        Log.d("yo","inside onStart() ONE");
//        interfaceForFragments.intoTheList(arr);

    }

    @Override
    public void onResume() {
        super.onResume();
        arr.add("inside onResume() ONE");
        Log.d("yo","inside onResume() ONE");
        interfaceForFragments.intoTheList(arr);
    }

    @Override
    public void onPause() {
        super.onPause();
        arr.add("inside onPause() ONE");
        Log.d("yo","inside onPause() ONE");
        interfaceForFragments.intoTheList(arr);
    }

    @Override
    public void onStop() {
        super.onStop();
        arr.add("inside onStop() ONE");
        Log.d("yo","inside onStop() ONE");
        interfaceForFragments.intoTheList(arr);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        arr.add("inside onDestroy() ONE");
        Log.d("yo","inside onDestroy() ONE");
//        interfaceForFragments.intoTheList(arr);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        arr.add("inside onDestroyView() ONE");
        Log.d("yo","inside onDestroyView() ONE");
//        interfaceForFragments.intoTheList(arr);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        arr.add("inside onDetach() ONE");
        Log.d("yo","inside onDetach() ONE");
//        interfaceForFragments.intoTheList(arr);

    }

}
