package com.newakkoff.excuse.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.newakkoff.excuse.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExcusesListFragment extends Fragment {

    private View rootView;
    private Toolbar toolbar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_excuses_list, container, false);

        onToolbarCreated();

        return rootView;
    }

    private void onToolbarCreated() {
        toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(ContextCompat.getColor(getActivity(), R.color.white));
        toolbar.setTitle("Выберите отговорку!");
    }

}
