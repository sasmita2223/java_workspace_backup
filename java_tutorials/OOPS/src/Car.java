//super class Vehicle

class Vechicle{
    int engineno;
    String name;
    String color;
    
    Vechicle(int engineno,String name,String color) {
        this.engineno = engineno;
        this.name = name;
        this.color = color;
    }
    
    
    public void displayVechicle() {
        System.out.println(engineno);
        System.out.println(name);
        System.out.println(color);
    }

}
//sub class extending super class(vechicle)
public class Car extends Vechicle 
{
    boolean acType;
    Car(int engineno,String name,String color,boolean acType)
    {
        //to pass the value to the super class from the sub class
        super(engineno,name,color);
        this.acType = acType;
    }
    
    public void carDetails() {
        displayVechicle();
        if(acType)
            System.out.println("AC");
        else
            System.out.println("Non AC");
    }
    
    
// main  method 
    
    public static void main(String[] args) {
        Car obj = new Car(1000,"activa","black",true);
        obj.carDetails();
    }
}

