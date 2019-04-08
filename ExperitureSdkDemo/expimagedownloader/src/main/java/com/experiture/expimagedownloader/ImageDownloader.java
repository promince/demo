package com.experiture.expimagedownloader;

import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageDownloader {

    public static ImageDownloader getInstance(){
        return new ImageDownloader();
    }

    public void loadMyImage(String url, View view){
        Picasso.get()
                .load(url)
                .fit()
                .placeholder(R.drawable.ic_placeholder)
                .error(R.drawable.ic_error)
                .into((ImageView)view);
    }
}
