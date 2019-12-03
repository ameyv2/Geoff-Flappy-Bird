package com.example.geoffflappybird;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;

public class MainActivity extends AppCompatActivity {
    private GeoffFlappyView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameView = new GeoffFlappyView(this);
        setContentView(gameView);

        MediaPlayer player;
        player = MediaPlayer.create(this, R.raw.flightsong);
        player.setLooping(true);
        player.start();
    }
}
