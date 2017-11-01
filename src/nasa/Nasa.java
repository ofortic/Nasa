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
public class Nasa {

    private ArrayList<Mision> misiones;
    private ArrayList<Equipo> equipos;
    private ArrayList<Empleado> empleados;
    private ArrayList<Proyecto> proyectos;
    private ArrayList<Espacio> espacios;

    public Nasa() {
        misiones = new ArrayList();
        equipos = new ArrayList();
        empleados = new ArrayList();
        proyectos = new ArrayList();
        espacios = new ArrayList();
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
