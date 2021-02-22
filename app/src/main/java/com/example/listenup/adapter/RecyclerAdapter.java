package com.example.listenup.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listenup.R;
import com.example.listenup.model.Feed;
import com.example.listenup.model.results.results;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {



        //context to inflate the layout...
        private Context ctx;

        //storing all the songs in a list...
        private ArrayList<results> songList;

        //getting the context and song list with constructor...
        public RecyclerAdapter(Context ctx, ArrayList<results> songList) {
            this.ctx = ctx;
            this.songList = songList;
        }

    @NonNull
    @Override
        public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            //inflating and returning view holder...
            LayoutInflater inflater = LayoutInflater.from(ctx);
            View view = inflater.inflate(R.layout.card_layout, null);
            return new RecyclerAdapter.ViewHolder(view);
        }

    @Override
        public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
            //getting the product of the specified position...
            results song = songList.get(position);
            //binding the data with the viewholder views...
            holder.artistName.setText(song.getArtistName());
            holder.trackName.setText(song.getTrackName());
            Picasso.get().load(song.getArtworkUrl100()).into(holder.imageView);


        }


        @Override
        public int getItemCount() {
            return songList.size();
        }


        class ViewHolder extends RecyclerView.ViewHolder {

            TextView trackName, artistName;
            ImageView imageView;
            public ViewHolder(View itemView) {
                super(itemView);

                trackName = itemView.findViewById(R.id.trackName);
                artistName = itemView.findViewById(R.id.artistName);
                imageView = itemView.findViewById(R.id.imageView);
            }
        }
    }


