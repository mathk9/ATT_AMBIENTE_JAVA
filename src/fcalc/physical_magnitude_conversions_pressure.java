package fcalc;


public class physical_magnitude_conversions_pressure {
    
    /*Unidade referência: psi */
    private double _psi = 1;
    /*Valor de 1psi convertido*/
    private double _bar = 0.0689476;
    private double _atm = 0.068046;
    private double _pascal = 6894.76;
    private double _torr = 51.7149;
    private double _mmh2o = 703.06955;
    
    private double standardize_unit(String unity, double value) {
        double conv;
        switch(unity) {
            case "psi":
              conv = value / this._psi;
              break;
            case "atm":
              conv = value / this._atm;
              break;
            case "pascal":
              conv = value / this._pascal;
              break;
            case "torr":
              conv = value / this._torr;
              break;
            case "mmh2o":
              conv = value / this._mmh2o;
              break;
            default:
              conv = 0;
        }      
        return conv;
    }
    
    private double convert_unit_to(String unity, double value) {
        double conv;
        switch(unity) {
            case "psi":
              conv = value * this._psi;
              break;
            case "atm":
              conv = value * this._atm;
              break;
            case "pascal":
              conv = value * this._pascal;
              break;
            case "torr":
              conv = value * this._torr;
              break;
            case "mmh2o":
              conv = value * this._mmh2o;
              break;
            default:
              conv = 0;
        }      
        return conv;
    }
    
    public double converion_length(String unity, double value, String unity_to) {

    double conv_g = standardize_unit(unity, value);
    double result = convert_unit_to(unity_to, conv_g);

    return result;
    }
}
