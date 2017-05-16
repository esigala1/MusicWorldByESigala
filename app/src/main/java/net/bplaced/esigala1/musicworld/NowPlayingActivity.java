package net.bplaced.esigala1.musicworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        // Set a clicklistener on Button "Main".
        ((Button)findViewById(R.id.button_now_playing_activity_to_main)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new Explicit Intent to open the {@link MainActivity}.
                Intent mainIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                // Close activities on top.
                mainIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                // Start the new activity.
                startActivity(mainIntent);
            }
        });
    }
}
