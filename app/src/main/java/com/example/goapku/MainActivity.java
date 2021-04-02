package com.example.goapku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void clickRS(View view) {
        //gambar Rumah Sakit di klik
        Intent i = new Intent(this, RS.class);
        startActivity(i);
    }

    public void clickMasjid(View view) {
        //gambar masjid di klik
        Intent i = new Intent(this, Masjid.class);
        startActivity(i);
    }

    public void clickBank(View view) {
        //gambar ATM di klik
        Intent i = new Intent(this, ATM.class);
        startActivity(i);
    }

    public void clickMall(View view) {
        //gambar Bioskop di klik
        Intent i = new Intent(this, Bioskop.class);
        startActivity(i);
    }
}