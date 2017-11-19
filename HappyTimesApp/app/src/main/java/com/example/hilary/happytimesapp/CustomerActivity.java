package com.example.hilary.happytimesapp;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class CustomerActivity extends AppCompatActivity {


    String[] items={"Vegas","Spancies","Nichoz","Lake View"};

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = CustomerActivity.this;


        int configuration = getResources().getConfiguration().orientation;
        if (configuration == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.fragment_potrait);
            ListView listView = (ListView) findViewById(R.id.listv);

            ListAdapter adapter = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, items);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout rel1 = (RelativeLayout) findViewById(R.id.vegas);
                RelativeLayout rel2 = (RelativeLayout) findViewById(R.id.spancies);
                RelativeLayout rel3 = (RelativeLayout) findViewById(R.id.nicoz);
                RelativeLayout rel4 = (RelativeLayout) findViewById(R.id.lakeV);


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String user_chose = String.valueOf(parent.getItemAtPosition(position));
                    switch (user_chose) {
                        case "bags":

                            rel1.setVisibility(View.VISIBLE);
                            rel2.setVisibility(View.INVISIBLE);
                            rel3.setVisibility(view.INVISIBLE);
                            rel4.setVisibility(view.INVISIBLE);

                            break;
                        case "clothes":

                            rel1.setVisibility(View.INVISIBLE);
                            rel2.setVisibility(View.VISIBLE);
                            rel3.setVisibility(view.INVISIBLE);
                            rel4.setVisibility(view.INVISIBLE);
                            break;
                        case "fruits":

                            rel1.setVisibility(View.INVISIBLE);
                            rel2.setVisibility(View.INVISIBLE);
                            rel3.setVisibility(view.VISIBLE);
                            rel4.setVisibility(view.INVISIBLE);
                            break;
                        case "vegetable":

                            rel1.setVisibility(View.INVISIBLE);
                            rel2.setVisibility(View.INVISIBLE);
                            rel3.setVisibility(view.INVISIBLE);
                            rel4.setVisibility(view.VISIBLE);
                            break;

                    }
                }
            });

        }

    }
}

