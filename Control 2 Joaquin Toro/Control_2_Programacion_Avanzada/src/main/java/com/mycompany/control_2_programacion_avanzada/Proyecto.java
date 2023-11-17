/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control_2_programacion_avanzada;

import java.util.Date;

/**
 *
 * @author Joaquin
 */
public class Proyecto{
    private String titulo;
    private String autor;
    private String tipo;
    private String profesorGuia;
    private Date fechaPubli = new Date();

    public Proyecto(String titulo, String autor, String tipo, String profesorGuia) {
        this.titulo = titulo;
        this.autor = autor;
        this.tipo = tipo;
        this.profesorGuia = profesorGuia;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getProfesorGuia() {
        return profesorGuia;
    }

    public Date getFechaPubli() {
        return fechaPubli;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setProfesorGuia(String profesorGuia) {
        this.profesorGuia = profesorGuia;
    }

    public void setFechaPubli(Date fechaPubli) {
        this.fechaPubli = fechaPubli;
    }
    
    
    
    
}
