/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asd;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Libro {
    private int libroID;
    private String titulo;
    private String autor;
    private double precio;

    public Libro(int libroID, String titulo, String autor, double precio) {
        this.libroID = libroID;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public Libro() {
    }
    public Libro buscarLibro(ArrayList<Libro>lista, int codigo)
    {
        for(int i = 0; i<lista.size();i++)
        {
            if(lista.get(i).libroID == codigo)
            {
                lista.get(i).leerDatos();
                return lista.get(i);
            }
        }
       
        return null;
    }
        public void leerDatos()
    {
        System.out.println("ID "+this.libroID);
        System.out.println("Titulo " + this.titulo);
        System.out.println("Autor " + this.autor);
        System.out.println("Precio " + this.precio);

    }
}
