/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROBLEMA_1;

/**
 *
 * @author carlo
 */
public class Formula_3 extends Movimiento {

    //SE HEREDAN LOS CONSTRUCTORES DE LA CLASE PADRE
    public Formula_3() {
        super(1, 1, 1, 1);
    }

    public Formula_3(double veli, double velf, double aceleration, double time) {
        super(veli, velf, aceleration, time);
    }

    //SOBREESCRIBIMOS EL METODO CALCULAR DISTANCIA EN BASE A LA FORMULA 3
    //ENCONTRAMOS UN ERROR EN LA FORMULA Y LA CORREGIMOS, ELEVAMOS AL CUADRADO AMBAS VELOCIDADES
    @Override
    public double calcularDistancia() {

        return (Math.pow(getVelf(), 2) - Math.pow(getVeli(), 2)) / (getAceleration() * 2);

    }
}
