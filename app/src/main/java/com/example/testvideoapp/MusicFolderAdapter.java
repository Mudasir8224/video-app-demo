package com.example.testvideoapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MusicFolderAdapter extends RecyclerView.Adapter<MusicFolderAdapter.viewHolderGallery> {

    List<MusicFolderData> musicFolderDataList;
    private Context context;

    public MusicFolderAdapter(List<MusicFolderData> musicFolderDataList, Context context) {
        this.musicFolderDataList = musicFolderDataList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolderGallery onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.music_folder_rv,parent,false);
        return new viewHolderGallery(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderGallery holder, final int position) {
        final MusicFolderData musicFolderData = musicFolderDataList.get(position);
        holder.name.setText(musicFolderData.getNameOfAlbum());
        holder.writer.setText(musicFolderData.getWriterOfAlbum());
        Picasso.get().load(musicFolderData.getUrlImage()).into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, ""+musicFolderData.getNameOfAlbum(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context,ActivityGallery.class);
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return  musicFolderDataList.size();
    }

    public class viewHolderGallery extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        TextView writer;
        public viewHolderGallery(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewMusicFolderCategory);
            name = itemView.findViewById(R.id.textViewNameOfCategory);
            writer = itemView.findViewById(R.id.textViewNameOfWriterCategory);
        }
    }
}
