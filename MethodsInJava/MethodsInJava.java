package MethodsInJava;
import java.util.*;
public class MethodsInJava{
    public static void main(String[] args){
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int res=sum(a,b);
        System.out.println("Answer is "+res);
    }
    public static int sum(int a, int b){
        int ans=a+b;
        return ans;
    }
}