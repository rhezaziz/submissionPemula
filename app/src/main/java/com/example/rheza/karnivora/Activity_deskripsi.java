package com.example.rheza.karnivora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Activity_deskripsi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        karnivora karni = getIntent().getParcelableExtra("key");
        ImageView gamabar = (ImageView)findViewById(R.id.img_item_photo);
        TextView name = (TextView)findViewById(R.id.tv_item_name);
        TextView remarks = (TextView)findViewById(R.id.tv_item_remarks);
        TextView deskripsi = (TextView)findViewById(R.id.content_detail);


        Glide.with(this).load(karni.getGambar()).override(350,550).into(gamabar);
        name.setText(karni.getNama());
        remarks.setText(karni.getDetail());
        deskripsi.setText(karni.getDeskirpsi());


//        Log.i("photo", karni.getGambar());
//        Log.i("deskripsi", karni.getDeskirpsi());
    }
}
