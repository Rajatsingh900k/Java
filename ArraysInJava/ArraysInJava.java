package ArraysInJava;
import java.util.*;
public class ArraysInJava{
    public static void main(String[] args){
        int[] arr; //declaration or int arr[] 
        arr= new int[10]; //allocation
        int brr[]={11,22,33,44,55};//intialisation
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
            System.out.println(arr[i]);
            if(i<5){
                System.out.println("brr array: "+brr[i]);
            }
        }
        TwodArray();
        
    }
    public static void TwodArray(){
        int TwoDArray[][]={{1,2},{3,4}};
        for(int i=0;i<TwoDArray.length;i++){
            for(int j=0;j<TwoDArray.length;j++){
                System.out.println("Two D array: "+TwoDArray[i][j]);
            }
        }
    }
}