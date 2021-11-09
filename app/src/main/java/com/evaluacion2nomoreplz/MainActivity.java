package com.evaluacion2nomoreplz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    Button gogo;
    ArrayList<String> Lugares=new ArrayList<String>();
    Spinner ubicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lugares.add("Cementerio de parral");
        Lugares.add("Cementerio de Mascotas Santiago");
        Lugares.add("Cementerio General de talca");
        Spinner ubicacion= (Spinner) findViewById(R.id.Spin);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Lugares);
        ubicacion.setAdapter(adaptador);




    }
    public void Letsgo(View W){
        String ubi=ubicacion.getSelectedItem().toString();
        Intent I = new Intent(getApplicationContext(),Principal.class);
        I.putExtra("Lugar",ubi);
        startActivity(I);

    }



}