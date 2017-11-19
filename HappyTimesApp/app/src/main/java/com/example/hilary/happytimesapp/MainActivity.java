package com.example.hilary.happytimesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void customer(View view) {
        Intent cust = new Intent(MainActivity.this,CustomerActivity.class);
        startActivity(cust);
    }

    public void newAccount(View view) {
        Intent New_account = new Intent(MainActivity.this, New_AccontActivity.class);
        startActivity(New_account);
    }
}