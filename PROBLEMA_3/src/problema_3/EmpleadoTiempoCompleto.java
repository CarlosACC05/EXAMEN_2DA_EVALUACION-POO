/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_3;

/**
 *
 * @author carlo
 */
public class EmpleadoTiempoCompleto extends Empleados{

    public EmpleadoTiempoCompleto() {
        super("---","---",0.0);
    }
     public EmpleadoTiempoCompleto(String ID, String nombre, double salario) {
        super(ID,nombre,salario);
    }

    //SE SOBREESCRIBE EL METODO CALCULARSALARIO PARA ASIGNAR UN SALARIO FIJO AL EMPLEADO A TIEMPO COMPLETO
    @Override
    public double calcularSalario() {
        double salariofijo= getSalario();
        return salariofijo;
    }
     
}
