package dahun.co.kr.moviesearcher;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView ivImage;
        TextView tvName;
        RatingBar ratingBar;
        TextView tvYear;
        TextView tvDirector;
        TextView tvActors;

        MyViewHolder(View view){
            super(view);
            ivImage = view.findViewById(R.id.iv_image);
            tvName = view.findViewById(R.id.tv_movie_name);
            tvYear = view.findViewById(R.id.tv_movie_year);
            ratingBar = view.findViewById(R.id.rating_bar);
            tvDirector = view.findViewById(R.id.tv_movie_director);
            tvActors = view.findViewById(R.id.tv_movie_actors);
        }
    }

    private ArrayList<MovieInfo> movieInfoArrayList;

    MyAdapter(ArrayList<MovieInfo> movieInfoArrayList){
        this.movieInfoArrayList = movieInfoArrayList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        MyViewHolder myViewHolder = (MyViewHolder) holder;

        myViewHolder.ivImage.setImageResource(movieInfoArrayList.get(position).getImageId());
        myViewHolder.tvName.setText(movieInfoArrayList.get(position).getName());
        myViewHolder.ratingBar.setRating(movieInfoArrayList.get(position).getScore());
        myViewHolder.tvYear.setText(movieInfoArrayList.get(position).getYear());
        myViewHolder.tvDirector.setText(movieInfoArrayList.get(position).getDirector());
        myViewHolder.tvActors.setText(movieInfoArrayList.get(position).getActors());
    }

    @Override
    public int getItemCount() {
        return movieInfoArrayList.size();
    }
}
