package com.blovvme.zoo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSecondActivity = (Button) findViewById(R.id.btnSecondActivity);


    }

    //Go to second activity
    public void isPress(View view) {
        Intent intent = new Intent( this,SecondActivity.class);
        startActivity(intent);
    }

}
