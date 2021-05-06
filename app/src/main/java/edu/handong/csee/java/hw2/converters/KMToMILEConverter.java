package edu.handong.csee.java.hw2.converters;

/**
 * implement Convertible interfaces  change KM to MILE
 */
public class KMToMILEConverter implements Convertible {
    private double KM;
    private double MILE;
    
    /**
    * set KM by given value
    */
    public void setFromValue(double fromValue){
        this.KM=fromValue;
    }
    /**
     * convert KM to MILE
     */
    public void convert(){
        this.MILE=this.KM/1.6;
    }
    /**
     * return converted value 
     */
    public double getConvertedValue(){
        return MILE;
    }
    
}
