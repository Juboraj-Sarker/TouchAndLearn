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

public class BengaliAlphabeticActivity3 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengali_alphabetic3);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-5809082953640465/9002569621");
        AdView mAdView = (AdView) findViewById(R.id.adView4);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("93448558CC721EBAD8FAAE5DA52596D3").build(); //add test device

        mAdView.loadAd(adRequest);
    }

    public void go_to_home_from_bengali_consonant_3(View view) {


        startActivity(new Intent(BengaliAlphabeticActivity3.this, MainActivity.class));
    }

    public void go_to_bengali_consonant_2_from_3(View view) {

        startActivity(new Intent(BengaliAlphabeticActivity3.this, BengaliAlphabeticActivity2.class));
    }



    public void onClick_b3(View view) {


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_31: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_31);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_32: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_32);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_33: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_33);
                mediaPlayer.start();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_34: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_34);
                mediaPlayer.start();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_35: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_35);
                mediaPlayer.start();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_36: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_36);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_37: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_37);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_38: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_38);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_39: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_39);
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

        Intent homeIntent = new Intent(BengaliAlphabeticActivity3.this, MainActivity.class);
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

        startActivity(new Intent(BengaliAlphabeticActivity3.this, ActivityAboutMe.class));
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
