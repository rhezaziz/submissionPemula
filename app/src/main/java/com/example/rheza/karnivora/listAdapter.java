package com.example.rheza.karnivora;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class listAdapter extends RecyclerView.Adapter<listAdapter.ListViewHolder> {
    private List<karnivora> listKarni;
    private Context context;

    public listAdapter(Context context , List<karnivora> listKarni){
        this.listKarni = listKarni;
        this.context = context;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_hero, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final karnivora karni = listKarni.get(position);
        Glide.with(holder.itemView.getContext())
                .load(karni.getGambar())
                .apply(new RequestOptions().override(55 , 55))
                .into(holder.photoHewan);
        holder.namaHewan.setText(karni.getNama());
        holder.detailHewan.setText(karni.getDetail());
        holder.rlHewan.setOnClickListener(new CustomOnItemClick(position, new CustomOnItemClick.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent(context , Activity_deskripsi.class);
                intent.putExtra("key", karni);
                context.startActivity(intent);
            }
        }));
    }

    @Override
    public int getItemCount() {
        return listKarni.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView photoHewan;
        TextView namaHewan , detailHewan;
        karnivora karni;
        RelativeLayout rlHewan;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            photoHewan = itemView.findViewById(R.id.img_item_photo);
            namaHewan = itemView.findViewById(R.id.tv_item_name);
            detailHewan = itemView.findViewById(R.id.tv_item_detail);
            rlHewan = itemView.findViewById(R.id.RLHewan);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context , Activity_deskripsi.class);
            intent.putExtra("key", karni);
            context.startActivity(intent);
        }
    }
}
