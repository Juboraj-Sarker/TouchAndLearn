package com.juborajsarker.touchandlearn;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
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

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-5809082953640465/2732139313");
        AdView mAdView = (AdView) findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("93448558CC721EBAD8FAAE5DA52596D3").build(); //add test device
        mAdView.loadAd(adRequest);

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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu_for_main_activity, menu);

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:

                AlertDialog.Builder builder;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Light_Dialog);
                } else {
                    builder = new AlertDialog.Builder(this);
                }
                builder.setTitle("Thanks for using my app")
                        .setMessage("\nAre you sure you want to really exit?")
                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                                AppExit();
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        })
                        .show();


            default:
                return super.onOptionsItemSelected(item);
        }


    }


    public void AppExit() {

        this.finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);


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

        startActivity(new Intent(MainActivity.this, ActivityAboutMe.class));
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
