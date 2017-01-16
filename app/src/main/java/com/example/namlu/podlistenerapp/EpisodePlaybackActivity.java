package com.example.namlu.podlistenerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class EpisodePlaybackActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_playback);

        // Declare references to DownloadedPodcastsActivity buttons
        ImageButton rewind30Button;
        ImageButton playButton;
        ImageButton forward30Button;
        ImageButton skipPrevButton;
        ImageButton skiNextButton;

        // Find respective views and setOnClickListeners
        forward30Button = (ImageButton) findViewById(R.id.btn_rewind_30_episode_playback);
        forward30Button.setOnClickListener(this);

        playButton = (ImageButton) findViewById(R.id.btn_play_episode_playback);
        playButton.setOnClickListener(this);
        forward30Button = (ImageButton) findViewById(R.id.btn_forward_30_episode_playback);
        forward30Button.setOnClickListener(this);

        skipPrevButton = (ImageButton) findViewById(R.id.btn_skip_prev_episode_playback);
        skipPrevButton.setOnClickListener(this);

        skiNextButton = (ImageButton) findViewById(R.id.btn_skip_next_episode_playback);
        skiNextButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_rewind_30_episode_playback:
                Toast.makeText(this, "Rewind 30 seconds...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_play_episode_playback:
                Toast.makeText(this, "Begin playback...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_forward_30_episode_playback:
                Toast.makeText(this, "Forward 30 seconds...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_skip_prev_episode_playback:
                Toast.makeText(this, "Skip to previous episode...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_skip_next_episode_playback:
                Toast.makeText(this, "Skip to next episode...", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
