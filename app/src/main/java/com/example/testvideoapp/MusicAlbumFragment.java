package com.example.testvideoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;


public class MusicAlbumFragment extends Fragment {
    SliderView sliderView;
    RecyclerView recyclerViewMusicAlbum;
    TextView viewAllGallery;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_music_album, container, false);

        viewAllGallery = rootView.findViewById(R.id.viewAll);

        viewAllGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ActivityGallery.class);
                startActivity(intent);
            }
        });

        sliderView =rootView. findViewById(R.id.imageSlider);
        sliderView.setSliderAdapter(new SliderAdapter(getActivity()));

        recyclerViewMusicAlbum =rootView. findViewById(R.id.recyclerViewMusicAlbum);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerViewMusicAlbum.setLayoutManager(layoutManager);

        List<MusicAlbumData> musicAlbumDataList = new ArrayList<>();
        musicAlbumDataList.add(new MusicAlbumData("Soul River","Kemba Walker","https://i.pinimg.com/originals/3a/f0/e5/3af0e55ea66ea69e35145fb108b4a636.jpg"));
        musicAlbumDataList.add(new MusicAlbumData("Rocking Life","Paul Palce","https://www.watertower-music.com/images/features/JOKER_SDTK_Banner_FeatureImageSource.png"));
        musicAlbumDataList.add(new MusicAlbumData("Excel","Nikola","https://cloud.netlifyusercontent.com/assets/344dbf88-fdf9-42bb-adb4-46f01eedd629/6b2ef062-6913-4a94-a265-7d75f4f91854/64.jpg"));
        musicAlbumDataList.add(new MusicAlbumData("Pop Max","Thfet Robert","https://www.alltalkradio.net/wp-content/uploads/2019/09/www.alltalkradio.net-top-10-nigerian-music-albums-of-2019-2019-09-03_17-38-23_231279-www.alltalkradio.net.jpg"));
        musicAlbumDataList.add(new MusicAlbumData("Soul River","Kemba Walker","https://weddingphotography.com.ph/wp-content/uploads/2011/02/03-how-to-photograph-group-portraits-for-music-album-cover-simple-plan.jpg"));
        musicAlbumDataList.add(new MusicAlbumData("Soul River","Kemba Walker","https://i.pinimg.com/originals/3a/f0/e5/3af0e55ea66ea69e35145fb108b4a636.jpg"));
        musicAlbumDataList.add(new MusicAlbumData("Rocking Life","Paul Palce","https://www.watertower-music.com/images/features/JOKER_SDTK_Banner_FeatureImageSource.png"));
        musicAlbumDataList.add(new MusicAlbumData("Excel","Nikola","https://cloud.netlifyusercontent.com/assets/344dbf88-fdf9-42bb-adb4-46f01eedd629/6b2ef062-6913-4a94-a265-7d75f4f91854/64.jpg"));
        musicAlbumDataList.add(new MusicAlbumData("Pop Max","Thfet Robert","https://www.alltalkradio.net/wp-content/uploads/2019/09/www.alltalkradio.net-top-10-nigerian-music-albums-of-2019-2019-09-03_17-38-23_231279-www.alltalkradio.net.jpg"));

        MusicAlbumAdapter galleryAdapter = new MusicAlbumAdapter(musicAlbumDataList);
        recyclerViewMusicAlbum.setAdapter(galleryAdapter);
        return rootView;

    }
}

