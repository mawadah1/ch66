package com.example.ch6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button bttn1, bttn2;
    MediaPlayer mediaPlayer1, mediaPlayer2;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bttn1 = (Button) findViewById(R.id.button);
        bttn2 = (Button) findViewById(R.id.button2);
        bttn1.setOnClickListener(bttn1L);
        bttn2.setOnClickListener(bttn2L);
    }

    Button.OnClickListener bttn1L = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {

        }


    };

    Button.OnClickListener bttn2L = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {

        }

    };
}