package com.deep.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Uk extends AppCompatActivity {
    String citm;
    Button submit;
    Spinner channel;
    ArrayAdapter<String> adapter;
    Intent intent;
    TextView url;

    void initSpinner(){

        channel = (Spinner)findViewById(R.id.spinner2);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item);

        adapter.add("--Select newspaper or channel--"); //0
        adapter.add("BBC");
        adapter.add("The Guardian");
        adapter.add("Sky News");
        //adapter.add("Hindustan Times");
        //adapter.add("The Tribune");  //n-1

        channel.setAdapter(adapter);





    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uk);

        initSpinner();
        submit = (Button)findViewById(R.id.button2);
        url = (TextView) findViewById(R.id.textView5);

        channel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                citm = adapter.getItem(pos);

                if (pos != 0)
                    Toast.makeText(Uk.this, "You Selected:: " + citm, Toast.LENGTH_LONG).show();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                switch(citm){

                    case "BBC":
                        intent = new Intent(Uk.this, Web.class);
                        String BBCUrl = "http://www.bbc.com/";
                        intent.putExtra("BBCUrl",BBCUrl);
                        startActivity(intent);


                        break;

                    case "The Guardian":
                        intent = new Intent(Uk.this, Web.class);
                        String GuardianUrl = "https://www.theguardian.com";
                        intent.putExtra("GuardianUrl",GuardianUrl);

                        startActivity(intent);
                        break;

                    case "Sky News":
                        intent = new Intent(Uk.this, Web.class);
                        String SkyUrl = "http://news.sky.com/";
                        intent.putExtra("Sky",SkyUrl);
                        startActivity(intent);
                        break;



                }
            }
        });
    }

}
