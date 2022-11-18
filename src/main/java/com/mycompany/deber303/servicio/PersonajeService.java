/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber303.servicio;

import com.mycompany.deber303.modelo.Personaje;
import java.util.List;

/**
 *
 * @author LAB-2
 */
public interface PersonajeService {

    public abstract void crear(Personaje personaje);

    public abstract void modificar(int codigo, Personaje PersonajeModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Personaje> listar();

}
