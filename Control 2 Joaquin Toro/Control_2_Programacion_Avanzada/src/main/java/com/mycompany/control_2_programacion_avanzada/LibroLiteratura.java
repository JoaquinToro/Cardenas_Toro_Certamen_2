/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control_2_programacion_avanzada;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class LibroLiteratura extends Libro{
    private String[]listaTipos = {"0","histórica", "romántica",
                                "policíaca", "realista", "ciencia", "ficción"};
    private String tipo;
    private String descripcion;
    private ArrayList<LibroLiteratura> listaLibrosLiteratura = new ArrayList<>();
    Scanner Entrada = new Scanner(System.in);

    public LibroLiteratura() {
        super(0, null, null, null);
    }


    public LibroLiteratura(String tipo, String descripcion, int libroID, String titulo, String autor, String estado) {
        super(libroID, titulo, autor, estado);
        this.tipo = tipo;
        this.descripcion = descripcion;
    }
    
    public String[] getListaTipos() {
        return listaTipos;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setListaTipos(String[] listaTipos) {
        this.listaTipos = listaTipos;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setListaLibrosLiteratura(ArrayList<LibroLiteratura> listaLibrosLiteratura) {
        this.listaLibrosLiteratura = listaLibrosLiteratura;
    }
    
    //Crear y leer Datos
    public void crearDatos(){
        this.crearDatosLibro();
        System.out.println("Ingrese el tipo de libro [1-6]");
        this.tipo = this.listaTipos[ValidarTipo()];
        System.out.println("Ingrese la descrpicion");
        this.descripcion = Entrada.nextLine();
        
        this.listaLibrosLiteratura.add(new LibroLiteratura(this.getTipo(),this.descripcion,this.getLibroID(),this.getTitulo(),
                                                            this.getAutor(),this.getEstado()));
    }
    
    public void leerDatos(){
        System.out.println(this.getLibroID());
        System.out.println(this.getTitulo());
        System.out.println(this.getAutor());
        System.out.println(this.descripcion);
        System.out.println(this.tipo);
        System.out.println(this.getEstado());
    }
    
    public int ValidarTipo(){

        try{
            String cadena = Entrada.next();
        if(cadena.matches("[1-6]*"))
            return Integer.parseInt(cadena);
        else
           System.out.println("Dato no válido, introduzca un valor [1-6]");
        }catch(NumberFormatException e){
           System.out.println("Este dato no es válido"); 
        }
        return 0;
    }
}
