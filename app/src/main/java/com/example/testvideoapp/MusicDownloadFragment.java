package com.example.testvideoapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MusicDownloadFragment extends Fragment {

    RecyclerView recyclerViewDownload;
     ImageView imageViewShowRv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_music_download, container, false);

        recyclerViewDownload =rootView. findViewById(R.id.recyclerViewDownload);
        imageViewShowRv = rootView.findViewById(R.id.imageViewShowRv);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewDownload.setLayoutManager(layoutManager);

        imageViewShowRv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageViewShowRv.setVisibility(View.INVISIBLE);

                List<MusicDownloadData> musicDownloadDataList = new ArrayList<>();
                musicDownloadDataList.add(new MusicDownloadData("Soul Coke","Kemba Walker","https://upload.wikimedia.org/wikipedia/en/a/a6/Coke_Studio_Season_11.jpg"));
                musicDownloadDataList.add(new MusicDownloadData("Nescafe","Paul Palce","https://newsinstore.pk/wp-content/uploads/2019/02/nes5-1132x509.jpg"));
                musicDownloadDataList.add(new MusicDownloadData("Hoolywood","Nikola","https://i.ytimg.com/vi/EOlIttcUo2I/hqdefault.jpg"));
                musicDownloadDataList.add(new MusicDownloadData("Nescafe","Paul Palce","https://newsinstore.pk/wp-content/uploads/2019/02/nes5-1132x509.jpg"));
                musicDownloadDataList.add(new MusicDownloadData("Hoolywood","Nikola","https://i.ytimg.com/vi/EOlIttcUo2I/hqdefault.jpg"));
                musicDownloadDataList.add(new MusicDownloadData("Punjabi","Romyo Fer","https://i.pinimg.com/474x/21/52/7a/21527a91cdb1600415871ad80ae3ecf1.jpg"));
                MusicDownloadAdapter musicDownloadAdapter = new MusicDownloadAdapter(musicDownloadDataList);
                recyclerViewDownload.setAdapter(musicDownloadAdapter);

            }
        });
        return rootView;
    }
}
