/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class Madera {

    private int id;
    private String nombre;
    private String tipo;
    private String color;
    private double precio;
    private boolean disponible;

    public Madera() {
    }

    public Madera(int id, String nombre, String tipo,
            String color, double precio, boolean disponible) {

        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.precio = precio;
        this.disponible = disponible;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}