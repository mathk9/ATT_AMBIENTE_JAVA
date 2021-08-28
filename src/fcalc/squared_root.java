package fcalc;

public class squared_root extends Operador{
        
    public squared_root(){
        setSimbolo('r');
    }

    @Override
    public double calcula(double valor1) {
          return Math.sqrt(valor1);
    }

    @Override
    public double calcula(double valor1, double valor2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
}
