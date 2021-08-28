package fcalc;

public abstract class Operador {

      private char simbolo;
       
       public abstract double calcula(double valor1, double valor2);
       
       public abstract double calcula(double valor1);

       public char getSimbolo(){
             return this.simbolo;
       }


       public void setSimbolo(char simbolo){
             this.simbolo = simbolo;
       }

}