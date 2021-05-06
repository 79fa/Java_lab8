package edu.handong.csee.java.hw2.converters;

/**
 * implement Convertible interfaces  change TON to G
 */
public class TONToGConverter implements Convertible{
    private double Ton;
    private double G;
    /**
     * set Ton
     */
    public void setFromValue(double fromValue){
        Ton=fromValue;
    }
    /**
     * set G converted Ton
     */
    public void convert(){
        G=Ton*1000000;
    }
    /**
     * return converted value;
     */
    public double getConvertedValue(){
        return G;
    }

}
