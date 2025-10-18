package Oops02;

public class Car extends Vehicle {
    String color;

    Car(){
        super(2);
        System.out.println("Car is being Created");
    }
    public static void main(String[] args){
        Car obj = new Car();
        obj.wheelsCount=4;
        obj.model="I10";
        obj.color="white";
        //System.out.println("No. of wheels in car: "+ obj.wheelsCount);
        obj.start();
    }
    // Methods Overriding
    void start(){
        super.start();// super keyword is used to access the original properties(not overrided) of immediate parent class.
        System.out.println(this.model+" Broom Broom!!!");
        System.out.println(this);
        Scooter obj=new Scooter();
        obj.braking(braking());
    }

    Car braking(){//return object
        return this;
    }
}

class Scooter{
    void braking(Car car){
        System.out.println(car.model+" is braking");
    }
}
