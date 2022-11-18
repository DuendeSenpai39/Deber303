/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber303.controlador;

import com.mycompany.deber303.modelo.Pelicula;
import com.mycompany.deber303.servicio.PeliculaServiceImpl;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author LAB-2
 */
public class PeliculaControl {

    private final PeliculaServiceImpl peliculaServiceImpl;

    public PeliculaControl() {
        this.peliculaServiceImpl = new PeliculaServiceImpl();
    }

    public String crear(String[] data) {
        var retorno = "Nose sabe la pelicula";
        var codigo = Integer.valueOf(data[0]);
        var nombre = data[1];
        var director = data[2];
        var year = Integer.valueOf(data[3]).intValue();
        var mes = Integer.valueOf(data[4]).intValue();
        var dia = Integer.valueOf(data[5]).intValue();
        var recaudacion = Double.valueOf(data[6]);
        var porcentajeAceptacion = data[7];

        if (year < 1896 || dia > 31 || dia < 0 || mes > 12 || mes < 0) {
            retorno = ",la fecha establecida esta incorrecta";

        } else {

            var pelicula1 = new Pelicula(codigo, nombre, director, LocalDate.of(year, mes, dia), recaudacion, porcentajeAceptacion);
            this.peliculaServiceImpl.crear(pelicula1);
            for (var personajes : args) {
                this.peliculaServiceImpl.listar().get(0).Agregar(personajes.listar().get(0));

            }

            retorno = "Pelicula: " + pelicula1.getNombre() + "\nDirector: " + pelicula1.getDirector() + "\n"
                    + "Porcentaje de Aceptacion: " + pelicula1.getPorcentajeAceptacion() + "\n"
                    + "Recaudacion de: " + pelicula1.getRecaudacion() + " miles de millones de dolares \n"
                    + "Pelicula de: " + pelicula1.getYearEstreno();
            return retorno;
        }
    

    public String eliminar(String[] data) {
        var retorno = "No se elimino al personaje ";
        var nombrePelicula = data[0];
        var s = false;
        for (var peliculas : this.peliculaServiceImpl.listar()) {
            if (peliculas.getNombre() == nombrePelicula) {
                s = true;
            }
        }
        if (s) {
            retorno += ", no existe la pelicula ";
        } else {
            this.peliculaServiceImpl.eliminar(nombrePelicula);
            retorno = "Se elimino Correctamente a " + nombrePelicula;
        }
        return retorno;
    }

    public List<Pelicula> listar() {
        return this.peliculaServiceImpl.listar();

    }

    public String modificar(String[] data, PeliculaControl peliculaControl) {
        var retorno = "No se modifico correctamente ";
        var nombre = data[0];
        var nombrePersonajeModificado = peliculaControl;
        var x = true;
        for (var peliculas : this.peliculaServiceImpl.listar()) {
            if (peliculas.getNombre() == nombre) {
                x = false;
            }
        }
        if (x) {
            retorno += ", no existe el personaje ";
        } else {
            this.peliculaServiceImpl.modificar(nombre, nombrePersonajeModificado.listar().get(0));
            retorno = "Se elimino Correctamente a " + nombre;
        }
        return retorno;

    }
}
