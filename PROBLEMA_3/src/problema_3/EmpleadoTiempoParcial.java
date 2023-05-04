/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_3;

/**
 *
 * @author carlo
 */
public class EmpleadoTiempoParcial extends Empleados{
    //SE DEFINEN LOS ATRIBUTOS
    private double pagoPorHora, horasTrabajadas;

    //SE CREA UN CONSTRUCTOR DEFAULT Y SE LE ASIGNAN VALORES Y 
    //SE UTLIZA SUPER PARA HEREDAR LOS ATRIBUTOS DEL CONSTRUCTOR DE LA CLASE PADRE
    public EmpleadoTiempoParcial() {
        super();
        this.pagoPorHora = 0.0;
        this.horasTrabajadas = 0.0;
    }

    //SE CREA UN CONSTRUCTOR CON PARAMETROS
    //SE UTLIZA SUPER PARA HEREDAR LOS ATRIBUTOS DEL CONSTRUCTOR DE LA CLASE PADRE
    public EmpleadoTiempoParcial(double pagoPorHora, double horasTrabajadas, String ID, String nombre, double salario) {
        super(ID, nombre, salario);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    //SE ESTABLECEN LOS METODOS GET Y SET
    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    //SE SOBREESCRIBE EL METODO CALCULAR SALARIO PARA QUE CALCULE EL SALARIO DEL EMPLEADO A TIEMPO PARCIAL
    //EN BASE A UN PAGO POR HORA Y A LAS HORAS TRABAJADAS
    @Override
    public double calcularSalario() {
        return getPagoPorHora()*getHorasTrabajadas();
    }
    
}
