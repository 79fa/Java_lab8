package edu.handong.csee.java.hw2.converters;
/**
 * implement Convertible interfaces  change KM to M 
 */
public class KMToMConverter implements Convertible {
    private double M;
    private double KM;

    /**
    * return converted value
    */
    public double getConvertedValue() {
        return M;
    }
    /**
     * set KM 
     */
    public void setFromValue(double fromValue) {
        KM = fromValue;
    }
    /**
     * convert KM to M 
     */
    public void convert(){
        M=KM*1000;
    }



    
}
