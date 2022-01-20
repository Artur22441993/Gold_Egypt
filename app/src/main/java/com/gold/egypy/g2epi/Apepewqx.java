package com.gold.egypy.g2epi;

import android.app.Application;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;

import java.util.Map;

public class Apepewqx extends Application {

    public static String jksda;
    public static String ojndjq = "";
    public static String iuytsd;
    public static String kihdbwu;
    private final String ond = "NTU0M2U3Y2QtZTg5MC00ZTJjLThjMWEtMjRjNDE3ZWQyMDI4";
    public static final String appK = "TVNKVkZid2ZtR0UydkxnZjJnWXVVRQ==";


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();

        kdsds();

    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    public void kdsds(){
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(GE.dddddeeekkk(ond));

        jksda = AppsFlyerLib.getInstance().getAppsFlyerUID(this);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    iuytsd = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                }catch (Exception e){

                }
            }
        }).start();

        AppsFlyerLib.getInstance().init(GE.dddddeeekkk(appK), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {

                ojndjq = map.get(GE.dddddeeekkk("YWZfc3RhdHVz")).toString();
                if (ojndjq.equals(GE.dddddeeekkk("Tm9uLW9yZ2FuaWM="))){
                    String str =map.get(GE.dddddeeekkk("Y2FtcGFpZ24=")).toString();
                    kihdbwu = GE.papapap(str,getPackageName(), iuytsd, jksda);
                }
            }

            @Override
            public void onConversionDataFail(String s) {
            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {
            }

            @Override
            public void onAttributionFailure(String s) {
            }
        },this);
        AppsFlyerLib.getInstance().start(this);
    }
}
