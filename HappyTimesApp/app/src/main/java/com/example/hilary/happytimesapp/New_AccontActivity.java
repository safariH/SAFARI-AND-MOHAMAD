package com.example.hilary.happytimesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class New_AccontActivity extends AppCompatActivity {
private Button mFireBaseBton;
    private DatabaseReference DataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__accont);
        mFireBaseBton = (Button) findViewById(R.id.button1);
        DataBase = FirebaseDatabase.getInstance ().getReference();
        mFireBaseBton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }
}
