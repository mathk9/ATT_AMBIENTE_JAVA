package calculadora.ambiente_java;

public class Base_Functions {
    
    private double division;
    private double plus;
    private double times;
    private double minus;
    
    public double division(double numA, double numB){
        this.division = numA/numB;    
        return division;            
    }   
    
    public double minus(double numA, double numB){
        this.minus = numA-numB;    
        return minus;            
    }   

    public double time(double numA, double numB){
        this.times = numA*numB;    
        return times;            
    }   
    
    public double plus(double numA, double numB){
        this.plus = numA+numB;    
        return plus;            
    }     
    
}
