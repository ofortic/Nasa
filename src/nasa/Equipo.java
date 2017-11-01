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
public class Equipo {
    private Laboratorio laboratorio;
    private ArrayList<Proyecto> proyectos;

    public Equipo(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
        proyectos = new ArrayList();
    }
    
}
