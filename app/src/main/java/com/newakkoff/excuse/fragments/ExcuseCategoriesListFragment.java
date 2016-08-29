package com.newakkoff.excuse.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.newakkoff.excuse.R;
import com.newakkoff.excuse.models.Excuse;
import com.newakkoff.excuse.models.ExcuseCategory;

import java.util.ArrayList;
import java.util.List;


public class ExcuseCategoriesListFragment extends Fragment {

    private static final String TAG = "ExcuseCategoriesListFragment";
    private RecyclerView excuseCategoriesRecyclerView;
    private ArrayList<ExcuseCategory> excuseCategoryList;
    private List<Excuse> excuseList;
    private Toolbar toolbar;
    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         rootView = inflater.inflate(R.layout.fragment_excuse_categories_list, container, false);

        onToolbarCreated();
        onRecyclerCreate();

        return rootView;
    }

    private void onToolbarCreated() {
        toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(ContextCompat.getColor(getActivity(), R.color.white));
        toolbar.setTitle(R.string.category_choice_text);
    }

    private void onRecyclerCreate() {
        excuseCategoryList = getActivity().getIntent().getParcelableArrayListExtra("allCategories");
        excuseCategoriesRecyclerView = (RecyclerView) rootView.findViewById(R.id.excuse_categories_recycler_view);
        excuseCategoriesRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        excuseCategoriesRecyclerView.setAdapter(new ExcuseCategoriesAdapter());
    }


    private class ExcuseCategoriesHolder extends RecyclerView.ViewHolder {

        CardView categoryCardView;
        TextView categoryTitle;
        TextView categoryDescription;

        public ExcuseCategoriesHolder(View itemView) {
            super(itemView);

            categoryCardView = (CardView) itemView.findViewById(R.id.card_view_for_recycler_categories);
            categoryTitle = (TextView) itemView.findViewById(R.id.text_view_for_category_title);
            categoryDescription = (TextView) itemView.findViewById(R.id.tex_view_for_category_description);


        }
    }

    private class ExcuseCategoriesAdapter extends RecyclerView.Adapter<ExcuseCategoriesHolder> {


        @Override
        public ExcuseCategoriesHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_for_recycler_categories, parent, false);
            return new ExcuseCategoriesHolder(view);
        }

        @Override
        public void onBindViewHolder(ExcuseCategoriesHolder holder, int position) {

            holder.categoryTitle.setText(excuseCategoryList.get(position).getCategoryName());
            holder.categoryDescription.setText(excuseCategoryList.get(position).getCategoryDescription());
        }

        @Override
        public int getItemCount() {
            if (excuseCategoryList != null)
                return excuseCategoryList.size();
            else
                return 0;
        }
    }


}
