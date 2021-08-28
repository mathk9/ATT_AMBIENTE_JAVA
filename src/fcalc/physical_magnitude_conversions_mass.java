package fcalc;

public class physical_magnitude_conversions_mass {
    /*Unidade referência: grama */
    private double _grama = 1;
    /*Valor de 1g convertido*/
    private double _quilograma = 0.001;
    private double _tonelada = 0.000001;
    private double _oncas = 0.035274;
    private double _libra = 0.002205;
    private double _miligrama = 1000;

    private double standardize_unit(String unity, double value) {
        double conv;
        switch(unity) {
            case "gramas":
              conv = value / this._grama;
              break;
            case "quilograma":
              conv = value / this._quilograma;
              break;
            case "tonelada":
              conv = value / this._tonelada;
              break;
            case "oncas":
              conv = value / this._oncas;
              break;
            case "libra":
              conv = value / this._libra;
              break;
            case "miligrama":
              conv = value / this._miligrama;
              break;
            default:
              conv = 0;
        }      
        return conv;
    }
    
    private double convert_unit_to(String unity, double value) {
        double conv;
        switch(unity) {
            case "gramas":
              conv = value * this._grama;
              break;
            case "quilograma":
              conv = value * this._quilograma;
              break;
            case "tonelada":
              conv = value * this._tonelada;
              break;
            case "oncas":
              conv = value * this._oncas;
              break;
            case "libra":
              conv = value * this._libra;
              break;
            case "miligrama":
              conv = value * this._miligrama;
              break;
            default:
              conv = 0;
        }      
        return conv;
    }
    
    public double converion_massiness(String unity, double value, String unity_to) {
        
        double conv_g = standardize_unit(unity, value);
        double result = convert_unit_to(unity_to, conv_g);
        
        return result;
    }
}