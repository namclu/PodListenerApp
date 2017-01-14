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

        findPodcastActivity = (TextView) findViewById(R.id.find_podcast_activity_main);
        findPodcastActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.find_podcast_activity_main) {
            Intent findPodcastIntent = new Intent(MainActivity.this, FindPodcastActivity.class);
            startActivity(findPodcastIntent);
        }
    }
}
