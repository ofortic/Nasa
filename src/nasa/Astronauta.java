/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nasa;

import java.util.ArrayList;

/**
 *
 * @author Guest
 */
public class Astronauta extends Empleado{
    private String rango;
    private ArrayList<Mision> misiones;

    public Astronauta(String rango, String nombre, int id, Espacio espacio) {
        super(nombre, id, espacio);
        this.rango = rango;
        misiones = new ArrayList();
    }
    
}
