package Oops04;

public class LearnAbstraction {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.accelerate();
        obj.brake();
        obj.honks();
    }
}

//abstract class cannot be instantiated, its childs are use.
abstract class Vehicle{
    abstract void accelerate();
    abstract void brake();
    // concrete method or normal method
    void honks(){
        System.out.println("Car is honking");
    }
}
// must implement abstract class methods.
class Car extends Vehicle{
    @Override //annotation
    void accelerate(){
        System.out.println("Car is accelerating");
    }
    @Override // annotation
    void brake(){
        System.out.println("Car is braking");
    }
}
