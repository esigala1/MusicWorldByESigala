package net.bplaced.esigala1.musicworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SongOfTheDayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_of_the_day);
        // Set a clicklistener on Button "Now Playing".
        ((Button)findViewById(R.id.button_activity_gender_to_now_playing)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new Explicit Intent to open the {@link NowPlayingActivity}.
                Intent nowPlayingIntent = new Intent(SongOfTheDayActivity.this, NowPlayingActivity.class);
                // Start the new activity.
                startActivity(nowPlayingIntent);
            }
        });
    }
}
