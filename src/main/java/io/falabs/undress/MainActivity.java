package io.falabs.undress;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.content.DialogInterface;
import android.webkit.WebChromeClient;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebView = (WebView) findViewById(R.id.WebView);
        WebSettings websettings = myWebView.getSettings();
        myWebView.loadUrl("https://harish26.wixsite.com/undress");
        websettings.setJavaScriptEnabled(true);

    }

    public class myWebClient extends WebViewClient {
        @Override
        public void onPageStarted (WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading (WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    @Override
        public void onBackPressed () {
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
                super.onBackPressed();

        }
    }
}
