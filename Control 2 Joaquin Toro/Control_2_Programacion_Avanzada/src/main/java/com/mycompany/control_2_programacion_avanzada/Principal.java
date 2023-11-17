/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.control_2_programacion_avanzada;

import java.text.ParseException;

/**
 *
 * @author Joaquin
 */
public class Principal {

    public static void main(String[] args) throws ParseException {
        LibroAcademico libroA = new LibroAcademico();
        LibroLiteratura libroL = new LibroLiteratura();
        
        menu(libroA,libroL);
    }
    public static void menu(LibroAcademico libroA, LibroLiteratura libroL) throws ParseException{
        
        libroA.crearDatos();
        libroA.leerDatos();
        
        libroL.crearDatos();
        libroL.leerDatos();
    }
}
