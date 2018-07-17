package com.android.demo_app.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        // When button pressed print what is in the text field
        EditText myText = (EditText) findViewById(R.id.userTextField);
        EditText myTextp = (EditText) findViewById(R.id.passwordField);
        Log.i("Info","Button pressed, textField value "+myText.getText().toString() + " and Password "+myTextp.getText().toString() );

        Toast.makeText(MainActivity.this,"Hello "+myText.getText().toString(),Toast.LENGTH_SHORT).show();

        //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



}
