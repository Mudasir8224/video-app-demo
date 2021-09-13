package com.example.testvideoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ActivityGallery extends AppCompatActivity {
    RecyclerView recyclerViewGallery;
    ImageView backArrowPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        backArrowPress = findViewById(R.id.backArrow);
        backArrowPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityGallery.this,MainActivity.class);
                startActivity(intent);
            }
        });

        recyclerViewGallery = findViewById(R.id.recyclerViewGallery);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewGallery.setLayoutManager(layoutManager);


        List<GalleryData> galleryDataList = new ArrayList<>();
        galleryDataList.add(new GalleryData("Soul Coke", "Kemba Walker", "https://upload.wikimedia.org/wikipedia/en/a/a6/Coke_Studio_Season_11.jpg"));
        galleryDataList.add(new GalleryData("Nescafe", "Paul Palce", "https://newsinstore.pk/wp-content/uploads/2019/02/nes5-1132x509.jpg"));
        galleryDataList.add(new GalleryData("Hoolywood", "Nikola", "https://i.ytimg.com/vi/EOlIttcUo2I/hqdefault.jpg"));
        galleryDataList.add(new GalleryData("Nescafe", "Paul Palce", "https://newsinstore.pk/wp-content/uploads/2019/02/nes5-1132x509.jpg"));
        galleryDataList.add(new GalleryData("Hoolywood", "Nikola", "https://i.ytimg.com/vi/EOlIttcUo2I/hqdefault.jpg"));
        galleryDataList.add(new GalleryData("Punjabi", "Romyo Fer", "https://i.pinimg.com/474x/21/52/7a/21527a91cdb1600415871ad80ae3ecf1.jpg"));
        GalleryAdapter galleryAdapter = new GalleryAdapter(galleryDataList);
        recyclerViewGallery.setAdapter(galleryAdapter);

    }


}

