package com.newakkoff.excuse.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.newakkoff.excuse.R;
import com.newakkoff.excuse.models.ExcuseCategory;

import java.util.List;


public class ExcuseListFragment extends Fragment {

    private RecyclerView excuseCategoriesRecyclerView;
    private List<ExcuseCategory> excuseCategoryList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_excuse_list, container, false);

        excuseCategoriesRecyclerView = (RecyclerView) rootView.findViewById(R.id.excuse_categories_recycler_view);
        excuseCategoriesRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        return rootView;
    }

/*
    private class ExcuseCategoriesHolder extends RecyclerView.ViewHolder {

        public TextView excuseTitleTextView;

        public ExcuseCategoriesHolder(View itemView) {
            super(itemView);

            excuseTitleTextView = (TextView) itemView;


        }
    }

    private class ExcuseCategoriesAdapter extends RecyclerView.Adapter<ExcuseCategoriesHolder> {

        @Override

        public ExcuseCategoriesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(android.R.layout.simple_list_item_1, parent, false);
            return new ExcuseCategoriesHolder(view);
        }

        @Override
        public void onBindViewHolder(ExcuseCategoriesHolder holder, int position) {
            ExcuseCategory excuseCategory = excuseCategoryList.get(position);
            holder.excuseTitleTextView.setText(excuseCategory.getCategoryName());
        }

        @Override
        public int getItemCount() {
            return excuseCategoryList.size();
        }
    }*/


}
