/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos que desea ingresar");
        int i=scan.nextInt();
        int arregloNum[]=new int[i];
        try{
            
        for(int j=0;j<arregloNum.length;j++){
            System.out.println("Ingreso el elemento los elementos");
            int ingreso=scan.nextInt();
            arregloNum[j]=ingreso;}
        
        }
        catch(InputMismatchException e){
            System.out.println("Se esperaba un numero");
        }
        finally{
            System.out.println("Despues de llenar el arreglo");
        }
        
        System.out.println("Ingrese el indice del arreglo que desea ver");
        try{int n=scan.nextInt();
        System.out.println(arregloNum[n]);
        }
        catch(InputMismatchException e){
            System.out.println("Se esperaba un numero");
        }
        finally{
            System.out.println("Fin del ejercicio");
        }
           
        }
        
        
    }
    

