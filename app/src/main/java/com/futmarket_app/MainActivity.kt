package com.futmarket_app;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    /**
     * Called when the activity is starting. This is where most initialization should go: calling
     * [AppCompatActivity.setContentView] to inflate the activity's UI, using
     * [AppCompatActivity.findViewById] to programmatically interact with widgets in the UI.
     *
     * @param savedInstanceState If non-null, this fragment is being re-constructed
     * from a previous saved state as given here.
     * @see AppCompatActivity.onCreate
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}