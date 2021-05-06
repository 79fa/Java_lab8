package edu.handong.csee.java.hw2.converters;
/**
 * implement Convertible interfaces  change MILE to K
 */
public class MILEToKMConverter implements Convertible {
    private double K;
    private double MILE;
    /**
    * set MILE 
    */
    public void setFromValue(double fromValue){
        this.MILE=fromValue;
    }
    /**
     * set K by converting MILE
     */
    public void convert(){
        this.K=this.MILE*1.6;
    }
    /**
     * return converted value
     */
    public double getConvertedValue(){
        return this.K;
    }

}
