package Loops;

public class Loops {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            System.out.println("For loop: "+(i+1));
        }
        int num=10;
        while(num>0){
            System.out.println("while loop: "+(num));
            num--;            
        }
        do{
            System.out.println("do while loop: "+(num));
            num++;
        }while(num<10);
    }
}
