/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcalc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FCalc {

    private List<Operador> opSuportados;
    private List<Operador> opSuportadosCientifico;
    
    public static void main(String[] args) {
        
        FCalc f = new FCalc();
    }

  
    public FCalc() {

            opSuportados = new ArrayList<Operador>();
            opSuportados.add(new Soma());
            opSuportados.add(new Subtracao());
            opSuportados.add(new Multiplicacao());
            opSuportados.add(new Divisao());
            opSuportados.add(new power());
            opSuportadosCientifico = new ArrayList<Operador>();
            opSuportadosCientifico.add(new cos());
            opSuportadosCientifico.add(new sin());
            opSuportadosCientifico.add(new tan());
            opSuportadosCientifico.add(new log());
            opSuportadosCientifico.add(new squared_root());
            inicarCalculo();
        }

    private void inicarCalculo(){
    Scanner n = new Scanner(System.in);
    System.out.print("Digite: ");
    String a = n.nextLine();;
    String formula = a;
    List<Integer> numeros = new ArrayList<Integer>();
    List<Character> operadores = new ArrayList<Character>();
    String numeroAsString = "";
    try{
        for(int i = 0; i < formula.trim().length(); i++){

             if (isNumero(String.valueOf(formula.charAt(i)))){
                    numeroAsString = numeroAsString.concat(String.valueOf(formula.charAt(i)));

             }
             else if (isOperador(formula.charAt(i))){
                    numeros.add(Integer.parseInt(numeroAsString));
                    operadores.add(formula.charAt(i));
                    numeroAsString = "";  
                     }                  
             


             if (i+1 == formula.trim().length() && isOperador(formula.charAt(i))){
                    numeros.add(Integer.parseInt(numeroAsString));
             }
        }

        double resultado = 0;
        
        if(numeros.size() == 1){
            for(Operador op : opSuportadosCientifico){
                if (op.getSimbolo() == (operadores.get(0))){
                       resultado = op.calcula(numeros.get(0));
                       break;
                }
            }  
        }
        else {
            for (int i = 0; i < numeros.size(); i++){

                 if (i == 0){
                        resultado = numeros.get(i);
                 }else{                    
                        for(Operador op : opSuportados){
                               if (op.getSimbolo() == (operadores.get(i-1))){
                                      resultado = op.calcula(resultado, numeros.get(i));
                                      break;
                               }
                        }                                      
                 }
            }
        }
        System.out.println(String.valueOf(resultado));
    }
    catch(Exception e){
        System.out.println("ERRO");
        this.inicarCalculo();
    }
    }

    private boolean isOperador(char c){
        boolean modo = false;
        for(Operador op : opSuportados){
             if (op.getSimbolo() == c){
                    modo = true;
             }
        }
        for(Operador op : opSuportadosCientifico){
             if (op.getSimbolo() == c){
                    modo = true;
             }
        }
        return modo;
    }

    private boolean isNumero(String numero) {
         try {
                Integer i = Integer.parseInt(numero);
         } catch (NumberFormatException nfe) {
                return false;
         }
         return true;
    }
}