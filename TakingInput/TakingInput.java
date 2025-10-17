package TakingInput;

import java.util.*; 
public class TakingInput{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        String name=sc.nextLine();
        System.out.println("Your name and age is "+ name + " " + age);
        sc.close();
    }
}
