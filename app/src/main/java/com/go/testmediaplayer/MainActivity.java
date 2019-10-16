package com.go.testmediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv_canciones;

    public static ArrayList<CCanciones> array_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_canciones = findViewById(R.id.listView_canciones);

        array_list = new ArrayList<CCanciones>();
        CCanciones c1 = new CCanciones("Alan Walker", "Alone", R.drawable.alan_walker, R.raw.alan_walker_alone);
        array_list.add(c1);
        CCanciones c2 = new CCanciones("Alan Walker", "Faded", R.drawable.alan_walker, R.raw.alan_walker_faded);
        array_list.add(c2);
        CCanciones c3 = new CCanciones("Alesso", "We could be", R.drawable.alesso, R.raw.alesso_we_could_be);
        array_list.add(c3);
        CCanciones c4 = new CCanciones("David Guetta", "Akon", R.drawable.david_guetta, R.raw.david_akon);
        array_list.add(c4);


        MiAdaptador adaptador = new MiAdaptador(array_list, this);
        lv_canciones.setAdapter(adaptador);

        lv_canciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getApplicationContext(), DetallesActivity.class);
                intent.putExtra("posicion", position);
                startActivity(intent);
            }
        });
    }
}
