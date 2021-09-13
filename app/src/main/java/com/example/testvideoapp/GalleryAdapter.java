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

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.viewHolderGallery> {
    List<GalleryData> galleryDataList;

    public GalleryAdapter(List<GalleryData> galleryDataList) {
        this.galleryDataList = galleryDataList;
    }

    @NonNull
    @Override
    public viewHolderGallery onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.gallery_rv,parent,false);
        return new viewHolderGallery(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderGallery holder, int position) {
        GalleryData galleryData = galleryDataList.get(position);
        holder.name.setText(galleryData.getNameOfAlbum());
        holder.writer.setText(galleryData.getWriterOfAlbum());
        Picasso.get().load(galleryData.getUrlImage()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return  galleryDataList.size();
    }

    public class viewHolderGallery extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        TextView writer;
        public viewHolderGallery(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewGallery);
            name = itemView.findViewById(R.id.textViewTitleGallery);
            writer = itemView.findViewById(R.id.textViewDescriptionGallery);
        }
    }
}
