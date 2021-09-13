package com.example.testvideoapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MusicFolderFragment extends Fragment {
    RecyclerView recyclerViewMusicFolder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_music_folder, container, false);

        recyclerViewMusicFolder =rootView. findViewById(R.id.recyclerViewMusicFolder);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewMusicFolder.setLayoutManager(layoutManager);

        List<MusicFolderData> musicFolderDataList = new ArrayList<>();
        musicFolderDataList.add(new MusicFolderData("Pop Music","Line of heart","https://media.gettyimages.com/photos/passionate-singer-picture-id828826780?s=612x612"));
        musicFolderDataList.add(new MusicFolderData("Classic Music","Palce to rest","https://i2-prod.mirror.co.uk/incoming/article245625.ece/ALTERNATES/s615b/james-morrison-pic-getty-746035957.jpg"));
        musicFolderDataList.add(new MusicFolderData("Romantic Music","Go to nature","https://stat1.hungama.ind.in/featured_content/b7ad48615c29167ded8fc9afb4c0f321_924x520.jpg"));
        musicFolderDataList.add(new MusicFolderData("Rock Music","Peace for rest","https://cdn.pinkvilla.com/files/styles/contentpreview/public/atif_0.jpg?itok=530JrJzt"));
        musicFolderDataList.add(new MusicFolderData("Classic Music","Palce to rest","https://i.dawn.com/large/2018/09/5b9022b5501b9.jpg"));
        musicFolderDataList.add(new MusicFolderData("Romantic Music","Go to nature","https://folder.pk/wp-content/uploads/2017/12/Ali-Zafar-Interests.jpg"));
        musicFolderDataList.add(new MusicFolderData("Classic Music","Palce to rest","https://i2-prod.mirror.co.uk/incoming/article245625.ece/ALTERNATES/s615b/james-morrison-pic-getty-746035957.jpg"));
        musicFolderDataList.add(new MusicFolderData("Romantic Music","Go to nature","https://stat1.hungama.ind.in/featured_content/b7ad48615c29167ded8fc9afb4c0f321_924x520.jpg"));
        musicFolderDataList.add(new MusicFolderData("Rock Music","Peace for rest","https://cdn.pinkvilla.com/files/styles/contentpreview/public/atif_0.jpg?itok=530JrJzt"));
        musicFolderDataList.add(new MusicFolderData("Classic Music","Palce to rest","https://i.dawn.com/large/2018/09/5b9022b5501b9.jpg"));


        MusicFolderAdapter musicFolderAdapter = new MusicFolderAdapter(musicFolderDataList,getContext());
        recyclerViewMusicFolder.setAdapter(musicFolderAdapter);
        return rootView;
    }
}