/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber303.servicio;

import com.mycompany.deber303.modelo.Personaje;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAB-2
 */
public class PersonajeServiceImpl implements PersonajeService {

    private ArrayList<Personaje> personajeList;

    public PersonajeServiceImpl() {
        this.personajeList = new ArrayList<>();
    }

    @Override
    public void crear(Personaje personaje) {
        this.personajeList.add(personaje);
    }

    @Override
    public List<Personaje> listar() {
        return this.personajeList;
    }

    @Override
    public void modificar(String nombre, Personaje personaje) {
        var indice = 0;
        for (var personajes : this.personajeList) {
            if (personajes.getNombre() == nombre) {
                this.personajeList.set(indice, personaje);
                break;
            } else {
                indice++;

            }

        }
    }

    @Override
    public void eliminar(String nombre) {
        var indice = 0;
        for (var personajes : this.personajeList) {
            if (personajes.getNombre() == nombre) {
                this.personajeList.remove(indice);
                break;
            } else {
                indice++;

            }

        }
    }
}
