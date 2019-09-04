package com.example.snish.cs4261testapp;

import android.widget.Button;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity{
    protected void setOnClickListener(){
        Button bFollow = (Button)findViewById(R.id.btnFollow);
        if (bFollow.getText().toString().equalsIgnoreCase("Follow Us")) {
            bFollow.setText("Following");
        } else {
            bFollow.setText("Follow Us");
        }

    }
}
