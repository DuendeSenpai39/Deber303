/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber303.modelo;

/**
 *
 * @author LAB-2
 */
public class Personaje {
    private int codigo;
    private String nombre;
    private String papel;
    private int edad;
    private int puntuacionActor;
    private String peliculaActuada;

    public Personaje(int codigo, String nombre, String papel, int edad, int puntuacionActor, String peliculaActuada) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.papel = papel;
        this.edad = edad;
        this.puntuacionActor = puntuacionActor;
        this.peliculaActuada = peliculaActuada;
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

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPuntuacionActor() {
        return puntuacionActor;
    }

    public void setPuntuacionActor(int puntuacionActor) {
        this.puntuacionActor = puntuacionActor;
    }

    public String getPeliculaActuada() {
        return peliculaActuada;
    }

    public void setPeliculaActuada(String peliculaActuada) {
        this.peliculaActuada = peliculaActuada;
    }
  public String puntuacionActor(){
  var retorno =" Mal actor , mejorara.";
  if (this.puntuacionActor>7){
  retorno=" Buen actor";
  }
  return retorno;
  }

    @Override
    public String toString() {
        return "Personaje{" + "codigo=" + codigo + ", nombre=" + nombre + ", papel=" + papel + ", edad=" + edad + ", puntuacionActor=" + puntuacionActor + ", peliculaActuada=" + peliculaActuada + '}';
    }
}
