package edu.ma.wa.nqueue.capstoneapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.ma.wa.nqueue.capstoneapp.R;

/**
 * Created by Josh on 5/5/2017.
 */

public class Exercise extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_exercise,container,false);
        return v;
    }

}
