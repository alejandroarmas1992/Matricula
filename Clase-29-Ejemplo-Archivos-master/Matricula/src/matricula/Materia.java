/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricula;

import java.io.Serializable;

/**
 *
 * @author chalosalvador
 */
public class Materia implements Serializable{
    private String nombre;

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    Materia() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
