package com.evaluacion2nomoreplz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VerGrandeBienGrande extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_grande_bien_grande);


    }
    public void volver(View W)
    {   Bundle B = getIntent().getExtras();
        String Dato=B.getString("nombre");
        double lat = B.getDouble("lat");
        double lon = B.getDouble("lon");
        Intent I = new Intent(getApplicationContext(),Principal.class);
        I.putExtra("lat",lat);I.putExtra("lon",lon);I.putExtra("nombre",Dato);
        startActivity(I);
    }
}