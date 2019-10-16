package com.go.testmediaplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MiAdaptador extends BaseAdapter {
    ArrayList<CCanciones> array_list;
    Context context;

    public MiAdaptador(ArrayList<CCanciones> array_list, Context context) {
        this.array_list = array_list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return array_list.size();
    }

    @Override
    public Object getItem(int position) {
        return array_list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        CCanciones personaje = array_list.get(position);
         if (view == null) {
             LayoutInflater layoutInflater = LayoutInflater.from(context);
             view = layoutInflater.inflate(R.layout.mi_adaptador, null);

             TextView tv_nombre_autor = view.findViewById(R.id.textView_nombre_autor);
             TextView tv_nombre_cancion = view.findViewById(R.id.textView_nombre_cancion);
             ImageView iv_foto = view.findViewById(R.id.imageView_foto);

             tv_nombre_autor.setText(personaje.getNombre_autor());
             tv_nombre_cancion.setText(personaje.getNombre_cancion());
             iv_foto.setImageResource(personaje.getFoto());

         }
        return view;
    }
}
