package com.example.namlu.podlistenerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class DownloadedPodcastActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_downloaded_podcast);

        // Declare references to DownloadedPodcastActivity buttons
        View codeSwitchView;
        View fragmentedView;
        View startUpView;

        // Find respective views and setOnClickListeners
        codeSwitchView = findViewById(R.id.ll_code_switch_activity_downloaded_podcast);
        codeSwitchView.setOnClickListener(this);

        fragmentedView = findViewById(R.id.ll_fragmented_activity_downloaded_podcast);
        fragmentedView.setOnClickListener(this);

        startUpView = findViewById(R.id.ll_podcast_startup_activity_downloaded_podcast);
        startUpView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.ll_code_switch_activity_downloaded_podcast) {
            Toast.makeText(this, "Opening CodeSwitch episodes list...", Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.ll_fragmented_activity_downloaded_podcast) {
            Toast.makeText(this, "Opening Fragmented episodes list...", Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.ll_podcast_startup_activity_downloaded_podcast) {
            Toast.makeText(this, "Opening Startup episodes list...", Toast.LENGTH_SHORT).show();
        }
    }
}
