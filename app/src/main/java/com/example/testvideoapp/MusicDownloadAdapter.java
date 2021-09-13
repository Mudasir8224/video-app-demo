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

public class MusicDownloadAdapter extends RecyclerView.Adapter<MusicDownloadAdapter.viewHolderGallery> {
    List<MusicDownloadData> musicDownloadDataList;

    public MusicDownloadAdapter(List<MusicDownloadData> musicDownloadDataList) {
        this.musicDownloadDataList = musicDownloadDataList;
    }

    @NonNull
    @Override
    public viewHolderGallery onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.music_download_rv,parent,false);
        return new viewHolderGallery(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderGallery holder, int position) {
        MusicDownloadData musicDownloadData = musicDownloadDataList.get(position);
        holder.name.setText(musicDownloadData.getNameOfAlbum());
        holder.writer.setText(musicDownloadData.getWriterOfAlbum());
        Picasso.get().load(musicDownloadData.getUrlImage()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return  musicDownloadDataList.size();
    }

    public class viewHolderGallery extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        TextView writer;
        public viewHolderGallery(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewDownload);
            name = itemView.findViewById(R.id.textViewTitle);
            writer = itemView.findViewById(R.id.textViewDescription);

        }
    }
}
