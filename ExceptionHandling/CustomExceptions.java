package ExceptionHandling;

import java.util.Scanner;

public class CustomExceptions {
    public static void main(String[] args) throws MyException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        int age=sc.nextInt();

        if(age>100){
            throw new MyException();
        }
    }
}

class MyException extends Exception{
}
