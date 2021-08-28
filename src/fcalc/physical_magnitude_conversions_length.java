package fcalc;

public class physical_magnitude_conversions_length {
    /*Unidade referência: meter */
    private double _meter = 1;
    /*Valor de 1m convertido*/
    private double _milimeter = 0.0001;
    private double _centimeter = 100;
    private double _quilometer = 0.001;
    private double _pes = 3.28084;
    private double _jardas = 1.093613;
    private double _milhas = 0.000621;
    
    private double standardize_unit(String unity, double value) {
        double conv;
        switch(unity) {
            case "meter":
              conv = value / this._meter;
              break;
            case "milimeter":
              conv = value / this._milimeter;
              break;
            case "centimeter":
              conv = value / this._centimeter;
              break;
            case "pes":
              conv = value / this._pes;
              break;
            case "jardas":
              conv = value / this._jardas;
              break;
            case "milhas":
              conv = value / this._milhas;
              break;
            case "quilometer":
              conv = value / this._quilometer;
              break;
            default:
              conv = 0;
        }      
        return conv;
    }
    
    private double convert_unit_to(String unity, double value) {
        double conv;
        switch(unity) {
            case "meter":
              conv = value * this._meter;
              break;
            case "milimeter":
              conv = value * this._milimeter;
              break;
            case "centimeter":
              conv = value * this._centimeter;
              break;
            case "pes":
              conv = value * this._pes;
              break;
            case "jardas":
              conv = value * this._jardas;
              break;
            case "milhas":
              conv = value * this._milhas;
              break;
            case "quilometer":
              conv = value * this._quilometer;
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