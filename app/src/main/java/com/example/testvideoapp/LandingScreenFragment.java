package com.example.testvideoapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;


public class LandingScreenFragment extends Fragment {

    Button signinUser;
    Button createaccountUser;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_landing_screen, container, false);

        signinUser = rootView.findViewById(R.id.buttonLogin);
        createaccountUser = rootView.findViewById(R.id.buttonCreateAccount);

        signinUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),LoginActivity.class);
                startActivity(intent);
            }
        });

        createaccountUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),CreateAccountActivity.class);
                startActivity(intent);
            }
        });

        return rootView;

    }


}