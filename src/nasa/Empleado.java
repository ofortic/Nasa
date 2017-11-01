/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nasa;

/**
 *
 * @author Guest
 */
public class Empleado {
    protected String nombre;
    protected int id;
    protected Espacio espacio;

    public Empleado(String nombre, int id, Espacio espacio) {
        this.nombre = nombre;
        this.id = id;
        this.espacio = espacio;
    }

}
