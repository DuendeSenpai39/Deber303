/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.deber303.vista;

import com.mycompany.deber303.controlador.PeliculaControl;
import com.mycompany.deber303.controlador.PersonajeControl;

/**
 *
 * @author LAB-2
 */
public class Deber303 {

    public static void main(String[] args) {

        var peliculaControl = new PeliculaControl();
        var datitos = new String[6];
        datitos[0] = "1";
        datitos[1] = "Titanic";
        datitos[2] = "James Cameron";
        datitos[3] = "1997";
        datitos[4] = "2.202";
        datitos[5] = "94";

        var peliculaControl2 = new PeliculaControl();
        var dat = new String[6];
        dat[0] = "2";
        dat[1] = "Avatar";
        dat[2] = "James Cameron";
        dat[3] = "2008";
        dat[4] = "2.202";
        dat[5] = "99";

        System.out.println("-------------------------------------------------");

        var personajeControl = new PersonajeControl();
        var datito = new String[6];
        datito[0] = "3";
        datito[1] = "Leonardo Dicaprio";
        datito[2] = "Jack Dawson";
        datito[3] = "48";
        datito[4] = "8";
        datito[5] = "El renacido";

        var personajeControl2 = new PersonajeControl();
        var datito2 = new String[6];
        datito2[0] = "4";
        datito2[1] = "Tommy Maguaire";
        datito2[2] = "Spiderman";
        datito2[3] = "52";
        datito2[4] = "10";
        datito2[5] = "Amigos fieles";

        System.out.print(peliculaControl.crear(datitos));
        System.out.print(personajeControl.crear(datito));
        System.out.print(peliculaControl.crear(dat));
        System.out.print(personajeControl.crear(datito2));

    }
}
