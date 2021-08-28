package fcalc;

public class cos extends Operador{
    
    public cos(){
        setSimbolo('c');
    }

    @Override
    public double calcula(double valor1) {
          return Math.cos(valor1);
    }

    @Override
    public double calcula(double valor1, double valor2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
