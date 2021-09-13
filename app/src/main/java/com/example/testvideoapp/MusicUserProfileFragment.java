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

public class MusicUserProfileFragment extends Fragment {

    RecyclerView recyclerViewUserProfile;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_music_user_profile, container, false);
        recyclerViewUserProfile =rootView. findViewById(R.id.recyclerViewUserProfile);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewUserProfile.setLayoutManager(layoutManager);

        List<UserProfileData> userProfileDataList = new ArrayList<>();
        userProfileDataList.add(new UserProfileData("Ali zafar","Rockstar ","https://i.ytimg.com/vi/nVtlzJ9I244/hqdefault.jpg"));
        userProfileDataList.add(new UserProfileData("Atif ASlam","Zindagi","https://runwaypakistan.com/wp-content/uploads/2020/01/Atif-Aslam-in-Enigma-Runway-Pakistan-01.jpg"));
        userProfileDataList.add(new UserProfileData("Arijit Singh","Bekhyali","https://i.ytimg.com/vi/1v-ZpUgrwVk/maxresdefault.jpg"));
        userProfileDataList.add(new UserProfileData("Nusrat Fateh","Rat gaye","https://s.saregama.com/image/c/fw_485/d/03/db/nusrat-1400x1400_1502865392.jpg"));
        userProfileDataList.add(new UserProfileData("Ali zafar","Rockstar ","https://i.ytimg.com/vi/nVtlzJ9I244/hqdefault.jpg"));
        userProfileDataList.add(new UserProfileData("Atif ASlam","Zindagi","https://runwaypakistan.com/wp-content/uploads/2020/01/Atif-Aslam-in-Enigma-Runway-Pakistan-01.jpg"));
        userProfileDataList.add(new UserProfileData("Arijit Singh","Bekhyali","https://i.ytimg.com/vi/1v-ZpUgrwVk/maxresdefault.jpg"));

        UserProfileAdapter userProfileAdapter = new UserProfileAdapter(userProfileDataList,getContext());
        recyclerViewUserProfile.setAdapter(userProfileAdapter);
        return rootView;
    }
}
