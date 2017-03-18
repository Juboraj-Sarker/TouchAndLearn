package com.juborajsarker.touchandlearn.poems_activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.juborajsarker.touchandlearn.ActivityAboutMe;
import com.juborajsarker.touchandlearn.MainActivity;
import com.juborajsarker.touchandlearn.R;

public class ActivityPoems extends AppCompatActivity {

    ImageView twinckle, abc, kathbirali;
    VideoView videoView;
    MediaController mediaC;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poems);





        twinckle = (ImageView) findViewById(R.id.twinckle);
        abc = (ImageView) findViewById(R.id.abc);
        kathbirali = (ImageView) findViewById(R.id.kathbirali);

        videoView = (VideoView) findViewById(R.id.videoView);
        mediaC = new MediaController(this);


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-5809082953640465/8826668831");
        AdView mAdView = (AdView) findViewById(R.id.adView10);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("2BA46C54FD47FD80CBBAD95AE0F70E1A").build(); //add test device
        mAdView.loadAd(adRequest);


    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home, menu);
        inflater.inflate(R.menu.menu_for_all, menu);


        return true;
    }

    public void home(MenuItem item) {

        Intent homeIntent = new Intent(ActivityPoems.this, MainActivity.class);
        startActivity(homeIntent);
    }


    public void aboutMe(MenuItem item) {

        Intent about_me = new Intent(ActivityPoems.this, ActivityAboutMe.class);
        startActivity(about_me);
    }


    public void twinckle(View view) {


        String videoPath = "android.resource://com.juborajsarker.touchandlearn/" + R.raw.poem_twinkle_twinkle_little_star;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();



    }

    public void abc(View view) {


        String videoPath = "android.resource://com.juborajsarker.touchandlearn/" + R.raw.poem_abc;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();

    }

    public void kathbirali(View view) {


        String videoPath = "android.resource://com.juborajsarker.touchandlearn/" + R.raw.poem_kathbirali;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();


    }


}
