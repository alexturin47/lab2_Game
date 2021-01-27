package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // воспроизведение фоновой музыки
        Context appContext = getApplicationContext();
        MediaPlayer player = MediaPlayer.create(appContext,
                R.raw.fone_music);
        player.setLooping(true);
        player.start();
    }
}