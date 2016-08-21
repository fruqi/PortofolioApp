package com.amrta.android.portofolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button mPopularMoviesButton;
    private Button mStockHawkButton;
    private Button mBuildItBiggerButton;
    private Button mMakeMaterialButton;
    private Button mGoUbiquitousButton;
    private Button mCapstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPopularMoviesButton = (Button) findViewById(R.id.popular_movies_app);
        mPopularMoviesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchToastMessage(view);
            }
        });

        mStockHawkButton = (Button) findViewById(R.id.stock_hawk_app);
        mStockHawkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchToastMessage(view);
            }
        });

        mBuildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_app);
        mBuildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchToastMessage(view);
            }
        });

        mMakeMaterialButton = (Button) findViewById(R.id.make_material_app);
        mMakeMaterialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchToastMessage(view);
            }
        });

        mGoUbiquitousButton = (Button) findViewById(R.id.go_ubiquitous_app);
        mGoUbiquitousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchToastMessage(view);
            }
        });

        mCapstoneButton = (Button) findViewById(R.id.capstone_app);
        mCapstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchToastMessage(view);
            }
        });

    }

    private void launchToastMessage(View view) {
        String title = ((Button) view).getText().toString();
        String titleString = getString(R.string.toast_message_title, title);

        Toast.makeText(MainActivity.this, titleString, Toast.LENGTH_SHORT).show();
    }
}
