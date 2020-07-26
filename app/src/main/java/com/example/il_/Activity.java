package com.example.il_;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Activity extends AppCompatActivity {

    @BindView(R.id.v)
    VideoView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);
        ButterKnife.bind(this);
//
//        MediaPlayer mediaPlayer = new MediaPlayer();
////            mediaPlayer.
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        MediaController mediaController = new MediaController(this);
        Uri parse = Uri.parse(String.valueOf(R.raw.day1));
        v.setMediaController(mediaController);
        mediaController.setAnchorView(v);
        v.setVideoURI(parse);v.start();

    }
}
