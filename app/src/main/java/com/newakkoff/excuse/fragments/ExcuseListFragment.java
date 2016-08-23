package com.newakkoff.excuse.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.newakkoff.excuse.R;
import com.newakkoff.excuse.models.ExcuseCategory;
import com.newakkoff.excuse.tasks.ExcuseCategoryInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ExcuseListFragment extends Fragment {

    private RecyclerView excuseCategoriesRecyclerView;
    private List<ExcuseCategory> excuseCategoryList;
    private Retrofit retrofit;
    private String BASE_URL = "http://10.0.2.2:8080";
    private ExcuseCategoryInterface excuseCategoryInterface;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_excuse_categories_list, container, false);

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        excuseCategoryInterface = retrofit.create(ExcuseCategoryInterface.class);

        Call<List<ExcuseCategory>> getCategoryList = excuseCategoryInterface.getAllExcuseCategories();

        getCategoryList.enqueue(new Callback<List<ExcuseCategory>>() {
            @Override
            public void onResponse(Call<List<ExcuseCategory>> call, Response<List<ExcuseCategory>> response) {
                excuseCategoryList = response.body();
            }

            @Override
            public void onFailure(Call<List<ExcuseCategory>> call, Throwable t) {
                Log.i("RETROFIT", "Failure");
            }
        });

        ExcuseCategoriesAdapter excuseCategoriesAdapter = new ExcuseCategoriesAdapter();

        excuseCategoriesRecyclerView = (RecyclerView) rootView.findViewById(R.id.excuse_categories_recycler_view);
        excuseCategoriesRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        excuseCategoriesRecyclerView.setAdapter(excuseCategoriesAdapter);

        return rootView;
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
