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
public class Ejercicio2 {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Ingrese los numeros a dividir");
    
    try{
        int i=scan.nextInt();
        int j=scan.nextInt();
        int n=i/j;
        System.out.println(n);}
    catch(InputMismatchException e){
        System.out.println("Se esperaba un numero"+e.getMessage());
    }
    catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }
    finally{
        System.out.println("Fin del programa");
    }
}
}