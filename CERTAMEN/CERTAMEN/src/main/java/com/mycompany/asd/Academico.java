/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asd;

/**
 *
 * @author Estudiante
 */
public class Academico extends Libro{
    String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Academico(String descripcion) {
        this.descripcion = descripcion;
    }

    public Academico(String descripcion, int libroID, String titulo, String autor, float precio) {
        super(libroID, titulo, autor, precio);
        this.descripcion = descripcion;
    }

    public Academico() {
    }
    public void leerDatos()
    {
        System.out.println("Titulo " + this.getTitulo());
        System.out.println("Autor " + this.getAutor());
        System.out.println("Precio " + this.getPrecio());
        System.out.println("Descripcion " + this.descripcion);
    }
}
