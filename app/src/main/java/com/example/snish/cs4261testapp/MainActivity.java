package com.example.snish.cs4261testapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_page);
        final Button bFollow = (Button) findViewById(R.id.btnFollow);
        bFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bFollow.getText().toString().equalsIgnoreCase("Follow Us")) {
                    bFollow.setText("Following");
                } else {
                    bFollow.setText("Follow Us");
                }
            }
        });
    }
}
