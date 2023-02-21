package com.example.aplikasidiagnosakelapasawit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView b_konsul,konsul,pengobatan,penyakit,pestisida,tentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        konsul   = (CardView) findViewById(R.id.konsultasi);
        penyakit   = (CardView) findViewById(R.id.penyakit);


        konsul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Konsultasi_activity.class);
                startActivity(i);
            }
        });


        penyakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),DaftarPenyakitActivity.class);
                startActivity(i);
            }
        });


    }
}