package com.okan.marmaraniversitesibilgisayarprogramcl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout hakkindaButton = findViewById(R.id.button1);
        LinearLayout derslerButton = findViewById(R.id.button2);
        LinearLayout egitmenlerButton = findViewById(R.id.button3);
        LinearLayout galeriButton = findViewById(R.id.button4);
        LinearLayout iletisimButton = findViewById(R.id.button5);
        LinearLayout webButton = findViewById(R.id.button6);

        hakkindaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, hakkinda.class);
                startActivity(intent);
            }
        });

        derslerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mufredat.class);
                startActivity(intent);
            }
        });

        egitmenlerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, egitmenler.class);
                startActivity(intent);
            }
        });

        galeriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, galeri.class);
                startActivity(intent);
            }
        });

        iletisimButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, iletisim.class);
                startActivity(intent);
            }
        });

        webButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://bly.tbmyo.marmara.edu.tr/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        RelativeLayout facebook = findViewById(R.id.facebook);
        RelativeLayout twitter =  findViewById(R.id.twitter);
        RelativeLayout instagram = findViewById(R.id.instagram);
        RelativeLayout linkedin =  findViewById(R.id.linkedin);
        RelativeLayout youtube =  findViewById(R.id.youtube);


        facebook.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://www.facebook.com/marmara1883";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://twitter.com/marmara1883";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        instagram.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://www.instagram.com/marmara_univ/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://www.linkedin.com/school/marmara1883/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://www.youtube.com/marmara1883";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}