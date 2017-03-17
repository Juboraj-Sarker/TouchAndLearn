package com.juborajsarker.touchandlearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.juborajsarker.touchandlearn.bengali_activity.BengaliAlphabeticActivity1;
import com.juborajsarker.touchandlearn.bengali_activity.BengaliNumberActivity;
import com.juborajsarker.touchandlearn.bengali_activity.BengaliVowelActivity;
import com.juborajsarker.touchandlearn.english_activity.EnglishAlphabeticActivity1;
import com.juborajsarker.touchandlearn.english_activity.EnglishNumberActivity;
import com.juborajsarker.touchandlearn.poems_activity.ActivityPoems;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        MobileAds.initialize(getApplicationContext(), "ca-app-pub-5809082953640465/8826668831");
        AdView mAdView = (AdView) findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("2BA46C54FD47FD80CBBAD95AE0F70E1A").build(); //add test device
        mAdView.loadAd(adRequest);

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_for_all, menu);
        

        return true;
    }


    public void aboutMe(MenuItem item) {

        Intent about_me = new Intent(MainActivity.this, ActivityAboutMe.class);
        startActivity(about_me);
    }


    public void go_to_bengali_vowel_activity(View view) {

        startActivity(new Intent(MainActivity.this, BengaliVowelActivity.class));

    }

    public void go_to_bengali_consonant_activity(View view) {

        startActivity(new Intent(MainActivity.this, BengaliAlphabeticActivity1.class));

    }

    public void go_to_english_alphabet_activity(View view) {

        startActivity(new Intent(MainActivity.this, EnglishAlphabeticActivity1.class));


    }

    public void go_to_english_number_activity(View view) {

        startActivity(new Intent(MainActivity.this, EnglishNumberActivity.class));


    }

    public void go_to_bengali_number_activity(View view) {

        startActivity(new Intent(MainActivity.this, BengaliNumberActivity.class));


    }

    public void go_to_poems_activity(View view) {

        startActivity(new Intent(MainActivity.this, ActivityPoems.class));
    }
}
