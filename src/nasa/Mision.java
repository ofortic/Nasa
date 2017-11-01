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
public class Mision {
    private ArrayList<Astronauta> astronautas;
    private Estacion estacion;

    public Mision(Estacion estacion) {
        this.estacion = estacion;
        astronautas = new ArrayList();
    }
    
}
