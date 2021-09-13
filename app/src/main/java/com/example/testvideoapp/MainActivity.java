package com.example.testvideoapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    ImageView buttonMusicAlbumFragment;
    ImageView buttonMusicFolderFragment;
    ImageView buttonMusicDownloadFragment;
    ImageView buttonMusicUserProfileFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMusicAlbumFragment = findViewById(R.id.buttonPlay);
        buttonMusicFolderFragment = findViewById(R.id.buttonFolder);
        buttonMusicDownloadFragment = findViewById(R.id.buttonDownload);
        buttonMusicUserProfileFragment = findViewById(R.id.buttonProfile);


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        MusicAlbumFragment musicAlbumFragment = new MusicAlbumFragment();
        fragmentTransaction.replace(R.id.RelativeLayoutFragmentDisplay, musicAlbumFragment);
        fragmentTransaction.commit();


        buttonMusicAlbumFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                MusicAlbumFragment musicAlbumFragment = new MusicAlbumFragment();
                fragmentTransaction.replace(R.id.RelativeLayoutFragmentDisplay, musicAlbumFragment);
                fragmentTransaction.commit();

            }
        });


        buttonMusicFolderFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                MusicFolderFragment musicFolderFragment = new MusicFolderFragment();
                fragmentTransaction.replace(R.id.RelativeLayoutFragmentDisplay, musicFolderFragment);
                fragmentTransaction.commit();

            }
        });

        buttonMusicDownloadFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                MusicDownloadFragment musicDownloadFragment = new MusicDownloadFragment();
                fragmentTransaction.replace(R.id.RelativeLayoutFragmentDisplay, musicDownloadFragment);
                fragmentTransaction.commit();
            }
        });
        buttonMusicUserProfileFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             /*
             FragmentManager fragmentManager = getSupportFragmentManager();
             FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

             MusicUserProfileFragment musicUserProfileFragment = new MusicUserProfileFragment();
             fragmentTransaction.replace(R.id.RelativeLayoutFragmentDisplay, musicUserProfileFragment);
             fragmentTransaction.commit();

              */

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                LandingScreenFragment landingScreenFragment = new LandingScreenFragment();
                fragmentTransaction.replace(R.id.RelativeLayoutFragmentDisplay, landingScreenFragment);
                fragmentTransaction.commit();
            }
        });


    }
}
