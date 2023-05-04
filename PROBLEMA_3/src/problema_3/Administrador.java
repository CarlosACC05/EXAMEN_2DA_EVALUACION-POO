/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_3;

/**
 *
 * @author carlo
 */
public class Administrador extends EmpleadoTiempoCompleto implements ElegibleParaBono {
    //SE DEFINE UN NUEVO ATRIBUTO
    private double porcentajeDelBono;

    public Administrador() {
        super();
        this.porcentajeDelBono = 0.0;
    }

   
    public Administrador(String ID, String nombre, double salario, double porcentajeDelBono) {
        super(ID,nombre,salario);
        this.porcentajeDelBono = porcentajeDelBono;
    }
    
    public double getPorcentajeDelBono() {
        return porcentajeDelBono;
    }

    public void setPorcentajeDelBono(double porcentajeDelBono) {
        this.porcentajeDelBono = porcentajeDelBono;
    }

    //SE SOBREESCRIBE EL CALCULAR BONO CALCULANDOLO EN BASE AL PORCENTAJE Y EL SALARIO ESTABLECIDO
    @Override
    public double calcularBono() {
        return (this.porcentajeDelBono/100)*super.getSalario();
    }
    
    @Override
    public double calcularSalario(){
    
        return super.getSalario() + calcularBono();
    
    }

    
    
}
