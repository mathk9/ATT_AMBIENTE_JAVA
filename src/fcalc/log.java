package fcalc;

public class log extends Operador{
    
        
    public log(){
        setSimbolo('l');
    }

    @Override
    public double calcula(double valor1) {
          return Math.log(valor1);
    }

    @Override
    public double calcula(double valor1, double valor2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
