package ExceptionHandling;


//there are two type of eceptions in java 1. Runtime exception and 2. IO Exception.
//Runtime exception happens due to programming error.(these are not checked in compile time but at runtime)
//IOException is also known as a checked exception, there are checked by compiler(complie time exception).

//handling exceptions:- try{}catch{} blocks helps to manage the exception and prevent abnormal termination of program.
public class MainClass{
    public static void main(String[] args) {
        int arr[]=new int[5];

        System.out.println("Hello World");

        try{
            int result=5/0;// as soon as it hits then the try-catch is cached, it directly exceutes respective catch block with out moving more deeper into the try block
            System.out.println(arr[8]);
            
        }catch(ArithmeticException error){
            System.out.println("Trying to divide an integer by zero");
        }catch(ArrayIndexOutOfBoundsException error){
            System.out.println("Try to access out of bound element Error: "+ error);
        }catch(NullPointerException | NegativeArraySizeException e){
            System.out.println("In this type of catch we can use multipe excetions with one catch block");
        }

        System.out.println("Bye Guys");
    }
}