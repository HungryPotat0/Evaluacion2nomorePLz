package com.evaluacion2nomoreplz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Principal extends AppCompatActivity {
    double lat,lon;
    String Dato;
    ImageButton primera,segunda,tercera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        ImageButton primera=(ImageButton)findViewById(R.id.imagen1);
        ImageButton segunda=(ImageButton)findViewById(R.id.imagen2);
        ImageButton tercera=(ImageButton)findViewById(R.id.toMaps);


        Bundle B = getIntent().getExtras();
        String Dato=B.getString("nombre");
        lat = B.getDouble("lat");
        lon = B.getDouble("lon");
        if (Dato.equals("Cementerio de parral")){
            double lat=-36.124123177155205;
            double lon=-71.82145176890415;

        }
        if (Dato.equals("Cementerio General de talca")){

            double lat=-35.40925616074629;
            double lon=-71.6654807488356;
            primera.setImageResource(R.mipmap.T1);
            segunda.setImageResource(R.mipmap.T2);
            tercera.setImageResource(R.mipmap.T3);
        }
        if (Dato.equals("Cementerio de Mascotas Santiago")){

            double lat=-33.37946232056345;
            double lon=-70.73920633992135;
            primera.setImageResource(R.mipmap.S1);
            segunda.setImageResource(R.mipmap.S2);

        }

    }
    public void iramapas(View W)
    {
        Intent I = new Intent(getApplicationContext(),MapaListoko.class);
        I.putExtra("lat",lat);I.putExtra("lon",lon);I.putExtra("nombre",Dato);
        startActivity(I);
    }

    public void volver(View W){
        Intent I = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(I);

    }
}