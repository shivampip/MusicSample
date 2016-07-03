package com.example.admin.musicsample;


import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.media.MediaPlayer;

public class Splash extends Activity{

    MediaPlayer back_music;

    @Override
    protected void onStart() {
        super.onStart();
        back_music=MediaPlayer.create(Splash.this,R.raw.meri_mannat_tu);
        this.setContentView(R.layout.splash);
        back_music.start();
        Thread timer=new Thread()
        {
            public void run()
            {
                try{
                    sleep(2000);
                }catch(Exception ex){}
                finally{
                    Intent startNew=new Intent("com.example.admin.musicexample.MAINACTIVITY");
                    startActivity(startNew);
            }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        back_music.stop();
    }
}
