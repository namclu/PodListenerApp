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

        // Find respective views and setOnClickListeners
        findPodcastActivity = (TextView) findViewById(R.id.find_podcast_activity_main);
        findPodcastActivity.setOnClickListener(this);

        addPodcastActivity = (TextView) findViewById(R.id.add_podcast_activity_main);
        addPodcastActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.find_podcast_activity_main) {
            Intent findPodcastIntent = new Intent(MainActivity.this, FindPodcastActivity.class);
            startActivity(findPodcastIntent);
        } else if (view.getId() == R.id.add_podcast_activity_main) {
            Intent addPodcastIntent = new Intent(MainActivity.this, AddPodcastActivity.class);
            startActivity(addPodcastIntent);
        }
    }
}
