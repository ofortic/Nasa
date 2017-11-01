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
public abstract class Espacio {
    protected String nombre;
    protected String direccion;
    protected ArrayList<Empleado> empleados;
    protected ArrayList<Proyecto> proyectos;

    public Espacio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        empleados = new ArrayList();
        proyectos = new ArrayList();
    }
    
}
