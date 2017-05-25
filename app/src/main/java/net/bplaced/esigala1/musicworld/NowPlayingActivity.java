package net.bplaced.esigala1.musicworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer; // This namespace will be used to import a MediaPlayer.
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    private Button btnForward, btnPause, btnPlay, btnRewind;
    private int forwardTime = 3000;  // 3 sec forward time
    private int backwardTime = 3000; // 3 sec backward time
    private SeekBar seekbar;
    private TextView tvCurrentPosition, tvDuration, tvSongName;
    private ImageView ivSongCover;
    private Toast mToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        // Retrieve the widgets from the UI.
        btnForward = (Button) findViewById(R.id.button_forward);
        btnPause = (Button) findViewById(R.id.button_pause);
        btnPlay = (Button)findViewById(R.id.button_play);
        btnRewind = (Button)findViewById(R.id.button_rewind);
        tvCurrentPosition = (TextView)findViewById(R.id.text_view_current_position);
        tvDuration = (TextView)findViewById(R.id.text_view_duration);
        tvSongName = (TextView)findViewById(R.id.text_view_song_name);
        ivSongCover = (ImageView) findViewById(R.id.image_view_cover);
        seekbar = (SeekBar)findViewById(R.id.seekBar);
        // Set the texts.
        tvSongName.setText("P!nk - So What");
        tvCurrentPosition.setText("0:00");
        tvDuration.setText("3:45");
        // Set the image.
        ivSongCover.setImageResource(R.drawable.pink_so_what);

        // Set a clicklistener on Button ">".
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a Toast message.
                displayToastMessage(getResources().getString(R.string.msg_play));
            }
        });

        // Set a clicklistener on Button "||".
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a Toast message.
                displayToastMessage(getResources().getString(R.string.msg_pause));
            }
        });

        // Set a clicklistener on Button ">>".
        btnForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a Toast message.
                displayToastMessage(getResources().getString(R.string.msg_forward, forwardTime/1000));
            }
        });

        // Set a clicklistener on Button "<<".
        btnRewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a Toast message.
                displayToastMessage(getResources().getString(R.string.msg_backward, backwardTime/1000));
            }
        });

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

    @Override
    protected void onPause() {
        super.onPause();
        // If the "mToast" object is not null, then cancel it.
        if (mToast != null){
            mToast.cancel();
        }
    }

    /**
     * Display a Toast message.
     * @param message is the message to display.
     */
    private void displayToastMessage(String message){
        // If the "mToast" object is not null, then cancel it.
        if (mToast != null){
            mToast.cancel();
        }
        // Instantiate the Toast object.
        mToast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
        // Show the toast message.
        mToast.show();
    }
}
