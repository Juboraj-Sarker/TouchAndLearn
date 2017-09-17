package com.juborajsarker.touchandlearn.english_activity;

import android.app.Dialog;
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
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.juborajsarker.touchandlearn.ActivityAboutMe;
import com.juborajsarker.touchandlearn.MainActivity;
import com.juborajsarker.touchandlearn.R;

import java.io.File;

public class EnglishAlphabeticActivity2 extends AppCompatActivity {


    MediaPlayer mediaPlayer;
    Dialog dialog;
    ImageView cancelBtn;
    ImageView setIamge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_alphabetic2);


        setIamge = (ImageView) findViewById(R.id.imageView);
        createDialog();


        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-5809082953640465/9002569621");
        AdView mAdView = (AdView) findViewById(R.id.adView8);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("93448558CC721EBAD8FAAE5DA52596D3").build(); //add test device

        mAdView.loadAd(adRequest);
    }


    private void createDialog() {

        dialog = new Dialog(this);

        //SET TITLE
        dialog.setTitle("A for Apple");

        //set content
        dialog.setContentView(R.layout.custom_layout);


        cancelBtn = (ImageView) dialog.findViewById(R.id.cancelTxt);

    }


    public void go_to_home_from_english_alphabet_2(View view) {

        startActivity(new Intent(EnglishAlphabeticActivity2.this, MainActivity.class));
    }

    public void go_to_english_alphabet_1_from_2(View view) {

        startActivity(new Intent(EnglishAlphabeticActivity2.this, EnglishAlphabeticActivity1.class));
    }



    public void onClick2(View view) {


        switch (view.getId()) {
            case R.id.english_alphabet_16: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_16);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("P for Pizza");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("P for Pizza");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_16);


                ImageView cancelTxt = (ImageView) dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.english_alphabet_17: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_17);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("Q for Queen");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("Q for Queen");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_17);


                ImageView cancelTxt = (ImageView) dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.english_alphabet_18: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_18);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("R for Rose");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("R for Rose");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_18);


                ImageView cancelTxt = (ImageView) dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.english_alphabet_19: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_19);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("S for Superman");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("S for Superman");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_19);


                ImageView cancelTxt = (ImageView) dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.english_alphabet_20: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_20);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("T for Tiger");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("T for Tiger");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_20);


                ImageView cancelTxt = (ImageView) dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;
            }

        }


        switch (view.getId()) {
            case R.id.english_alphabet_21: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_21);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("U for Umbrella");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("U for Umbrella");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_21);


                ImageView cancelTxt = (ImageView) dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.english_alphabet_22: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_22);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("V for Vegetables");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("V for Vegetables");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_22);


                ImageView cancelTxt = (ImageView) dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.english_alphabet_23: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_23);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("W for Window");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("W for window");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_23);


                ImageView cancelTxt = (ImageView) dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.english_alphabet_24: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_24);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("X for X-Ray");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("X for X-Ray");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_24);


                ImageView cancelTxt = (ImageView) dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.english_alphabet_25: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_25);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("Y for Yellow");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("Y for Yellow");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_25);


                ImageView cancelTxt = (ImageView) dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.english_alphabet_26: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_26);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity2.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("Z for Zebra");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("Z for Zebra");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_26);


                ImageView cancelTxt = (ImageView) dialog.findViewById(R.id.cancelTxt);
                cancelTxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
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

        Intent homeIntent = new Intent(EnglishAlphabeticActivity2.this, MainActivity.class);
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

        startActivity(new Intent(EnglishAlphabeticActivity2.this, ActivityAboutMe.class));
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
