/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen_2;

/**
 *
 * @author Estudiante
 */
public class TextoPucv extends Libro{
    
    private String escuela;

    //Constructor
    
    public TextoPucv(String escuela) {
        this.escuela = escuela;
    }

    public TextoPucv(String escuela, int libroID, String titulo, String autor, float precio) {
        super(libroID, titulo, autor, precio);
        this.escuela = escuela;
    }

    public TextoPucv() {
    }
    
    //Gets y Sets

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    
    //Metodos
    public void leerDatos(){
        System.out.println("Titulo" + this.getTitulo());
        System.out.println("Autor" + this.getAutor());
        System.out.println("Precio" + this.getPrecio());
        System.out.println("Escuela = " +this.escuela);
    }
}
