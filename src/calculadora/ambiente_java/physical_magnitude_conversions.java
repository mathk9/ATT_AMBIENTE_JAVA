
package calculadora.ambiente_java;


public class physical_magnitude_conversions {
    /*Unidade referência: Gramas */
    private double gramas = 1;
    private double quilogramas = 0.001;
    private double toneladas = 0.000001;
    private double oncas = 0.035274;
    private double libra = 0.002205;
    private double miligramas = 1000;

    private double standardize_unit_massiness(String unity, double value) {
        double conv;
        switch(unity) {
            case "g":
              conv = value / this.gramas;
              break;
            case "kg":
              conv = value / this.quilogramas;
              break;
            case "t":
              conv = value / this.toneladas;
              break;
            case "oz":
              conv = value / this.oncas;
              break;
            case "lb":
              conv = value / this.libra;
              break;
            case "mg":
              conv = value / this.miligramas;
              break;
            default:
              conv = 0;
        }      
        return conv;
    }
    
    private double convert_unit_to(String unity, double value) {
        double conv;
        switch(unity) {
            case "g":
              conv = value * this.gramas;
              break;
            case "kg":
              conv = value * this.quilogramas;
              break;
            case "t":
              conv = value * this.toneladas;
              break;
            case "oz":
              conv = value * this.oncas;
              break;
            case "lb":
              conv = value * this.libra;
              break;
            case "mg":
              conv = value * this.miligramas;
              break;
            default:
              conv = 0;
        }      
        return conv;
    }
    
    public double converion_massiness(String unity, double value, String unity_to) {
        
        double conv_g = standardize_unit_massiness(unity, value);
        double result = convert_unit_to(unity_to, conv_g);
        
        return result;
    }
}
