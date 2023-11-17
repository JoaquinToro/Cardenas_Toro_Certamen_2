/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control_2_programacion_avanzada;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class Libro {
    //Atributos//
    private int libroID;
    private String titulo;
    private String autor;
    private String estado;
    private String[] listaEstados = new String[]{"0","Libre","Reservado","Prestamo"};
    
    private Scanner Entrada = new Scanner(System.in);
    
    //Constructores//
    public Libro() {
        this.libroID = 0;
        this.titulo = null;
        this.autor = null;
        this.estado = this.listaEstados[0];
    }

    public Libro(int libroID, String titulo, String autor, String estado) {
        this.libroID = libroID;
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
    }
    
    //Getters y Setters//

    public int getLibroID() {
        return libroID;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEstado() {
        return estado;
    }

    public String[] getListaEstados() {
        return listaEstados;
    }

    public void setLibroID(int libroID) {
        this.libroID = libroID;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setListaEstados(String[] listaEstados) {
        this.listaEstados = listaEstados;
    }
    
    //Crear y leer Datos
    public void crearDatosLibro(){
        System.out.println("Ingrese el ID");
        this.libroID = Integer.parseInt(Entrada.nextLine());
        System.out.println("Ingrese el titulo");
        this.titulo = Entrada.nextLine();
        System.out.println("Ingrese el estado [1-3]");
        this.estado = this.listaEstados[ValidarEstado()];


    }
    
    public void leerDatos(){
        System.out.println("ID = " + this.libroID);
        System.out.println("Titulo = " + this.titulo);
        System.out.println("Estado = " + this.estado);
    }
    
    public int ValidarEstado(){

        try{
            String cadena = Entrada.next();
        if(cadena.matches("[1-3]*"))
            return Integer.parseInt(cadena);
        else
           System.out.println("Dato no válido, introduzca un valor 1,2,3");
        }catch(NumberFormatException e){
           System.out.println("Este dato no es válido"); 
        }
        return 0;
    }
    
    
    
}
