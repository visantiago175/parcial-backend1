package com.example.libro.libro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String título;
    private String referencia;
    private String autor;
    private int precio;
    private String ubicación;
    
    public Libro(String título, String referencia, String autor, int precio, String ubicación) {
        this.título = título;
        this.referencia = referencia;
        this.autor = autor;
        this.precio = precio;
        this.ubicación = ubicación;
    }

    public String getTítulo() {
        return título;
    }
    public void setTítulo(String título) {
        this.título = título;
    }
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getUbicación() {
        return ubicación;
    }
    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }

}
