package net.bplaced.esigala1.musicworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;  // This namespace will be used to import a MediaPlayer.
import android.widget.Toast;


public class SongOfTheDayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_of_the_day);
        // Set a clicklistener on Button "Now Playing".
        ((Button)findViewById(R.id.button_activity_song_of_the_day_to_now_playing)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new Explicit Intent to open the {@link NowPlayingActivity}.
                Intent nowPlayingIntent = new Intent(SongOfTheDayActivity.this, NowPlayingActivity.class);
                // Start the new activity.
                startActivity(nowPlayingIntent);
            }
        });
        // Set a clicklistener on Button "Play the Song of the Day".
        ((Button)findViewById(R.id.button_activity_song_of_the_day_select)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a Toast message...
                Toast.makeText(SongOfTheDayActivity.this, getResources().getString(R.string.playing_the_song_of_the_day), Toast.LENGTH_SHORT).show();
                // Place the code for playing the song of the day here...
            }
        });
    }
}
