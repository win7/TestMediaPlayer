package com.go.testmediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DetallesActivity extends AppCompatActivity {

    ImageView iv_foto;
    TextView tv_nombre, tv_cancion;
    ImageButton ib_start, ib_pause;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        iv_foto = findViewById(R.id.imageView_foto);
        tv_nombre = findViewById(R.id.textView_nombre_autor);
        tv_cancion = findViewById(R.id.textView_nombre_cancion);

        ib_start = findViewById(R.id.imageButton_start);
        ib_pause = findViewById(R.id.imageButton_pause);

        Intent intent = getIntent();
        int posicion  = intent.getIntExtra("posicion", 0);

        CCanciones c = MainActivity.array_list.get(posicion);

        iv_foto.setImageResource(c.getFoto());
        tv_nombre.setText(c.getNombre_autor());
        tv_cancion.setText(c.getNombre_cancion());

        mediaPlayer = MediaPlayer.create(this, c.getAudio());

        ib_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });

        ib_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Gooo", "onDestroy");
        mediaPlayer.stop();
    }
}
