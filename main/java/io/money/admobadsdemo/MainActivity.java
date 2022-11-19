package io.money.admobadsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import io.money.admobadsdemo.R;

public class MainActivity extends AppCompatActivity {

    AdView mAdView;
    AdView mAdview2;
    AdView mAdview3;
    AdView mAdview4;
    AdView mAdview5;
    AdView mAdview6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        //Adview1
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //Adview2
        mAdview2 = findViewById(R.id.adView2);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        mAdview2.loadAd(adRequest);

        //Adview3
        mAdview3 = findViewById(R.id.adView3);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdview3.loadAd(adRequest);

        //Adview4
        mAdview4 = findViewById(R.id.adView4);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        mAdview4.loadAd(adRequest);

        //Adview5
        mAdview5 = findViewById(R.id.adView5);
        AdRequest adRequest4 = new AdRequest.Builder().build();
        mAdview5.loadAd(adRequest);

        //Adview6
        mAdview6 = findViewById(R.id.adView6);
        AdRequest adRequest5 = new AdRequest.Builder().build();
        mAdview6.loadAd(adRequest);
    }

}