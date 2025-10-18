package Oops02;
import java.util.*;// java supports multilevel inheritence(multi inheritence) but a clas cannot inherite from two classes.
// every class has a parent class in java called object class.
public class Vehicle {
    int wheelsCount;
    String model;
    final int gears=4;
    //methods with final keywords cannot be overriden in it's child classes.
    // class with final keyword cannot be extended or inherited from any other class.
    public static void main(String[] args) {
        Vehicle v1=new Vehicle(2);
        //v1.gears=6 :-gives error.
    }
    
    void start(){
        System.out.println("Vehicle is starting.");
    }

    //ctor
    Vehicle(){
        System.out.println("Creating a vehicle instance");
    }
    Vehicle(int wheelsCount){
        this.wheelsCount=wheelsCount;
        System.out.println("Creating vehicle with "+ wheelsCount+" Wheels");
    }
}
