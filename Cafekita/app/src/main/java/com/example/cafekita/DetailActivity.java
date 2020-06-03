package com.example.cafekita;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

import java.net.URISyntaxException;

import static com.example.cafekita.MainActivity.Extra_Keterangan;
import static com.example.cafekita.MainActivity.Extra_Gambar;
import static com.example.cafekita.MainActivity.Extra_Nama;

public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Intent intent = getIntent();
        String gambar = intent.getStringExtra(Extra_Gambar);
        String nama = intent.getStringExtra(Extra_Nama);
        String keterangan = intent.getStringExtra(Extra_Keterangan);

        TextView tvnama = findViewById(R.id.tv_nama);
       TextView tvharga = findViewById(R.id.tv_harga);
//        TextView tvspek = findViewById(R.id.tv_spek);
//        TextView tvtoko = findViewById(R.id.tv_toko);
        TextView tvketerangan = findViewById(R.id.tv_keterangan);
        ImageView ivgambar = findViewById(R.id.iv_gambar);

        Glide.with(this).load(gambar).fitCenter().into(ivgambar);
        tvnama.setText(nama);
        tvketerangan.setText(keterangan);



    }

}

