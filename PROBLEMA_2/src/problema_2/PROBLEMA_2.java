/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_2;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class PROBLEMA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //PREGUNTAMOS POR EL TIPO DE EMPLEADO PARA ESO USAMOS UN SWITCH
        System.out.println("Que tipo de empleado eres: Manufactura(M), Apoyo(A), Jefe(J)");
        String tipodeempleado = input.nextLine();
        switch (tipodeempleado) {
            case "M":
                Manufactura manu = new Manufactura("Miguel", "Caballero", 18, 40);
                Manufactura.printSalary(manu);
                break;
            case "A":
                Apoyo apo = new Apoyo("Erick", "Martinez", 18, 50);
                Apoyo.printSalary(apo);
                break;
            case "J":
                Jefe chief = new Jefe("Carlos", "Carrillo", 18, 5000);
                Jefe.printSalary(chief);
                break;

        }
        
    }

}
