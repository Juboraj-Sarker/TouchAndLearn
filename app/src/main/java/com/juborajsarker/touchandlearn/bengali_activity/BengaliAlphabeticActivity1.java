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

public class BengaliAlphabeticActivity1 extends AppCompatActivity {

    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengali_alphabetic1);


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-5809082953640465/8826668831");
        AdView mAdView = (AdView) findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("2BA46C54FD47FD80CBBAD95AE0F70E1A").build();
        //add test device

        mAdView.loadAd(adRequest);


    }

    public void go_to_home_from_bengali_consonant_1(View view) {

        startActivity(new Intent(BengaliAlphabeticActivity1.this, MainActivity.class));
    }

    public void go_to_bengali_consonant_2(View view) {

        startActivity(new Intent(BengaliAlphabeticActivity1.this, BengaliAlphabeticActivity2.class));

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_for_all, menu);

        return true;
    }


    public void aboutMe(MenuItem item) {

        Intent about_me = new Intent(BengaliAlphabeticActivity1.this, ActivityAboutMe.class);
        startActivity(about_me);
    }

    public void home(MenuItem item) {

        Intent homeIntent = new Intent(BengaliAlphabeticActivity1.this, MainActivity.class);
        startActivity(homeIntent);
    }


    public void onClick_b(View view) {

        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_1: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_1);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_2: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_2);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_3: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_3);
                mediaPlayer.start();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_4: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_4);
                mediaPlayer.start();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_5: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_5);
                mediaPlayer.start();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_6: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_6);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_7: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_7);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_8: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_8);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_9: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_9);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_10: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_10);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_11: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_11);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_12: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_12);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_13: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_13);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_14: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_14);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.bengali_consonant_alphabet_15: {
                mediaPlayer = MediaPlayer.create(this, R.raw.bengali_consonant_15);
                mediaPlayer.start();
                break;

            }

        }


    }

}
