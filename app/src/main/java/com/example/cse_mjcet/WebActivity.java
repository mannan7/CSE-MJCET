package com.example.cse_mjcet;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {
    WebView webView;
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.activity_web);
        webView=findViewById(R.id.webview);
        url=getIntent().getStringExtra("URL");
        webView.setWebViewClient(new mywebclient());
        WebSettings webSetting = webView.getSettings();
        webSetting.setBuiltInZoomControls(true);
        webView.setWebChromeClient(new WebChromeClient()
        {
            public void onProgressChanged(WebView webView,int Progress)
            {
                setTitle("Loading...");
                setProgress(Progress*100);
                if(Progress==100)
                    setTitle(R.string.app_name);


            }
        });

        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);

    }
    public class mywebclient extends WebViewClient
    {
        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            handler.proceed(); // Ignore SSL certificate errors
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView webView,String Url)
        {   webView.loadUrl(Url);
            return false;
        }

    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (webView.canGoBack()) {
                        webView.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }
}
