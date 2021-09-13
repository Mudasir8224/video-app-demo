package com.example.testvideoapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MusicAlbumAdapter extends RecyclerView.Adapter<MusicAlbumAdapter.viewHolderGallery> {
    List<MusicAlbumData> musicAlbumDataList;

    public MusicAlbumAdapter(List<MusicAlbumData> musicAlbumDataList) {
        this.musicAlbumDataList = musicAlbumDataList;
    }

    @NonNull
    @Override
    public viewHolderGallery onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.music_album_rv,parent,false);
        return new viewHolderGallery(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderGallery holder, int position) {
        MusicAlbumData musicAlbumData = musicAlbumDataList.get(position);
        holder.name.setText(musicAlbumData.getNameOfAlbum());
        holder.writer.setText(musicAlbumData.getWriterOfAlbum());
        Picasso.get().load(musicAlbumData.getUrlImage()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return  musicAlbumDataList.size();
    }

    public class viewHolderGallery extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        TextView writer;
        public viewHolderGallery(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewMusicAlbum);
            name = itemView.findViewById(R.id.textViewNameOfAlbum);
            writer = itemView.findViewById(R.id.textViewNameOfWriter);

        }
    }
}
