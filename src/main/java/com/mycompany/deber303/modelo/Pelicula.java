/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber303.modelo;

import java.time.LocalDate;

/**
 *
 * @author LAB-2
 */
public class Pelicula {
    private int codigo;
    private String nombre;
    private String director;
    private LocalDate yearEstreno;
    private double recaudacion;
    private String porcentajeAceptacion;

    public Pelicula(int codigo, String nombre, String director, LocalDate yearEstreno, double recaudacion, String porcentajeAceptacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.director = director;
        this.yearEstreno = yearEstreno;
        this.recaudacion = recaudacion;
        this.porcentajeAceptacion = porcentajeAceptacion;
        
    }
public int yearPublicacion(){
    var yearActual = LocalDate.now().getYear();
        var retorno = yearActual - this.yearEstreno.getYear();
        var mesActual = LocalDate.now().getMonthValue();
        var diaActual = LocalDate.now().getDayOfMonth();
        var a = mesActual - this.yearEstreno.getMonthValue();
        var b = diaActual - this.yearEstreno.getDayOfMonth();
        if (a < 0) {
            retorno -= 1;

        }
        if (a == 0) {
            if (b < 0) {
                retorno -= 1;
            }

        }

        return retorno;

    
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getYearEstreno() {
        return yearEstreno;
    }

    public void setYearEstreno(LocalDate yearEstreno) {
        this.yearEstreno = yearEstreno;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

    public String getPorcentajeAceptacion() {
        return porcentajeAceptacion;
    }

    public void setPorcentajeAceptacion(String porcentajeAceptacion) {
        this.porcentajeAceptacion = porcentajeAceptacion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "codigo=" + codigo + ", nombre=" + nombre + ", director=" + director + ", yearEstreno=" + yearEstreno + ", recaudacion=" + recaudacion + ", porcentajeAceptacion=" + porcentajeAceptacion + '}';
    }
}
