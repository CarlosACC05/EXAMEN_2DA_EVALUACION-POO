/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_3;

/**
 *
 * @author carlo
 */
public abstract class Empleados {

    //SE DEFINEN LOS ATRIBUTOS
    private String ID;
    private String nombre;
    private double salario;

    //SE CREA UN CONSTRUCTOR DEFAULT Y SE LE ASIGNAN VALORES
    public Empleados() {
        this.ID = "--";
        this.nombre = "--";
        this.salario = 0.0;
    }

    //SE CREA UN CONSTRUCTOR CON PARAMETROS
    public Empleados(String ID, String nombre, double salario) {
        this.ID = ID;
        this.nombre = nombre;
        this.salario = salario;
    }
    
    //SE ESTABLECEN LOS METODOS GET Y SET
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //SE CREA UN METODO ABSTRACTO PARA CALCULAR SALARIO
    public abstract double calcularSalario();
    
    //SE SOBREESCRIBE EL TOSTRING PARA QUE AL LLAMARLO IMPRIMA LOS DATOS
   @Override
   public String toString(){
   String datos = "ID: "+
           ID+"\nNombre: "+
           nombre + "\nSalario: "+
           calcularSalario();
   
   return datos;
   }
}
