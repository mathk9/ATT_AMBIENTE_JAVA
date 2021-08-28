package fcalc;


public class power extends Operador {
    public power(){
          setSimbolo('^');
    }

    @Override
    public double calcula(double valor1, double valor2) {
          return Math.pow(valor1, valor2);
    }

    @Override
    public double calcula(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
