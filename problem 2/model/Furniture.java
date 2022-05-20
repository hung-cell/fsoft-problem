
package model;

/**
 * Furniture is the model class extends from Thing class
 * @author HungDao
 * @version 1.0
 */
public class Furniture  extends Thing{
    private String name;
    private String manufacture;
    private String design;
    private String brand;

    public Furniture() {
    }

    public Furniture(String name, String manufacture, String design, String brand) {
       super();
        this.name = name;
        this.manufacture = manufacture;
        this.design = design;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
     @Override
    public String getDescription(){
        return 
                "Serial number: " + super.getSerialNumber() +"\n" +
              "Name: "+ this.name + "\n"
              +"Manufacture: " + this.manufacture + "\n"
              +"Design: " + this.design + "\n"
              +"Brand: " + this.brand +"\n"
              ;
    }
    
}
