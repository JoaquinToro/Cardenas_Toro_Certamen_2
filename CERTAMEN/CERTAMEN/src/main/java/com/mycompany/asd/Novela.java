/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asd;

/**
 *
 * @author Estudiante
 */
public class Novela extends Libro{
    String tipo;

    public Novela() {
    }

    public Novela(String tipo,int libroID, String titulo, String autor, double precio) {
        super(libroID,titulo, autor, precio);
        this.tipo = tipo;
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void leerDatos()
    {
        System.out.println("Titulo " + this.getTitulo());
        System.out.println("Autor " + this.getAutor());
        System.out.println("Precio " + this.getPrecio());
        System.out.println("Tipo " + this.tipo);
    }
}
