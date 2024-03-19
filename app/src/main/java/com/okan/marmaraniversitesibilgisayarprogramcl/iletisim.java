package com.okan.marmaraniversitesibilgisayarprogramcl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class iletisim extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iletisim);



        ImageView imageViewMap = findViewById(R.id.imageViewMap);
        imageViewMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Marmara Üniversitesi Mehmet Genç Külliyesi");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);

            }
        });

        TextView textViewNumber1 = findViewById(R.id.textViewNumber1);
        TextView textViewNumber2 = findViewById(R.id.textViewNumber2);
        TextView textViewNumber3 = findViewById(R.id.textViewNumber3);

        textViewNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "02167774061";
                Uri dialUri = Uri.parse("tel:" + phoneNumber);
                Intent dialIntent = new Intent(Intent.ACTION_DIAL, dialUri);
                startActivity(dialIntent);
            }
        });

        textViewNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "02167774058";
                Uri dialUri = Uri.parse("tel:" + phoneNumber);
                Intent dialIntent = new Intent(Intent.ACTION_DIAL, dialUri);
                startActivity(dialIntent);
            }
        });

        textViewNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "02167774059";
                Uri dialUri = Uri.parse("tel:" + phoneNumber);
                Intent dialIntent = new Intent(Intent.ACTION_DIAL, dialUri);
                startActivity(dialIntent);
            }
        });

        TextView textView = findViewById(R.id.textViewEmail);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emailAddress = "tbmyo@marmara.edu.tr";

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:" + emailAddress));
                startActivity(intent);
            }
        });



    }
}
