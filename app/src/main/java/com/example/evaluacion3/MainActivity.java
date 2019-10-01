package com.example.evaluacion3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void forgotPassword(View view){
        Snackbar snackbar = Snackbar.make(view,"Deseas recuperar tu cuenta?",Snackbar.LENGTH_LONG)
                .setAction("RECUPERAR", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Se ha enviado la informacion de recuperacion a tu cuenta de correo",Toast.LENGTH_LONG).show();
                    }
                });

        snackbar.setActionTextColor(Color.GREEN);
        View snackbarView = snackbar.getView();
        snackbarView.setBackgroundColor(Color.BLACK);
        snackbar.show();
    }

    public void validateLoginForm(View view){
        EditText user = findViewById(R.id.user);
        String sUser = user.getText().toString();

        EditText pass = findViewById(R.id.pass);
        String sPass = pass.getText().toString();

        if (sUser.isEmpty()|| sPass.isEmpty()){
            Toast.makeText(MainActivity.this,"Favor ingresar usuario y/o contrasena",Toast.LENGTH_LONG).show();
        } else {
            Intent intent = new Intent(MainActivity.this,Galeria.class);
            startActivity(intent);
        }



    }
}
