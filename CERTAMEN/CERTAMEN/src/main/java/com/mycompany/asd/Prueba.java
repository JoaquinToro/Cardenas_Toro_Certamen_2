/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.asd;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Prueba {

    public static void main(String[] args) {
        ArrayList<Libro>biblioteca = new ArrayList();
        
        biblioteca.add(new Academico("cool",1,"Hablando con Joaquin","Agustin Cardenas", (float) 3.99));
        biblioteca.add(new Pucv("Ingenieria",2,"Fisicas locas","Joaquin Toro", (float) 4.99));
        biblioteca.add(new Novela("fantasia",3,"Fisicas locas","Joaquin Toro", (float) 4.99));
        if(biblioteca.get(0).buscarLibro(biblioteca, 3) != null){
            System.out.println("ENCONTRADO");
        }
        else{
            System.out.println("NO ENCONTRADO");
        }
        

    }
}
