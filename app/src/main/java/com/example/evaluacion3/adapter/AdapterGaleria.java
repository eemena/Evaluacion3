package com.example.evaluacion3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;


import com.example.evaluacion3.R;
import com.example.evaluacion3.modelo.GaleriaModel;

import java.util.ArrayList;

public class AdapterGaleria extends BaseAdapter {

    public AdapterGaleria(ArrayList<GaleriaModel> elementos, Context context) {
        this.elementos = elementos;
        this.context = context;
    }

    private ArrayList<GaleriaModel> elementos;
    private Context context;
    @Override
    public int getCount() {
        return elementos.size();
    }

    @Override
    public GaleriaModel getItem(int position) {
        return elementos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = convertView;

        if (convertView==null){
            view=inflater.inflate(R.layout.grid_template,null);
        }

        ImageView imagen = view.findViewById(R.id.imagen);
        imagen.setImageResource(getItem(position).getImagen());

        return view;
    }
}
