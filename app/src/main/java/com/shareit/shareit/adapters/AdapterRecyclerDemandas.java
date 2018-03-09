package com.shareit.shareit.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.shareit.shareit.R;
import com.shareit.shareit.model.Demanda;

import java.util.ArrayList;

public class AdapterRecyclerDemandas extends RecyclerView.Adapter<AdapterRecyclerDemandas.ViewHolderDatos> {

    ArrayList<Demanda> lista;

    public AdapterRecyclerDemandas(ArrayList<Demanda> lista) {
        this.lista = lista;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
        holder.nombre.setText(lista.get(position).getNombreDemanda());
        holder.imageView.setImageResource(R.drawable.comunidades);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nombre;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            imageView= itemView.findViewById(R.id.fotoProducto);
            nombre = itemView.findViewById(R.id.textNombre);
        }

        public ImageView getImageView() {
            return imageView;
        }

        public TextView getNombre() {
            return nombre;
        }
    }
}
