/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROBLEMA_1;

/**
 *
 * @author carlo
 */
public class Formula_2 extends Movimiento{

    //SE HEREDAN LOS CONSTRUCTORES DE LA CLASE PADRE
    public Formula_2() {
        super(1,1,1,1);
    }
     
    public Formula_2(double veli, double velf, double aceleration, double time) {
        super(veli, velf, aceleration, time);
    }
   
    //SOBREESCRIBIMOS EL METODO CALCULAR DISTANCIA EN BASE A LA FORMULA 2
    @Override
    public double calcularDistancia() {
        
     return ((getVeli()+getVelf())/2)*getTime();

           
    }
    
}
