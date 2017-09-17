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

public class EnglishAlphabeticActivity1 extends AppCompatActivity {


    MediaPlayer mediaPlayer;
    Dialog dialog;
    ImageView cancelBtn;
    ImageView setIamge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_alphabetic1);


        setIamge = (ImageView) findViewById(R.id.imageView);
        createDialog();


        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-5809082953640465/9002569621");
        AdView mAdView = (AdView) findViewById(R.id.adView7);
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


    public void go_to_home_from_english_alphabet_1(View view) {

        startActivity(new Intent(EnglishAlphabeticActivity1.this, MainActivity.class));
    }

    public void go_to_english_alphabet_2_from_1(View view) {

        startActivity(new Intent(EnglishAlphabeticActivity1.this, EnglishAlphabeticActivity2.class));
    }




    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.english_alphabet_1: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_1);
                mediaPlayer.start();
                dialog.show();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.cancelTxt: {
                dialog.dismiss();
                break;

            }

        }


        switch (view.getId()) {
            case R.id.english_alphabet_2: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_2);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("B for Ball");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("B for Ball");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_2);


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
            case R.id.english_alphabet_3: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_3);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("C for Cat");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("C for Cat");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_3);


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
            case R.id.english_alphabet_4: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_4);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("D for Dog");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("D for Dog");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_4);


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
            case R.id.english_alphabet_5: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_5);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("E for Elephant");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("E for Elephant");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_5);


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
            case R.id.english_alphabet_6: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_6);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("F for Frog");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("F for Frog");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_6);


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
            case R.id.english_alphabet_7: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_7);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("G for Goat");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("G for Goat");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_7);


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
            case R.id.english_alphabet_8: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_8);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("H for Horse");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("H for Horse");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_8);


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
            case R.id.english_alphabet_9: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_9);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("I for Internet");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("I for Internet");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_9);


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
            case R.id.english_alphabet_10: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_10);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("J for Jug");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("J for Jug");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_10);


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
            case R.id.english_alphabet_11: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_11);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("K for Kangaroo");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("K for Kangaroo");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_11);


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
            case R.id.english_alphabet_12: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_12);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("L for Lion");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("L for Lion");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_12);


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
            case R.id.english_alphabet_13: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_13);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("M for Monkey");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("M for Monkey");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_13);


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
            case R.id.english_alphabet_14: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_14);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("N for Nut");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("N for Nut");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_14);


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
            case R.id.english_alphabet_15: {
                mediaPlayer = MediaPlayer.create(this, R.raw.english_alphabet_15);
                mediaPlayer.start();

                final Dialog dialog = new Dialog(EnglishAlphabeticActivity1.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_layout);
                dialog.setTitle("O for Orange");

                TextView txt = (TextView) dialog.findViewById(R.id.nameTxtt);
                txt.setText("O for Orange");

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                image.setImageResource(R.drawable.english_alphabet_15);


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

        Intent homeIntent = new Intent(EnglishAlphabeticActivity1.this, MainActivity.class);
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

        startActivity(new Intent(EnglishAlphabeticActivity1.this, ActivityAboutMe.class));
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
