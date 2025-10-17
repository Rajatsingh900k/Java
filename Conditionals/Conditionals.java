package Conditionals;
import java.util.*;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num==2)
            System.out.println("You entered: " + num);
        else if(num<2)
            System.out.println("You entered lesser number than 2");
        else{
            System.out.println("You have enter a larger number than 2");
        }
        SwitchConditional(num);
        TernaryOperator(num);
    }
    public static void SwitchConditional(int num){
        switch(num){
            case 1:{
                System.out.println("Case 1");
                break;
            }
            case 2:{
                System.out.println("Case 2");
                break;
            }
            default:{
                System.out.println("Case 1");
                }
            
        }
    }
    public static void TernaryOperator(int num){
        int res=num==2?num:0;
        System.out.println(res);
    }
}
