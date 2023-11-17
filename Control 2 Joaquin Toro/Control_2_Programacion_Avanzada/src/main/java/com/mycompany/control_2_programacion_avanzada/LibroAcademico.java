/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control_2_programacion_avanzada;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class LibroAcademico extends Libro{
    
    private String[]listaTipos = {"0","matemáticas","psicología", "programación",
                                  "inteligencia artificial", "mecánica", "construcción"};
    private String tipo;
    private SimpleDateFormat formato= new SimpleDateFormat("dd-MM-yyyy");
    private Date fechaPublicacion = new Date();
    private ArrayList<LibroAcademico> listaLibrosAcademicos = new ArrayList<>();
    private Scanner Entrada = new Scanner(System.in);
   
    //Constructores

    public LibroAcademico() {
        super(0, null, null, null);
        this.tipo = this.listaTipos[0];
    }
    
    public LibroAcademico(String tipo, int libroID, String titulo, String autor, String estado, Date fecha) {
        super(libroID, titulo, autor, estado);
        this.tipo = tipo;
        this.fechaPublicacion = fecha;
    }
    
    //Getter y Setters

    public String[] getListaTipos() {
        return listaTipos;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public ArrayList<LibroAcademico> getListaLibrosAcademicos() {
        return listaLibrosAcademicos;
    }

    public void setListaTipos(String[] listaTipos) {
        this.listaTipos = listaTipos;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setListaLibrosAcademicos(ArrayList<LibroAcademico> listaLibrosAcademicos) {
        this.listaLibrosAcademicos = listaLibrosAcademicos;
    }
    
    //Crear y leer Datos
    
    public void crearDatos() throws ParseException{
        this.crearDatosLibro();
        System.out.println("Ingrese el tipo de libro [1-6]");
        this.tipo = this.listaTipos[ValidarTipo()];
        System.out.println("Ingrese la fecha de publicacion en formato dd/MM/yyyy");
        this.fechaPublicacion = formato.parse(Entrada.nextLine());
        
        this.listaLibrosAcademicos.add(new LibroAcademico(this.getTipo(),this.getLibroID(),this.getTitulo(),
                                    this.getAutor(),this.getEstado(),this.fechaPublicacion));
        
    }
    
    public void leerDatos(){
        System.out.println(this.getLibroID());
        System.out.println(this.getTitulo());
        System.out.println(this.getAutor());
        System.out.println(this.fechaPublicacion);
        System.out.println(this.tipo);
        System.out.println(this.getEstado());
    }
    
    public int ValidarTipo(){

        try{
            String cadena = Entrada.next();
        if(cadena.matches("[1-6]*"))
            return Integer.parseInt(cadena);
        else
           System.out.println("Dato no válido, introduzca un valor 1,2,3");
        }catch(NumberFormatException e){
           System.out.println("Este dato no es válido"); 
        }
        return 0;
    }
    
    
}
