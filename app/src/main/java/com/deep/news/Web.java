package com.deep.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Switch;

public class Web extends AppCompatActivity {

    
    WebView webView;  ;
   // String url = "http://aajtak.intoday.in/";

    void Aajtak(){

        webView = (WebView)findViewById(R.id.webview);
        // Load URL in WebView
        WebViewClient client = new WebViewClient();
        webView.setWebViewClient(client);
        webView.getSettings().setJavaScriptEnabled(true);
        Intent rcv = getIntent();
        String url = rcv.getStringExtra("AajUrl");
        webView.loadUrl ( url); // This needs internet connectivity. You must grant permission in the Manifest File
    }

    void ZeeNews(){

        Intent rcv = getIntent();
         String url = rcv.getStringExtra("ZeeUrl");
        webView.loadUrl (url); // This needs internet connectivity. You must grant permission in the Manifest File
    }

    void AbpNews(){

        Intent rcv = getIntent();
        String url = rcv.getStringExtra("AbpUrl");
        webView.loadUrl (url); // This needs internet connectivity. You must grant permission in the Manifest File
    }

    void HTimes(){

        Intent rcv = getIntent();
        String url = rcv.getStringExtra("HtUrl");
        webView.loadUrl (url); // This needs internet connectivity. You must grant permission in the Manifest File
    }

    void Tribune(){

        Intent rcv = getIntent();
        String url = rcv.getStringExtra("TTUrl");
        webView.loadUrl (url); // This needs internet connectivity. You must grant permission in the Manifest File
    }
    void Nbc(){

        Intent rcv = getIntent();
        String url = rcv.getStringExtra("NbcUrl");
        webView.loadUrl (url); // This needs internet connectivity. You must grant permission in the Manifest File
    }
    void NY(){

        Intent rcv = getIntent();
        String url = rcv.getStringExtra("NYUrl");
        webView.loadUrl (url); // This needs internet connectivity. You must grant permission in the Manifest File
    }
    void Fox(){

        Intent rcv = getIntent();
        String url = rcv.getStringExtra("FoxUrl");
        webView.loadUrl (url); // This needs internet connectivity. You must grant permission in the Manifest File
    }
    void bbc(){

        Intent rcv = getIntent();
        String url = rcv.getStringExtra("BBCUrl");
        webView.loadUrl (url); // This needs internet connectivity. You must grant permission in the Manifest File
    }
    void sky(){

        Intent rcv = getIntent();
        String url = rcv.getStringExtra("SkyUrl");
        webView.loadUrl (url); // This needs internet connectivity. You must grant permission in the Manifest File
    }
    void guard(){

        Intent rcv = getIntent();
        String url = rcv.getStringExtra("GuardianUrl");
        webView.loadUrl (url); // This needs internet connectivity. You must grant permission in the Manifest File
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Aajtak();
        ZeeNews();
        AbpNews();
        HTimes();
        Tribune();
        Nbc();
        NY();
        Fox();
        bbc();
        guard();
        sky();

    }
}
