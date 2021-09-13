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

public class UserProfileAdapter extends RecyclerView.Adapter<UserProfileAdapter.viewHolderGallery> {

    List<UserProfileData> userProfileDataList;
    private Context context;

    public UserProfileAdapter(List<UserProfileData> userProfileDataList, Context context) {
        this.userProfileDataList = userProfileDataList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolderGallery onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.user_profile_rv,parent,false);
        return new viewHolderGallery(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderGallery holder, final int position) {
        final UserProfileData userProfileData = userProfileDataList.get(position);
        holder.name.setText(userProfileData.getName());
        holder.writer.setText(userProfileData.getTitle());
        Picasso.get().load(userProfileData.getUrl()).into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, ""+userProfileData.getName(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context,ActivityGallery.class);
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return  userProfileDataList.size();
    }

    public class viewHolderGallery extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name;
        TextView writer;
        public viewHolderGallery(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewUserProfileRv);
            name = itemView.findViewById(R.id.textViewNameUserRv);
            writer = itemView.findViewById(R.id.textViewNameOfWriterUserRv);
        }
    }
}
