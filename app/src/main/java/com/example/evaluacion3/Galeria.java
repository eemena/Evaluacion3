package com.example.evaluacion3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

import com.example.evaluacion3.adapter.AdapterGaleria;
import com.example.evaluacion3.modelo.GaleriaModel;

import java.util.ArrayList;

public class Galeria extends AppCompatActivity {

    private GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);
        Log.wtf("Ciclo de vida", "onCreate");

        AdapterGaleria adapter = new AdapterGaleria(listar(),this);
        gridView = findViewById(R.id.grid);
        gridView.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.wtf("Ciclo de vida", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.wtf("Ciclo de vida", "onRestart");
    }

    private ArrayList<GaleriaModel> listar(){
        TypedArray imagenes = getResources().obtainTypedArray(R.array.galeria);

        ArrayList<GaleriaModel> lista = new ArrayList<>();

        for (int i=0; i<imagenes.length(); i++){
            lista.add(new GaleriaModel(imagenes.getResourceId(i,0)));
        }
        return lista;
    }

}
