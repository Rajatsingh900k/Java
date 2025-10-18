package Oops04.FunctionalInterface;

public class Main {
    
    InnerMain obj1= new InnerMain(){
        @Override
        public void Intro(){
            System.out.println("Hello");
        }
    };
    // lambda Expression, only in functional interface.
    InnerMain obj2=()->{
            System.out.println("Lambda Expression");
    };
}

@FunctionalInterface
interface InnerMain {
    public void Intro();
}
