package Oops01;

public class MainClass {
    public static void main(String[] args){
        // Dog newdog=new Dog();
        // newdog.age=12;
        // newdog.color="Brown";
        // newdog.name="Tommy";
        // System.out.println("Dog name is "+ newdog.name+" Color is "+newdog.color+" and his age is "+newdog.age);
        // newdog.walk();
        // newdog.bark();

        // Complex num=new Complex();
        // num.setA(2);
        // num.setB(3);
        // num.print();

        // MethodOverloading a=new MethodOverloading();
        // a.Greet();
        // a.Greet("Rajat");

        //constructor

        ConstructorsInJava obj=new ConstructorsInJava(1,2,3);
        ConstructorsInJava obj2=new ConstructorsInJava("Rajat");
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj2.name);
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(obj2.c);
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

class Complex{
    int a;
    int b;
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public void print(){
        System.out.println(this.a +" + "+this.b+"i");
    }
    // public int add(Complex ){
        
    // }
}


// Method Overloading...


class MethodOverloading{
    void Greet(String name){
        System.out.println("Hello "+name+" Greetings.");
    }
    void Greet(){
        System.out.println("Hello, Greetings");
    }
}

//Constructors

class ConstructorsInJava{
    //here method overloaded and constructor both are perfromed.
    // if we have made a constructor then we can't called default constructor.

    int a,b,c;
    String name;
    public ConstructorsInJava(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public ConstructorsInJava(String name){
        this.name=name;
    }
}
