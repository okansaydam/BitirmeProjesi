package com.okan.marmaraniversitesibilgisayarprogramcl;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class galeriSlider extends AppCompatActivity {
    private ViewPager viewPager;

    private class SliderAdapter extends PagerAdapter {
        private final int[] photoArray;

        public SliderAdapter(int[] photoArray) {
            this.photoArray = photoArray;
        }

        @Override
        public int getCount() {
            return photoArray.length;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            LayoutInflater inflater = LayoutInflater.from(galeriSlider.this);
            View view = inflater.inflate(R.layout.slider_item, container, false);

            ImageView slideImageView = view.findViewById(R.id.slideImageView);
            slideImageView.setImageResource(photoArray[position]);

            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((View) object);
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri_slider);

        int position = getIntent().getIntExtra("position", 0);

        viewPager = findViewById(R.id.viewPager);

        int[] photoArray = galeri.photoArray;
        SliderAdapter sliderAdapter = new SliderAdapter(photoArray);
        viewPager.setAdapter(sliderAdapter);

        viewPager.setCurrentItem(position);
    }
}
