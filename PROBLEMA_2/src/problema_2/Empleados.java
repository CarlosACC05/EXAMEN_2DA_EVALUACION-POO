/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_2;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public abstract class Empleados implements Capturando {

    private String name;
    private String lastname;
    private int age;
    private double basesalary;

    //SE CREAN LOS CONTRUCTORES
    public Empleados() {
        this.name = "";
        this.lastname = "";
        this.age = 1;
        this.basesalary = 1;
    }

    public Empleados(String name, String lastname, int age, Double basesalary) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.basesalary = basesalary;
    }
    
    //CREAMOS UN METODO ABSTRACTO PARA CALCULAR EL SALARIO
    public abstract double calculoSalary(int horas, int horasNecesarias);
    //CREAMOS EL METODO ABSTRACTO LLAMADO PRINTSALARY, EL CUAL RECIBE COMO PARAMETRO UN OBJETO DE LA CLASE EMPLEADO
    public static void printSalary(Empleados datos){
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce las horas trabajadas");
        int a = input.nextInt();
        System.out.println("Introduce las horas necesarias");
        int b = input.nextInt();
        System.out.println("Nombre: "+datos.name +"\nApellido: "+ datos.lastname+"\nEdad: "+datos.age+"\nSalario: "+datos.calculoSalary(a,b));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    @Override
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public double getBasesalary() {
        return basesalary;
    }

    @Override
    public void setBasesalary(double basesalary) {
        this.basesalary = basesalary;
    }

}
