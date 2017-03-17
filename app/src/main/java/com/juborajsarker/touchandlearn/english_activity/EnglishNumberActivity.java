package com.juborajsarker.touchandlearn.english_activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class EnglishNumberActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_number);


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-5809082953640465/8826668831");
        AdView mAdView = (AdView) findViewById(R.id.adView9);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("2BA46C54FD47FD80CBBAD95AE0F70E1A").build(); //add test device

        mAdView.loadAd(adRequest);
    }

    public void go_to_home_from_english_number(View view) {


        startActivity(new Intent(EnglishNumberActivity.this, MainActivity.class));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_for_all, menu);

        return true;
    }


    public void aboutMe(MenuItem item) {

        Intent about_me = new Intent(EnglishNumberActivity.this, ActivityAboutMe.class);
        startActivity(about_me);
    }

    public void home(MenuItem item) {

        Intent homeIntent = new Intent(EnglishNumberActivity.this, MainActivity.class);
        startActivity(homeIntent);
    }

    public void onClick3(View view) {


        switch (view.getId()) {
            case R.id.english_number_1: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_number_1);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.english_number_2: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_number_2);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.english_number_3: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_number_3);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.english_number_4: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_number_4);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.english_number_5: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_number_5);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.english_number_6: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_number_6);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.english_number_7: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_number_7);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.english_number_8: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_number_8);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.english_number_9: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_number_9);
                mediaPlayer.start();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.english_number_10: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_number_10);
                mediaPlayer.start();
                break;

            }

        }


    }
}
