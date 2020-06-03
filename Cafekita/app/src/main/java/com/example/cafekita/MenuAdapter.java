package com.example.cafekita;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.Viewholder> {
    private Context context;
    private ArrayList<Menu> menus;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick (int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }

    public MenuAdapter(Context context, ArrayList<Menu> lsgunpla) {
        this.context = context;
        menus=lsgunpla;
    }

    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_menu,parent,false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(Viewholder holder, int position) {
        Menu menubaru = menus.get(position);
        String gambar = menubaru.getGambar();
        String nama = menubaru.getNama();
        String keterangan = menubaru.getKeterangan();
        String bahan = menubaru.getBahan();
        String harga = menubaru.getHarga();
        String cafe = menubaru.getCafe();

        holder.tvnama.setText(nama);
        holder.tvdes.setText(keterangan);

        Glide
                .with(context)
                .load(gambar)
                .centerCrop()
                .into(holder.image);


    }

    @Override
    public int getItemCount() {
        return menus.size();
    }




    public class Viewholder extends RecyclerView.ViewHolder{
        public ImageView image;
        public TextView tvnama;
        public TextView tvdes;
        public TextView tvspek;
        public TextView tvharga;
        public TextView tvtoko;

        Viewholder(@NonNull View view){
            super(view);
            image=view.findViewById(R.id.img_menu);
            tvnama=view.findViewById(R.id.tv_nama);
            tvdes=view.findViewById(R.id.tv_ket);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            mListener.onItemClick(position);
                        }
                    }
                }
            });
        }

    }
}
