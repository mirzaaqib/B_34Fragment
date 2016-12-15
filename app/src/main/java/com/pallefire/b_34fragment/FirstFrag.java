package com.pallefire.b_34fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

/**
 * Created by Mirzaaqibbeg on 15-12-2016.
 */

public class FirstFrag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        inflater.inflate(R.layout.fragment_first,null);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
