package com.opentechspace.giittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Yes", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Yep", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "No", Toast.LENGTH_SHORT).show();
    }
}