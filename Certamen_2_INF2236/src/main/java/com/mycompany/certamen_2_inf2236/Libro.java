/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Libro {
    private int libroID;
    private String titulo;
    private String autor;
    private float precio;
    private ArrayList<Libro> listaLibros = new ArrayList<>();
    private Scanner Entrada = new Scanner(System.in);
    
    
    //Constructor

    public Libro() {
    }

    public Libro(int libroID, String titulo, String autor, float precio) {
        this.libroID = libroID;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

        
    //Gets y Sets

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public float getPrecio() {
        return precio;
    }

    public int getLibroID() {
        return libroID;
    }

    public Scanner getEntrada() {
        return Entrada;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void setLibroID(int libroID) {
        this.libroID = libroID;
    }

    public void setEntrada(Scanner Entrada) {
        this.Entrada = Entrada;
    }

    //Metodos
    
    public void crearDatos(){
        System.out.println("Ingrese el ID");
        this.libroID = Integer.parseInt(Entrada.nextLine());
        System.out.println("Ingrese el titulo");
        this.titulo = Entrada.nextLine();
        System.out.println("Ingrese el autor");
        this.autor = Entrada.nextLine();
        System.out.println("Ingrese el precio");
        this.precio = Float.parseFloat(Entrada.nextLine());
        
        this.listaLibros.add(this);
    }
    
    public void leerDatos(){
        System.out.println("Titulo" + this.titulo);
        System.out.println("Autor" + this.autor);
        System.out.println("Precio" + this.precio);
    }
    
    
}
