package com.example.admin.musicsample;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer music[]=new MediaPlayer[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mannat=(Button)findViewById(R.id.mannat);
        Button daawat=(Button)findViewById(R.id.daawat);
        Button muskurane=(Button)findViewById(R.id.muskurane);
        Button stop=(Button)findViewById(R.id.stop);
        final TextView display=(TextView)findViewById(R.id.display);

        music[0]=MediaPlayer.create(MainActivity.this,R.raw.meri_mannat_tu);
        music[1]=MediaPlayer.create(MainActivity.this,R.raw.daawat_e_ishq);
        music[2]=MediaPlayer.create(MainActivity.this,R.raw.muskurane);

        mannat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                music[0].start();
            }
        });

        daawat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                music[1].start();
            }
        });

        muskurane.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                music[2].start();
            }
        });


        stop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(music[0].isPlaying())
                    music[0].pause();
                else if(music[1].isPlaying())
                    music[1].pause();
                else if(music[2].isPlaying())
                    music[2].pause();
            }
        });
        
        //I added this comment from GitHub ONline 
        //Consider it from another machine
        //Added from GitHub online Branch01


    }
}
