package Oops04;

public class LearnInterface {
    public static void main(String[] args) {
        // Animal dog=new Animal() not possible as Animal is interface.
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.sings();
        System.out.println(Animal.LEGS);
    }
}
// in interfce there no problem of diamond
// in interface we can creat default function as weell
interface Pet {
    void sings();
    void drink();
}

interface Animal {
    // Only public static final is allowed, because one interfce make multiple classes that's why static and final because it can be shared between multiple classes to as to avoid changes.
    public static final int LEGS=4;
    void eats();
    //default method implementation similar to concrete methods of abstraction
    default void walk(){
        System.out.println("Animal is walking.");
    }
}

class Monkey implements Animal, Pet{
    @Override
    public void eats(){
        System.out.println("Monkey is eating.");
    }
    @Override
    public void sings(){
        System.out.println("Monkey is singing.");
    }
    @Override
    public void drink(){
        System.out.println("Monkey is drinking.");
    }
}