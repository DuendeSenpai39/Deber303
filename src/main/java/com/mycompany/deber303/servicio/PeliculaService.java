/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber303.servicio;

import com.mycompany.deber303.modelo.Pelicula;
import java.util.List;

/**
 *
 * @author LAB-2
 */
public interface PeliculaService {
    public abstract void crear(Pelicula pelicula);
    public abstract void modificar(int codigo, Pelicula PeliculaModificado);
    public abstract void eliminar(int codigo);
    public abstract List<Pelicula> listar();
    
}
