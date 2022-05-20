
package model;

import java.util.ArrayList;
import java.util.Collections;



/**
 * Thing is the base model class
 * @author HungDao
 * @version 1.0
 */
public abstract class Thing {
    
    /**
     * number of furniture have created
     */ 
    public static int count = 0;
    
     /**
     * random number generator for Serial Number every time a thing is generated
     * @return    a random unique number from 100000 -> 999999
     * 
     */
    public static Integer randomNumber(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=100000; i<999999; i++) list.add(i);
        Collections.shuffle(list);
        return list.get(count + 1);
    }
    
    private int serialNumber;
    
    public int getSerialNumber() {
        return serialNumber;
    }
    public Thing(){
        // serial number will be auto genrated each time a thing is created
       serialNumber = randomNumber();
   
    }
    /**
     * Abstract method get the description of the object 
     */
    public String getDescription(){
        return "This is a Thing";
    }
    

}
