package edu.handong.csee.java.hw2.converters;
/**
 * show name of methods is is implemented in other classes
 */
public interface Convertible {

    /**
     * set value;
     */
    public void setFromValue(double fromValue);
    /**
     * return converted value
     * @return
     */
    public double getConvertedValue();
    /**
     * convert value 
     */
    public void convert();

}