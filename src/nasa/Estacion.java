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
public class Estacion extends Espacio {
    private int personal;
    private ArrayList<Mision> misiones;

    public Estacion(int personal, String nombre, String direccion) {
        super(nombre, direccion);
        this.personal = personal;
        misiones = new ArrayList();
    }
    
}
