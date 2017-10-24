package com.coderpig.app.zombie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(BuildConfig.DEBUG) Toast.makeText(this, "debug", Toast.LENGTH_SHORT).show();
        else Toast.makeText(this, "release", Toast.LENGTH_SHORT).show();
    }
}
