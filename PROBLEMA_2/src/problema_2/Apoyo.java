/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_2;

/**
 *
 * @author carlo
 */
public class Apoyo extends Empleados {

    //SE LE ASIGNA AL CONTRUCTOR DEFAULT VALORES PARA CADA TIPO DE EMPLEADO
    public Apoyo() {
        super("---", "---", 0, 50.0);

    }

    public Apoyo(String name, String lastname, int age, double basesalary) {
        super(name, lastname, age, basesalary);
    }

    @Override
    public double calculoSalary(int horas, int horasNecesarias) {
        //SI NO CUMPLE CON EL MINIMO DE HORAS, NO SE LE PAGA

        if (horas >= horasNecesarias) {
            double salaryFinal = getBasesalary() * horas;
            salaryFinal = salaryFinal * 1.5;
            return salaryFinal;
        }
        return 0;
    }

}
