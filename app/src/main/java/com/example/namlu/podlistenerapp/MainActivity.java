package com.example.namlu.podlistenerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare references to MainActivity buttons
        TextView findPodcastActivity;
        TextView addPodcastActivity;
        TextView downloadedPodcastActivity;
        TextView episodeListActivity;
        TextView episodePlaybackActivity;

        // Find respective views and setOnClickListeners
        findPodcastActivity = (TextView) findViewById(R.id.find_podcast_activity_main);
        findPodcastActivity.setOnClickListener(this);

        addPodcastActivity = (TextView) findViewById(R.id.add_podcast_activity_main);
        addPodcastActivity.setOnClickListener(this);

        downloadedPodcastActivity = (TextView) findViewById(R.id.downloaded_podcast_activity_main);
        downloadedPodcastActivity.setOnClickListener(this);

        episodeListActivity = (TextView) findViewById(R.id.episode_list_activity_main);
        episodeListActivity.setOnClickListener(this);

        episodePlaybackActivity = (TextView) findViewById(R.id.episode_playback_activity_main);
        episodePlaybackActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.find_podcast_activity_main:
                Intent findPodcastIntent = new Intent(this, FindPodcastActivity.class);
                startActivity(findPodcastIntent);
                break;
            case R.id.add_podcast_activity_main:
                Intent addPodcastIntent = new Intent(this, AddPodcastActivity.class);
                startActivity(addPodcastIntent);
                break;
            case R.id.downloaded_podcast_activity_main:
                Intent downloadedPodcastIntent = new Intent(this, DownloadedPodcastsActivity.class);
                startActivity(downloadedPodcastIntent);
                break;
            case R.id.episode_list_activity_main:
                Intent episodeListIntent = new Intent(this, EpisodeListActivity.class);
                startActivity(episodeListIntent);
                break;
            case R.id.episode_playback_activity_main:
                Intent episodePlaybackIntent = new Intent(this, EpisodePlaybackActivity.class);
                startActivity(episodePlaybackIntent);
                break;
        }
    }
}
