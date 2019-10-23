package com.example.rheza.karnivora;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvHewan;
    private List<karnivora> karni = new ArrayList<>();
    private listAdapter viewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHewan = findViewById(R.id.rv_heroes);
        rvHewan.setHasFixedSize(true);

        karni.addAll(karnivoraData.getListData());

        showRecyclerList();


    }

    private void showRecyclerList() {
        viewAdapter = new listAdapter(this, karni );
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rvHewan.setLayoutManager(mLayoutManager);
        rvHewan.setItemAnimator(new DefaultItemAnimator());
        rvHewan.setAdapter(viewAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        final int id = item.getItemId();
        switch (id){
            case R.id.coba :
                Intent intent = new Intent(MainActivity.this , TentangActivity.class);
                startActivity(intent);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
