package com.harryjamesuk.golfscorecard;

import android.app.ListActivity;
import android.os.Bundle;

public class MainActivity extends ListActivity {
    private Hole[] mHoles = new Hole[18];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize holes
        int strokes = 0;
        for (int i = 0; i < mHoles.length; i++) {
            mHoles[i] = new Hole("Hole " + (i+1) + " :", strokes);
        }

        ListAdapter mListAdapter = new ListAdapter(this, mHoles);
        setListAdapter(mListAdapter);
    }
}
