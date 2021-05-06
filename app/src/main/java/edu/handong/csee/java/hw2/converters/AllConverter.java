package edu.handong.csee.java.hw2.converters;
/**
 * if it is KM it converted to M and MIle if is TON it will be converted G and KG
 */
public class AllConverter {
    private double KM;
    private double M;
    private double MILE;

    private double Ton;
    private double G;
    private double KG;
    private String mes;



   



    /**
     * set KM and TON
    */
    public AllConverter setFromValue(double fromValue){
        KM=fromValue;
        Ton=fromValue;

        return this;
    }
    /**
     * chech witch measure come
     */
    public AllConverter setOriginalMeasure(String mesu){
        mes=mesu;
        
        return this;
        
    }
    /**
     * convert and printout the result
     */
    public void convertAndPrintOut(){
        
        if(mes.equals("KM")){
            M=KM*1000;
            MILE=KM/1.6;
            System.out.println(KM+" KM to "+M+" M");
            System.out.println(KM+" KM to "+MILE+" MILE");
            //System.out.println("\n");
        }
        else if(mes.equals("TON")){
            G=Ton*1000000;
            KG=Ton*1000;
            System.out.println(Ton+" TON to "+KG+" KG");
            System.out.println(Ton+" TON to "+G+" G");
            //System.out.println("\n");
        }
        else{
            System.out.println("AllConverter cannot support the measure!");
            //System.out.println("\n");
        }

    }
    



    
}
