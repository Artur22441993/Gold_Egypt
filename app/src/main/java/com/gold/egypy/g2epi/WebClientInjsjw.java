package com.gold.egypy.g2epi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.gold.egypy.g2epi.dksa.Entityfkadq;

public class WebClientInjsjw extends WebViewClient {

    private GE ge;

    public WebClientInjsjw(GE ge) {
        this.ge = ge;
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        if(url.contains("404")){
            Intent intent = new Intent(ge.getApplicationContext(),MainActivity.class);
            ge.startActivity(intent);
            ge.finishAffinity();
        }
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);

        new Thread(new Runnable() {
            @Override
            public void run() {
                Entityfkadq entityfkadq = new Entityfkadq(url);
                ge.databaddkwdw.daofoudsds().inserttttst(entityfkadq);
            }
        }).start();
    }
}
