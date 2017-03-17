package com.juborajsarker.touchandlearn.bengali_activity;

import android.content.Intent;
import android.media.MediaPlayer;
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

public class BengaliAlphabeticActivity3 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengali_alphabetic3);


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-5809082953640465/8826668831");
        AdView mAdView = (AdView) findViewById(R.id.adView4);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("2BA46C54FD47FD80CBBAD95AE0F70E1A").build(); //add test device

        mAdView.loadAd(adRequest);
    }

    public void go_to_home_from_bengali_consonant_3(View view) {


        startActivity(new Intent(BengaliAlphabeticActivity3.this, MainActivity.class));
    }

    public void go_to_bengali_consonant_2_from_3(View view) {

        startActivity(new Intent(BengaliAlphabeticActivity3.this, BengaliAlphabeticActivity2.class));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_for_all, menu);

        return true;
    }


    public void aboutMe(MenuItem item) {

        Intent about_me = new Intent(BengaliAlphabeticActivity3.this, ActivityAboutMe.class);
        startActivity(about_me);
    }

    public void home(MenuItem item) {

        Intent homeIntent = new Intent(BengaliAlphabeticActivity3.this, MainActivity.class);
        startActivity(homeIntent);
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
}
