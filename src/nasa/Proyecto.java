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
public class Proyecto {
    private ArrayList<Espacio> espacios;
    private ArrayList<Investigador> investigadores;
    private ArrayList<Equipo> equipos;

    public Proyecto(ArrayList<Espacio> espacios) {
        this.espacios = espacios;
        investigadores = new ArrayList();
        equipos = new ArrayList();
    }
    
}
