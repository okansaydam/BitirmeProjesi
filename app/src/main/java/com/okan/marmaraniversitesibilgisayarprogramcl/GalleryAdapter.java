package com.okan.marmaraniversitesibilgisayarprogramcl;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GalleryAdapter extends BaseAdapter {
    private final Context context;
    private final int[] photoArray;

    public GalleryAdapter(Context context, int[] photoArray) {
        this.context = context;
        this.photoArray = photoArray;
    }

    @Override
    public int getCount() {
        return photoArray.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(context);
            int gridWidth = ((GridView) parent).getColumnWidth();
            imageView.setLayoutParams(new GridView.LayoutParams(gridWidth, gridWidth));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(photoArray[position]);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, galeriSlider.class);
                intent.putExtra("position", position);
                context.startActivity(intent);
            }
        });

        return imageView;

    }
}
