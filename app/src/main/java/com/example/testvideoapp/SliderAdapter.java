package com.example.testvideoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;
import com.squareup.picasso.Picasso;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.viewHolderSlideImage> {


    private Context context;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    @Override
    public viewHolderSlideImage onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_slider, null);
        return new viewHolderSlideImage(inflate);
    }

    @Override
    public void onBindViewHolder(viewHolderSlideImage viewHolder, int position) {

        switch (position) {

            case 0:
                Picasso.get()
                        .load("https://opendevs.org/wp-content/uploads/2019/08/m31.jpg")
                        .into(viewHolder.imageViewBackground);
                break;
            case 1:
                Picasso.get()
                        .load("https://media.wired.com/photos/5a0b6dbc4d244a18f0437811/master/w_2560%2Cc_limit/iStock-636156852.jpg")
                        .into(viewHolder.imageViewBackground);
                break;
            default:
                Picasso.get()
                        .load("https://static.wixstatic.com/media/548f98_5bee6094c9da415c9ee211ec076376f9~mv2.jpg")
                        .into(viewHolder.imageViewBackground);
                break;

        }

    }

    @Override
    public int getCount() {
        //slider view count could be dynamic size
        return 3;
    }

    class viewHolderSlideImage extends SliderViewAdapter.ViewHolder {

        ImageView imageViewBackground;

        public viewHolderSlideImage(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.imageViewBackground);
        }

    }
}
