/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber303.controlador;

import com.mycompany.deber303.modelo.Personaje;
import com.mycompany.deber303.servicio.PersonajeServiceImpl;
import java.util.List;

public class PersonajeControl {

    private final PersonajeServiceImpl personajeServiceImpl;

    public PersonajeControl() {
        this.personajeServiceImpl = new PersonajeServiceImpl();
    }

    public String crear(String[] data) {
        var retorno = "Nose sabe el actor";
        var codigo = Integer.valueOf(data[0]);
        var nombre = data[1];
        var papel = data[2];
        var edad = Integer.valueOf(data[3]);
        var puntuacionActor = Integer.valueOf(data[4]).intValue();
        var peliculaActuada = data[5];

        var personaje = new Personaje(codigo, nombre, papel, edad, puntuacionActor, peliculaActuada);
        this.personajeServiceImpl.crear(personaje);
        retorno = "\nActor: " + personaje.getNombre() + "\nPapel:" + personaje.getPapel() + "\n"
                + "Edad:" + personaje.getEdad() + "\nLapuntuacion del persona es :" + personaje.getPuntuacionActor()+ "\n"
                + "Otras peliculas: " + personaje.getPeliculaActuada();
        

    public String eliminar(String[] data) {
        var retorno = "No se elimino al personaje ";
        var nombrePersonaje = data[0];
        var x = true;
        for (var personajes : this.personajeServiceImpl.listar()) {
            if (personajes.getNombrePersonaje() == nombrePersonaje) {
                x = false;
            }
        }
        if (x) {
            retorno += ", no existe el personaje ";
        } else {
            this.personajeServiceImpl.eliminar(nombrePersonaje);
            retorno = "Se elimino Correctamente a " + nombrePersonaje;
        }
        return retorno;
    }

    public List<Personaje> listar() {
        return this.personajeServiceImpl.listar();

    }

    public String modificar(String[] data, PersonajeControl personajeControl) {
        var retorno = "No se modifico al personaje ";
        var nombrePersonaje = data[0];
        var nombrePersonajeModificado = personajeControl;
        var x = true;
        for (var personajes : this.personajeServiceImpl.listar()) {
            if (personajes.getNombrePersonaje() == nombrePersonaje) {
                x = false;
            }
        }
        if (x) {
            retorno += ", no existe el personaje ";
        } else {
            this.personajeServiceImpl.modificar(nombrePersonaje, nombrePersonajeModificado.listar().get(0));
            retorno = "Se elimino Correctamente a " + nombrePersonaje;
        }
        return retorno;

    }

}

