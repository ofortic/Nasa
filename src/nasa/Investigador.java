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
public class Investigador extends Empleado {
    private String departamento;
    private int codigo;
    private ArrayList<Proyecto> proyectos;

    public Investigador(String departamento, int codigo, String nombre, int id, Espacio espacio) {
        super(nombre, id, espacio);
        this.departamento = departamento;
        this.codigo = codigo;
    }
    
}
