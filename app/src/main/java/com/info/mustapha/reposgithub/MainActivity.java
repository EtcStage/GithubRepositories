package com.info.mustapha.reposgithub;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.info.mustapha.reposgithub.models.Repository;
import com.info.mustapha.reposgithub.commonclasses.ReposAdapter;
import java.util.ArrayList;

import java.util.List;







public class MainActivity extends AppCompatActivity {

    private List<Repository> reposList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ReposAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);


        mAdapter = new ReposAdapter(reposList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


        prepareMovieData();
    }


    private void prepareMovieData() {
        Repository repos = new Repository("Name 1", "owner1", "description 1 loree epsom detail in some words her just to clarify", "", 2345);
        reposList.add(repos);

        repos = new Repository("Name 1", "owner1", "description 1 loree epsom detail in some words her just to clarify", "", 2345);
        reposList.add(repos);

        repos = new Repository("Name 1", "owner1", "description 1 loree epsom detail in some words her just to clarify", "", 2345);
        reposList.add(repos);

        repos = new Repository("Name 1", "owner1", "description 1 loree epsom detail in some words her just to clarify", "", 2345);
        reposList.add(repos);

        repos = new Repository("Name 1", "owner1", "description 1 loree epsom detail in some words her just to clarify", "", 2345);
        reposList.add(repos);

        repos = new Repository("Name 1", "owner1", "description 1 loree epsom detail in some words her just to clarify", "", 2345);
        reposList.add(repos);

        repos = new Repository("Name 1", "owner1", "description 1 loree epsom detail in some words her just to clarify", "", 2345);
        reposList.add(repos);

        repos = new Repository("Name 1", "owner1", "description 1 loree epsom detail in some words her just to clarify", "", 2345);
        reposList.add(repos);

        repos = new Repository("Name 1", "owner1", "description 1 loree epsom detail in some words her just to clarify", "", 2345);
        reposList.add(repos);

        repos = new Repository("Name 1", "owner1", "description 1 loree epsom detail in some words her just to clarify", "", 2345);
        reposList.add(repos);

        repos = new Repository("Name 1", "owner1", "description 1 loree epsom detail in some words her just to clarify", "", 2345);
        reposList.add(repos);

        repos = new Repository("Name 1", "owner1", "description 1 loree epsom detail in some words her just to clarify", "", 2345);
        reposList.add(repos);

        repos = new Repository("Name 1", "owner1", "description 1 loree epsom detail in some words her just to clarify", "", 2345);
        reposList.add(repos);

        repos = new Repository("Name 1", "owner1", "description 1 loree epsom detail in some words her just to clarify", "", 2345);
        reposList.add(repos);

        repos = new Repository("Name 10", "owner1", "description 1 loree epsom detail in some words her just to clarify", "", 2345);
        reposList.add(repos);
        mAdapter.notifyDataSetChanged();
    }
}