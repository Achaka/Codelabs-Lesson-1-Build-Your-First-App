package com.example.android.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private static final String LOG_TAG_EXCEPTION = "Exception";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "Happy Birthday to Cthulhu");
        try {
            exceptionGenerator();
        } catch (RuntimeException e) {
            Log.e(LOG_TAG_EXCEPTION, e.getMessage());
        }
    }

    public void exceptionGenerator() throws RuntimeException {
        throw new RuntimeException("Generated Exception");
    }
}