package com.tienda.tienda_barrio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private double precio;

    private int cantidad;

    // Getter del ID
    public Long getId() {
        return id;
    }

    // Setter del ID
    public void setId(Long id) {
        this.id = id;
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Setter del nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter del precio
    public double getPrecio() {
        return precio;
    }

    // Setter del precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Getter de cantidad
    public int getCantidad() {
        return cantidad;
    }

    // Setter de cantidad
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}