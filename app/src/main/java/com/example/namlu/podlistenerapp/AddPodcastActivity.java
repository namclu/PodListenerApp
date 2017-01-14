package com.example.namlu.podlistenerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AddPodcastActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_podcast);

        // Declare references to AddPodcastActivity buttons
        Button cancelButton;
        Button addButton;

        // Find respective views and setOnClickListeners
        cancelButton = (Button) findViewById(R.id.btn_cancel_activity_add_podcast);
        cancelButton.setOnClickListener(this);

        addButton = (Button) findViewById(R.id.btn_add_activity_add_podcast);
        addButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_cancel_activity_add_podcast) {
            Intent cancelIntent = new Intent(AddPodcastActivity.this, MainActivity.class);
            startActivity(cancelIntent);
        } else if (view.getId() == R.id.btn_add_activity_add_podcast) {
            Toast.makeText(this, "Podcast added to library!", Toast.LENGTH_SHORT).show();
        }
    }
}
