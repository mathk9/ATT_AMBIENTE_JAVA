package fcalc;

public class tan extends Operador{
    
    public tan(){
        setSimbolo('t');
    }

    @Override
    public double calcula(double valor1) {
          return Math.tan(valor1);
    }

    @Override
    public double calcula(double valor1, double valor2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
