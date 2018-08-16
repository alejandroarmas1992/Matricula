/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciadeber;

/**
 *
 * @author USUARIO
 */
public class Profesor extends Persona {
    String facultad;
    String materia;
    public Profesor(String nombre, String apellido,String facultad,String materia) {
        super(nombre, apellido);
        this.facultad=facultad;
        this.materia=materia;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    
}
