package com.example.inmobiliaria2.ui.propiedades;

public class Inmueble {
    private  int foto;
    private String direccion;
    private int ambientes;
    private String tipo;
    private String uso;
    private double precio;
    private boolean disponible;

    public Inmueble(int foto, String direccion,int ambientes,String tipo,String uso, double precio,boolean disponible) {
        this.foto = foto;
        this.direccion = direccion;
        this.ambientes= ambientes;
        this.tipo = tipo;
        this.uso = uso;
        this.precio = precio;
        this.disponible= disponible;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
