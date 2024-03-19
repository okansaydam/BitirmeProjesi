package com.okan.marmaraniversitesibilgisayarprogramcl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class galeri extends AppCompatActivity {
    public static final int[] photoArray = new int[28];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);

        for (int i = 0; i < 28; i++) {
            String photoName = "foto" + (i + 1);
            int resourceId = getResources().getIdentifier(photoName, "drawable", getPackageName());
            photoArray[i] = resourceId;
        }

        GridView gridView = findViewById(R.id.gridView);
        GalleryAdapter galleryAdapter = new GalleryAdapter(this, photoArray);
        gridView.setAdapter(galleryAdapter);
    }
}