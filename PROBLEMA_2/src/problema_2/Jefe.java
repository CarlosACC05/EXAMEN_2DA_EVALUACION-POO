/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_2;

/**
 *
 * @author carlo
 */
public class Jefe extends Empleados{

    //SE LE ASIGNA AL CONTRUCTOR DEFAULT VALORES PARA CADA TIPO DE EMPLEADO
    public Jefe() {
        super("Erick","Martinez",0,5000.0);

    }

    public Jefe(String name, String lastname, int age, double basesalary) {
        super(name, lastname, age, basesalary);
    }

    @Override
    public double calculoSalary(int horas, int horasNecesarias){
        double salaryFinal = getBasesalary();
        return salaryFinal;
    }

    
    
}
