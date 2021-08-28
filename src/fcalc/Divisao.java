package fcalc;

public class Divisao extends Operador{

    public Divisao(){
          setSimbolo('/');
    }

    @Override
    public double calcula(double valor1, double valor2) {
          return valor1 / valor2;
    }

    @Override
    public double calcula(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}