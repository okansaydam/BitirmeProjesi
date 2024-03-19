package com.okan.marmaraniversitesibilgisayarprogramcl;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

public class mufredat extends AppCompatActivity {

    // butonların tabloların görünürlüğünü değiştirmesi
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mufredat);

        for (int i = 1; i <= 10; i++) {
            final int buttonId = getResources().getIdentifier("btn" + i, "id", getPackageName());
            final int tableId = getResources().getIdentifier("tbl" + i, "id", getPackageName());

            Button button = findViewById(buttonId);
            final TableLayout table = findViewById(tableId);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (table.getVisibility() == View.VISIBLE) {
                        table.setVisibility(View.GONE);
                    } else {
                        table.setVisibility(View.VISIBLE);
                    }
                }
            });
        }
        // butonların yüksekliğini ekran yüksekliğine göre ayarlama
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenHeight = displayMetrics.heightPixels;

        int buttonHeight = (screenHeight / 10);

        for (int i = 1; i <= 10; i++) {
            int resId = getResources().getIdentifier("btn" + i, "id", getPackageName());
            Button button = findViewById(resId);
            ViewGroup.LayoutParams params = button.getLayoutParams();
            params.height = buttonHeight;
        }
        // onclick arka plan ve ders açıklamaları ayarlamaları
        String[] dersAciklamalari = new String[52];
        for (int j = 0; j < 52; j++) {
            String dersAdi = "ders" + (j + 1);
            int stringId = getResources().getIdentifier(dersAdi, "string", getPackageName());
            dersAciklamalari[j] = getResources().getString(stringId);

            for (int i = 1; i <= 52; i++) {
                int dersId = getResources().getIdentifier("ders" + i, "id", getPackageName());
                int krediId = getResources().getIdentifier("kredi" + i, "id", getPackageName());
                TextView dersTextView = findViewById(dersId);
                TextView krediTextView = findViewById(krediId);

                dersTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dersTextView.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.light_blue));
                        krediTextView.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.light_blue));

                        String dersAdi = dersTextView.getResources().getResourceEntryName(dersTextView.getId());
                        int index = Integer.parseInt(dersAdi.substring(4)) - 1;

                        AlertDialog.Builder builder = new AlertDialog.Builder(mufredat.this);
                        builder.setMessage(dersAciklamalari[index])
                                .setCancelable(false)
                                .setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dersTextView.setBackgroundColor(Color.TRANSPARENT);
                                        krediTextView.setBackgroundColor(Color.TRANSPARENT);
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alert = builder.create();
                        alert.setTitle(dersTextView.getText().toString());
                        alert.show();
                    }
                });
            }
        }
    }
}