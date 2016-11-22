package com.example.android.tryplayaudio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.*;
import static com.example.android.tryplayaudio.R.raw.mario;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mario = MediaPlayer.create(this, R.raw.haha);

        Button playButton = (Button) findViewById(R.id.play_music);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mario.start();
            }
        });

        Button pauseButton = (Button) findViewById(R.id.pause_music);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mario.isPlaying()){
                mario.pause();}
            }
        });
    }
}
