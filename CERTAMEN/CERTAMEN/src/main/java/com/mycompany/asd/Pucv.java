/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asd;

/**
 *
 * @author Estudiante
 */
public class Pucv extends Libro{
    String escuela;

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public Pucv(String escuela) {
        this.escuela = escuela;
    }

    public Pucv(String escuela,int libroID, String titulo, String autor, double precio) {
        super(libroID,titulo, autor, precio);
        this.escuela = escuela;
    }

    public Pucv() {
    }
    
    
    public void leerDatos()
    {
        System.out.println("Titulo " + this.getTitulo());
        System.out.println("Autor " + this.getAutor());
        System.out.println("Precio " + this.getPrecio());
        System.out.println("Escuela " + this.escuela);
    }
}
