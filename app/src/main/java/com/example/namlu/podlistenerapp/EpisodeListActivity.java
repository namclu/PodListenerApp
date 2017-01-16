package com.example.namlu.podlistenerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class EpisodeListActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_list);

        // Declare references to EpisodeListActivity buttons
        ImageButton playButton;
        ImageButton downloadButton;

        // Find respective views and setOnClickListeners
        playButton = (ImageButton) findViewById(R.id.btn_play_activity_episode_list);
        playButton.setOnClickListener(this);

        downloadButton = (ImageButton) findViewById(R.id.btn_download_activity_episode_list);
        downloadButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_play_activity_episode_list) {
            Intent playIntent = new Intent(this, EpisodePlaybackActivity.class);
            startActivity(playIntent);
        } else if (view.getId() == R.id.btn_download_activity_episode_list) {
            Toast.makeText(this, "Downloading episode...", Toast.LENGTH_SHORT).show();
        }
    }
}
