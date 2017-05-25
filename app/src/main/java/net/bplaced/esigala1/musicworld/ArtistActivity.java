package net.bplaced.esigala1.musicworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ArtistActivity extends AppCompatActivity {

    static final String[] ARTISTS = new String[] {
            "P!nk",
            "Evanescence",
            "John Lennon"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        // Declare and Initialize the Array Adapter.
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, ARTISTS);
        // Retrieve the ListView from the UI.
        ListView lvSongs = (ListView)findViewById(R.id.listview_artists);
        // Set the Adapter.
        lvSongs.setAdapter(arrayAdapter);

        // Set the OnItemClick listener.
        lvSongs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // When clicked, show a toast with the TextView text.
                Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });

        // Set a clicklistener on Button "Now Playing".
        ((Button)findViewById(R.id.button_activity_artist_to_now_playing)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new Explicit Intent to open the {@link NowPlayingActivity}.
                Intent nowPlayingIntent = new Intent(ArtistActivity.this, NowPlayingActivity.class);
                // Start the new activity.
                startActivity(nowPlayingIntent);
            }
        });
    }
}
