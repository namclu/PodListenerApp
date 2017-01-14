package com.example.namlu.podlistenerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FindPodcastActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_podcast);

        // Declare references to FindPodcastActivity buttons
        View talView = findViewById(R.id.ll_podcast_tal_activity_find_podcast);
        talView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.ll_podcast_tal_activity_find_podcast) {
            Intent addPodcastIntent = new Intent(FindPodcastActivity.this, AddPodcastActivity.class);
            startActivity(addPodcastIntent);
        }
    }
}
