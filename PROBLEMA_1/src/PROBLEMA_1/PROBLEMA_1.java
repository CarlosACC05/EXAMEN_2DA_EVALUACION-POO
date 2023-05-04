/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PROBLEMA_1;

/**
 *
 * @author carlo
 */
public class PROBLEMA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CREAMOS OBJETOS PARA UTILIZAR LAS 3 DIFERENTES FORMULAS
        Formula_1 dis1 = new Formula_1(20.0, 50.0, 15, 2.0);
        System.out.println("Distancia= "+ dis1.calcularDistancia());
        
        Formula_2 dis2 = new Formula_2(20.0, 50.0, 15, 2.0);
        System.out.println("Distancia= "+ dis2.calcularDistancia());
        
        Formula_3 dis3 = new Formula_3(20.0,50.0,15,2.0);
        System.out.println("Distancia= "+ dis3.calcularDistancia());
        
    }

}
