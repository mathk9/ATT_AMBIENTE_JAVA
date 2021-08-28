package calculadora.ambiente_java;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalculadoraAmbiente_Java {

    public static void main(String[] args) {
        Cientific_Functions funcaoCientifica = new Cientific_Functions();
        Base_Functions operacaoBasica = new Base_Functions();
        physical_magnitude_conversions base = new physical_magnitude_conversions();

        Double valor1 = 0.0;
        Double valor2 = 0.0;
        String operacao;
        String opcaoEscolha;
        List < String > operacaoEscolha = Arrays.asList("1", "2", "3");
        //List < String > operacaoBasicaOpcaoList = Arrays.asList("1", "2", "3", "4");
        //List < String > funcaoCientificaOpcaoList = Arrays.asList("1", "2", "3");
        //List < String > conversaoOpcaoList = Arrays.asList("1", "2", "3");
        String unidade;
        String unidadeNova;

        Scanner in = new Scanner(System.in);

        System.out.println("Choose an operation: ");
        System.out.println("1- Base Functions");
        System.out.println("2- Cientific Functions");
        System.out.println("3- physical magnitude conversions\n");
        operacao = in .nextLine();

        System.out.println("\nEnter the first value: ");
        valor1 = in .nextDouble();

        System.out.println("\nEnter the second value: ");
        valor2 = in .nextDouble();

        

        for (String escolha: operacaoEscolha) {
            if (operacao.contains(escolha) ) {
                switch (operacao) {
                    case "1":
                        System.out.println("\nChoose a basic operation: ");
                        System.out.println("1- plus");
                        System.out.println("2- minus");
                        System.out.println("3- time");
                        System.out.println("4- division");
                        opcaoEscolha = in.next();
                        
                        
                        switch (opcaoEscolha) {
                            case "1":
                                System.out.println("\nAnswer: " + operacaoBasica.plus(valor1, valor2));
                                break;

                            case "2":
                                System.out.println("\nAnswer: " + operacaoBasica.minus(valor1, valor2));
                                break;

                            case "3":
                                System.out.println("\nAnswer: " + operacaoBasica.time(valor1, valor2));
                                break;

                            case "4":
                                System.out.println("\nAnswer: " + operacaoBasica.division(valor1, valor2));
                                break;

                            default:
                                break;
                        }
                        in .close();
                        break;

                    case "2":
                        System.out.println("\nChoose a scientific role: ");
                        System.out.println("1- percent");
                        System.out.println("2- squared");
                        System.out.println("3- power");
                        System.out.println("4- squared root");
                        System.out.println("5- sin");
                        System.out.println("6- cos");
                        System.out.println("7- tan");
                        System.out.println("8- log");
                        opcaoEscolha = in.next();
                        
                        switch (opcaoEscolha) {
                            case "1":
                                System.out.println("\nAnswer: " + funcaoCientifica.percent(valor1, valor2));
                                break;

                            case "2":
                                System.out.println("\nAnswer: " + funcaoCientifica.squared(valor1));
                                break;

                            case "3":
                                System.out.println("\nAnswer: " + funcaoCientifica.power(valor1, valor2));
                                break;

                            case "4":
                                System.out.println("\nAnswer: " + funcaoCientifica.squared_root(valor1));
                                break;

                            case "5":
                                System.out.println("\nAnswer: " + funcaoCientifica.sin(valor1));
                                break;

                            case "6":
                                System.out.println("\nAnswer: " + funcaoCientifica.cos(valor1));
                                break;

                            case "7":
                                System.out.println("\nAnswer: " + funcaoCientifica.tan(valor1));
                                break;

                            case "8":
                                System.out.println("\nAnswer: " + funcaoCientifica.log(valor1, valor2));
                                break;

                            default:
                                break;
                        }
                        in .close();
                        break;

                    case "3":
                        System.out.println("\nChoose a conversion: ");
                        System.out.println("1- standardize unit massiness");
                        System.out.println("2- convert unit to");
                        System.out.println("3- converion massiness");
                        opcaoEscolha = in.next();

                        System.out.println("\nInsert the unit:");
                        unidade = in.next();
                        switch (opcaoEscolha) {
                            case "1":
                                System.out.println("\nAnswer: " + base.standardize_unit_massiness(unidade, valor1));
                                break;

                            case "2":
                                System.out.println("\nAnswer: " + base.convert_unit_to(unidade, valor1));
                                break;

                            case "3":

                                System.out.println("Insert the new unit:");
                                unidadeNova = in.next();
                                System.out.println("\nAnswer: " + base.converion_massiness(unidade, valor2, unidadeNova));
                                break;

                            default:
                                break;
                        }
                        in .close();
                        break;

                    default:
                        break;
                }
            }     
        }
    }
}