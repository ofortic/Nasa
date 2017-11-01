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
public class Laboratorio extends Espacio {
    private ArrayList<Equipo> equipos;
    
    public Laboratorio(String nombre, String direccion) {
        super(nombre, direccion);
        equipos = new ArrayList();
    }
    
}
