/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_3;

/**
 *
 * @author carlo
 */
public class PROBLEMA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //SE CREAN OBJETOS DE LOS DISTINTOS EMPLEADOS Y SE LLAMA A LA INFORMACION MEDIANTE UN TOSTRING
        Administrador em1 = new Administrador("22550332", "Carlos Carrillo", 100000.0, 40);
        System.out.println("Datos:\n" +em1);
        
        System.out.println("---------------------------------------------------------------------------------------");
        
        EmpleadoTiempoCompleto em2 = new EmpleadoTiempoCompleto("22550311","Erick Martinez",1000);
        System.out.println("Datos:\n" +em2);
        
        System.out.println("---------------------------------------------------------------------------------------");

        EmpleadoTiempoParcial em3 = new EmpleadoTiempoParcial(100.0,4,"22550358","Miguel Caballero",0.0);
        System.out.println("Datos:\n" +em3);
    }
    
}
