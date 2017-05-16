package net.bplaced.esigala1.musicworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Set a clicklistener on TextView "Now Playing".
        ((TextView)findViewById(R.id.textViewNowPlaying)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new Explicit Intent to open the {@link NowPlayingActivity}.
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                // Start the new activity.
                startActivity(nowPlayingIntent);
            }
        });
        // Set a clicklistener on TextView "Songs".
        ((TextView)findViewById(R.id.textViewSongs)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new Explicit Intent to open the {@link SongsActivity}.
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                // Start the new activity.
                startActivity(songsIntent);
            }
        });
        // Set a clicklistener on TextView "Artist".
        ((TextView)findViewById(R.id.textViewArtist)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new Explicit Intent to open the {@link ArtistActivity}.
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);
                // Start the new activity.
                startActivity(artistIntent);
            }
        });
        // Set a clicklistener on TextView "Gender".
        ((TextView)findViewById(R.id.textViewGender)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new Explicit Intent to open the {@link GenderActivity}.
                Intent genderIntent = new Intent(MainActivity.this, GenderActivity.class);
                // Start the new activity.
                startActivity(genderIntent);
            }
        });
    }
}
