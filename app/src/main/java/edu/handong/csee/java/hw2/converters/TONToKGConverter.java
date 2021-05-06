package edu.handong.csee.java.hw2.converters;
/**
 * implement Convertible interfaces  change TON to KG
 */
public class TONToKGConverter implements Convertible {
    private double Ton;
    private double KG;
    /**
     * set TON
     */
    public void setFromValue(double fromValue){
        Ton=fromValue;
    }
    /**
     * set KG converted TON
     */
    public void convert(){
        KG=Ton*1000;
    }
    /**
     * return converted value;
     */
    public double getConvertedValue(){
        return KG;
    }
    
}
