package Oops01;

public class MainClass {
    public static void main(String[] args){
        Dog newdog=new Dog();
        newdog.age=12;
        newdog.color="Brown";
        newdog.name="Tommy";
        System.out.println("Dog name is "+ newdog.name+" Color is "+newdog.color+" and his age is "+newdog.age);
        newdog.walk();
        newdog.bark();
    }
}

class Dog{
    //properties(Attribute)
    String name;
    int age;
    String color;
    //behaviour(Methods)
    void walk(){
        System.out.println("Dog is walking");
    }
    void bark(){
        System.out.println("Dog is barking");
    }
}
