package com.info.mustapha.reposgithub.commonclasses;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;
import com.info.mustapha.reposgithub.R;
import com.info.mustapha.reposgithub.models.Repository;

public class ReposAdapter  extends RecyclerView.Adapter<ReposAdapter.MyViewHolder> {

    private List<Repository> reposList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;
        public TextView nameRepos,owner,description,starCount;
        public ImageView ownerImage;

        public MyViewHolder(View view) {
            super(view);
            nameRepos = (TextView) view.findViewById(R.id.name);
            owner = (TextView) view.findViewById(R.id.owner);
            description = (TextView) view.findViewById(R.id.description);
            starCount = (TextView) view.findViewById(R.id.starsCount);
            ownerImage = (ImageView) view.findViewById(R.id.owner_img);
        }
    }


    public ReposAdapter(List<Repository> reposList) {
        this.reposList = reposList;
    }



    @Override
    public ReposAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.repository_list_row, parent, false);

        return new ReposAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ReposAdapter.MyViewHolder holder, int position) {
        Repository repos = reposList.get(position);
        holder.nameRepos.setText(repos.getName());
        holder.owner.setText(repos.getOwner());
        holder.description.setText(repos.getDescription());

        if(repos.getStarCount()>1000){
            double starcount = (double)(repos.getStarCount()/1000.00);
            //float starcount = (float)Math.round(repos.getStarCount()) / 1000;
            holder.starCount.setText(String.format("%.02f", starcount)+" k");
        }else{
            int starcount = repos.getStarCount();
            holder.starCount.setText(starcount+" ");
        }







    }

    @Override
    public int getItemCount() {
        return reposList.size();
    }
}