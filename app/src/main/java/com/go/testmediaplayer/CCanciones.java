package com.go.testmediaplayer;

public class CCanciones {

    private String nombre_autor;
    private String nombre_cancion;
    private int foto;
    private int audio;

    public CCanciones(String nombre_autor, String nombre_cancion, int foto, int audio) {
        this.nombre_autor = nombre_autor;
        this.nombre_cancion = nombre_cancion;
        this.foto = foto;
        this.audio = audio;
    }

    public String getNombre_autor() {
        return nombre_autor;
    }

    public void setNombre_autor(String nombre_autor) {
        this.nombre_autor = nombre_autor;
    }

    public String getNombre_cancion() {
        return nombre_cancion;
    }

    public void setNombre_cancion(String nombre_cancion) {
        this.nombre_cancion = nombre_cancion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getAudio() {
        return audio;
    }

    public void setAudio(int audio) {
        this.audio = audio;
    }
}
