package com.blovvme.zoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    private static final String TAG = "Fourth";

    TextView tvName;
    TextView tvDiet;
    TextView tvStatus;
    TextView tvRange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Intent intent = getIntent();

        Animals animals = (Animals) intent.getSerializableExtra("Animals");
        Log.d(TAG,"onCreate: " + animals.toString());

        tvName = (TextView) findViewById(R.id.tvName);
        tvDiet = (TextView)findViewById(R.id.tvDiet);
        tvStatus = (TextView)findViewById(R.id.tvStatus);
        tvRange = (TextView)findViewById(R.id.tvRange);

        tvName.setText(animals.getName().toString());
        tvDiet.setText(animals.getDiet().toString());
        tvStatus.setText(animals.getStatus().toString());
        tvRange.setText(animals.getRange().toString());

    }
}
