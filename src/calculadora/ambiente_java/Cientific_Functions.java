package calculadora.ambiente_java;


public class Cientific_Functions {

    private double percent;
    private double squared;
    private double power;
    private double squared_root;
    private double sin;
    private double cos;
    private double log;
    private double pi = 3.14159265359;
    private double e = 2.71828;
    
    public double percent(double numA, double numB) {
        this.percent = (numA/100)*numB;
        return percent;
    }    
    
    public double squared_root(double num) {
        this.squared_root = Math.sqrt(num);
        return squared_root;
    }
    
    public double squared(double num) {
        this.squared = power(num,2);
        return squared;
    }
    
    public double power(double numA, double numB) { 
        this.power = Math.pow(numA, numB);
        return power;
    }
    
    public double sin(double num){
        this.sin = Math.sin(num);
        return sin;
    }
    
    public double cos(double num){
        this.cos = Math.cos(num);
        return cos;
    }
    
    public double log(double numA, double numB) {
        this.log = Math.log(numB)/Math.log(numA);
        return log;
    }
    
    public double e(){
        return this.e;
    }    
    
    public double pi(){
        return this.pi;
    }
}