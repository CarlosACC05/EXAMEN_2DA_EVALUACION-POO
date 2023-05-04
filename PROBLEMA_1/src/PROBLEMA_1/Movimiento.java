package PROBLEMA_1;

abstract public class Movimiento implements CapturaDatos{
    //SE DEFINEN LOS ATRIBUTOS
    private double veli;
    private double velf;
    private double aceleration;
    private double time;

    //SE CREA EL CONSTRUCTOR DEFAULT Y SE LE ASIGNAN VALORES
    public Movimiento() {
        this.veli = 1;
        this.velf = 1;
        this.aceleration = 1;
        this.time = 1;
    }

    //SE CREA EL CONSTRUCTOR CON ARGUMENTOS
    public Movimiento(double veli, double velf, double aceleration, double time) {
        this.veli = veli;
        this.velf = velf;
        this.aceleration = aceleration;
        this.time = time;
    }

    //IMPLEMENTAMOS UN METODO PARA CALCULAR DISTANCIA
    public abstract double calcularDistancia();

    @Override
    public double getVeli() {
        return veli;
    }

    @Override
    public void setVeli(double veli) {
        this.veli= veli;
    }

    @Override
    public double getVelf() {
        return velf;
    }

    @Override
    public void setVelf(double velf) {
         this.velf= velf;
    }

    @Override
    public double getAceleration() {
        return aceleration;
    }

    @Override
    public void setAceleration(double aceleration) {
        this.aceleration = aceleration;
    }

    @Override
    public double getTime() {
        return time;
    }

    @Override
    public void setTime(double time) {
        this.time = time;
    }
}
