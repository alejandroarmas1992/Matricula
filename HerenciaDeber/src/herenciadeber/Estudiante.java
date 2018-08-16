/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciadeber;
import java.util.ArrayList;
/**
 *
 * @author USUARIO
 */
public class Estudiante extends Persona {
    int edad;
    ArrayList<Materia> materias;
    public Estudiante(String nombre, String apellido,int edad) {
        super(nombre, apellido);
        this.edad=edad;
        this.materias=new ArrayList();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    
}
