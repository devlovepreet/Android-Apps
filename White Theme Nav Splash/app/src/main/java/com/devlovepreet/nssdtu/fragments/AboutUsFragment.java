package com.devlovepreet.nssdtu.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devlovepreet.nssdtu.R;


public class AboutUsFragment extends Fragment {
    View v;

    public AboutUsFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.fragment_about_us, container, false);
        return v;
    }
}
