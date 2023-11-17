/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen_2;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Novela extends Libro{
    
    String[]tiposNovela = {"TBD","Historica", "Romantica", "Policiaca",
                            "Realista","Ciencia Ficción", "Aventuras"};
    
    String tipo;
    Scanner Entrada = new Scanner(System.in);
    

    //Constructor

    public Novela() {
    }

    public Novela(String tipo) {
        this.tipo = tipo;
    }

    public Novela(String tipo, int libroID, String titulo, String autor, float precio) {
        super(libroID, titulo, autor, precio);
        this.tipo = tipo;
    }
    
    
    
    //Gets y Sets
    public String[] getTiposNovela() {
        return tiposNovela;
    }

    public String getTipo() {
        return tipo;
    }

    public Scanner getEntrada() {
        return Entrada;
    }

    public void setTiposNovela(String[] tiposNovela) {
        this.tiposNovela = tiposNovela;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setEntrada(Scanner Entrada) {
        this.Entrada = Entrada;
    }
    
    //Metodos
    public void crearDatos(){
        this.crearDatosLibro();
        System.out.println("Ingrese un numero [0-6] si la novela es"
                + " a determinar, historica, romantica, policiaca, realista"
                + " ciencia ficcion, aventuras");
        this.tipo = this.tiposNovela[Integer.parseInt(Entrada.nextLine())];
    }
    
    @Override
    public void leerDatos(){
        System.out.println("Titulo" + this.getTitulo());
        System.out.println("Autor" + this.getAutor());
        System.out.println("Precio" + this.getPrecio());
        System.out.println("Novela tipo = " +this.tipo);
    }
    
    
}
