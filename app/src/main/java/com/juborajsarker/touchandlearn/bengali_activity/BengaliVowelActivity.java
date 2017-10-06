package com.juborajsarker.touchandlearn.bengali_activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.juborajsarker.touchandlearn.ActivityAboutMe;
import com.juborajsarker.touchandlearn.MainActivity;
import com.juborajsarker.touchandlearn.R;

import java.io.File;

public class BengaliVowelActivity extends AppCompatActivity {


    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengali_vowel);


        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-5809082953640465/2732139313");
        AdView mAdView = (AdView) findViewById(R.id.adView6);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("93448558CC721EBAD8FAAE5DA52596D3").build(); //add test device

        mAdView.loadAd(adRequest);
    }

    public void go_to_home_from_bengali_vowel(View view) {

        startActivity(new Intent(BengaliVowelActivity.this, MainActivity.class));
    }




    public void onClick_v(View view) {


        switch (view.getId()) {
            case R.id.bengali_vowel_1: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_vowel_1);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_vowel_2: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_vowel_2);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_vowel_3: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_vowel_3);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_vowel_4: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_vowel_4);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_vowel_5: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_vowel_5);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_vowel_6: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_vowel_6);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_vowel_7: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_vowel_7);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_vowel_8: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_vowel_8);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_vowel_9: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_vowel_9);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_vowel_10: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_vowel_10);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_vowel_11: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_vowel_11);
                mediaPlayer.start();
                break;

            }

        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu_for_all, menu);

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }


    public void home(MenuItem item) {

        Intent homeIntent = new Intent(BengaliVowelActivity.this, MainActivity.class);
        startActivity(homeIntent);

    }


    public void rateThisApp(MenuItem item) {

        rateApp();

    }


    public void shareThisApp(MenuItem item) {


        ApplicationInfo app = getApplicationContext().getApplicationInfo();
        String filePath = app.sourceDir;
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        Intent.createChooser(intent, "Touch And Learn");
        intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(filePath)));
        startActivity(Intent.createChooser(intent, "share Touch And Learn using"));

    }


    public void moreApps(MenuItem item) {

        Intent intent;
        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=6155570899607409709&hl"));
        startActivity(intent);
    }


    public void aboutMe(MenuItem item) {

        startActivity(new Intent(BengaliVowelActivity.this, ActivityAboutMe.class));
    }


    public void rateApp() {
        try {
            Intent rateIntent = rateIntentForUrl("market://details");
            startActivity(rateIntent);
        } catch (ActivityNotFoundException e) {
            Intent rateIntent = rateIntentForUrl("https://play.google.com/store/apps/details");
            startActivity(rateIntent);
        }
    }


    private Intent rateIntentForUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.format("%s?id=%s", url, getPackageName())));
        int flags = Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_MULTIPLE_TASK;
        if (Build.VERSION.SDK_INT >= 21) {
            flags |= Intent.FLAG_ACTIVITY_NEW_DOCUMENT;
        } else {
            flags |= Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET;
        }
        intent.addFlags(flags);
        return intent;
    }




}
