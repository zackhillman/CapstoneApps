package edu.ma.wa.nqueue.capstoneapp;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;


public class MainActivity extends AppCompatActivity {


    private InterstitialAd interstitial;
    private BottomBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.frame, new Profile()).commit();
        }
        bar = (BottomBar)findViewById(R.id.bottomBar);
        bar.setOnTabSelectListener(new OnTabSelectListener() {
            public void onTabSelected(@IdRes int tabId) {
                Fragment f = new Fragment();
                if (tabId == R.id.tab_profile) {
                    f = new Profile();
                }
                if (tabId == R.id.tab_logs) {
                    f = new Logs();
                }
                if (tabId == R.id.tab_friends) {
                    f = new Friends();
                }
                if (tabId == R.id.tab_exercise) {
                    f = new Exercise();
                }
                if (tabId == R.id.tab_about) {
                    f = new About();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
            }

        });
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

// Prepare the Interstitial Ad
        /*interstitial = new InterstitialAd(MainActivity.this);
// Insert the Ad Unit ID
        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));

        interstitial.loadAd(adRequest);
// Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                // Call displayInterstitial() function
                displayInterstitial();
            }
        });*/
    }

    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }

}