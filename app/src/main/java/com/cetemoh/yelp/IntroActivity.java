package com.cetemoh.yelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }
    public void onlogin (View view){
        Intent j = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(j);
    }
}
