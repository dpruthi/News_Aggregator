package com.deep.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;




public class NewsMain extends AppCompatActivity {
      Spinner country ;
    ArrayAdapter<String> adapter;
   Button submit;
    String citm;
    Intent intent;

    void initSpinner(){

        country = (Spinner)findViewById(R.id.country);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item);

        adapter.add("--Select Country--"); //0
        adapter.add("U.S.A");
        adapter.add("India");
        adapter.add("U.K");
       // adapter.add("Canada");
       // adapter.add("Russia");  //n-1

      country.setAdapter(adapter);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_main);
        initSpinner();
        submit = (Button)findViewById(R.id.button);

        country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                citm = adapter.getItem(pos);

                if (pos != 0)
                    Toast.makeText(NewsMain.this, "You Selected:: " + citm, Toast.LENGTH_LONG).show();

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

                    case "U.S.A":
                        intent = new Intent(NewsMain.this, country.class);
                        startActivity(intent);
                        break;

                    case "U.K":
                        intent = new Intent(NewsMain.this, Uk.class);
                        startActivity(intent);
                        break;

                    case "India":
                        intent = new Intent(NewsMain.this, India.class);
                        startActivity(intent);
                        break;


                }
            }
        });
    }
}
