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

public class country extends AppCompatActivity {
    String citm;
    Button submit;
    Spinner channel;
    ArrayAdapter<String> adapter;
    Intent intent;

    void initSpinner() {

        channel = (Spinner) findViewById(R.id.channel);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item);

        adapter.add("--Select newspaper or channel--"); //0
        adapter.add("Fox news");
        adapter.add("Nbc News");
      //  adapter.add("Cnn");
        adapter.add("NY Times");
       // adapter.add("Kiosko");  //n-1

        channel.setAdapter(adapter);

    }





        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
            initSpinner();
            submit = (Button)findViewById(R.id.submit);

            channel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                    citm = adapter.getItem(pos);

                    if (pos != 0)
                        Toast.makeText(country.this, "You Selected:: " + citm, Toast.LENGTH_LONG).show();

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

                        case "Fox news":
                            intent = new Intent(country.this, Web.class);
                            String FoxUrl = "http://www.foxnews.com/";
                            intent.putExtra("FoxUrl",FoxUrl);
                            startActivity(intent);
                            break;

                        case "Nbc News":
                            intent = new Intent(country.this, Web.class);
                            String NbcUrl = "http://www.nbcnews.com/";
                            intent.putExtra("NbcUrl",NbcUrl);
                            startActivity(intent);
                            break;

                        case "NY Times":
                            String NYUrl = "https://www.nytimes.com/";
                            intent.putExtra("NYUrl",NYUrl);
                            intent = new Intent(country.this, Web.class);
                            startActivity(intent);
                            break;


                    }
                }
            });
        }

}

