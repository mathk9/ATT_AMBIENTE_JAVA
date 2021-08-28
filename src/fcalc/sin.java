package fcalc;

public class sin extends Operador{
        
    public sin(){
        setSimbolo('s');
    }

    @Override
    public double calcula(double valor1) {
          return Math.sin(valor1);
    }

    @Override
    public double calcula(double valor1, double valor2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
