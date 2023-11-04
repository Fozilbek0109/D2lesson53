package uz.coder.d2lesson53;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find the view
        webView = (WebView)findViewById(R.id.web);
        // to load all the web page in app itself use this
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://openbudget.uz/boards-list/2/a92816b4-7764-47f7-9170-bf37544ea00b");
        WebSettings webSettings =webView.getSettings();
        //if your website is using any javascript that needs to load some script then you need to enable javascript in android application
        ((WebSettings) webSettings).setJavaScriptEnabled(true);




    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}