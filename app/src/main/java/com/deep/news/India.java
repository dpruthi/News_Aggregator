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

public class India extends AppCompatActivity {
    String citm;
    Button submit;
    Spinner channel;
    ArrayAdapter<String> adapter;
    Intent intent;
    TextView url;

    void initSpinner(){

        channel = (Spinner)findViewById(R.id.channel);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item);

        adapter.add("--Select newspaper or channel--"); //0
        adapter.add("Aaj Tak");
        adapter.add("Zee News");
        adapter.add("Abp News");
        adapter.add("Hindustan Times");
        adapter.add("The Tribune");  //n-1

        channel.setAdapter(adapter);





    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india);
        initSpinner();
       submit = (Button)findViewById(R.id.submit);
        url = (TextView) findViewById(R.id.textView3);

        channel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                citm = adapter.getItem(pos);

                if (pos != 0)
                    Toast.makeText(India.this, "You Selected:: " + citm, Toast.LENGTH_LONG).show();

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

                    case "Aaj Tak":
                        intent = new Intent(India.this, Web.class);
                        String AajUrl = "http://aajtak.intoday.in/";
                        intent.putExtra("AajUrl",AajUrl);
                        startActivity(intent);


                        break;

                    case "Zee News":
                        intent = new Intent(India.this, Web.class);
                        String ZeeUrl = "http://zeenews.india.com/";
                        intent.putExtra("ZeeUrl",ZeeUrl);

                        startActivity(intent);
                        break;

                    case "Abp News":
                        intent = new Intent(India.this, Web.class);
                        String AbpUrl = "http://abpnews.abplive.in/";
                        intent.putExtra("AbpUrl",AbpUrl);
                        startActivity(intent);
                        break;


                    case "Hindustan Times":
                        intent = new Intent(India.this, Web.class);
                        String HtUrl = "http://www.hindustantimes.com/";
                        intent.putExtra("HtUrl",HtUrl);
                        startActivity(intent);
                        break;


                    case "The Tribune":
                        intent = new Intent(India.this, Web.class);
                        String TTUrl = "http://www.tribuneindia.com/";
                        intent.putExtra("TTUrl",TTUrl);
                        startActivity(intent);
                        break;


                }
            }
        });
    }

}

