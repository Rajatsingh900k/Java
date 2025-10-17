import java.util.*;
class DataTypes{
    public static void main(String[] args){
        // 1 byte = 8 bits
        boolean isPassed=true;// 1 bit (0 or 1)
        int count = 12;// 4 byte  or (-2^(n-1) to 2^(n-1)-1) where n = no. of bits
        byte marks=13;// 1 byte (-128 to 127)
        short studentCount= 1333;// 2  (-32768 to 32767)
        //similarly long is 8 byte and so on
        System.out.println(count);
        System.out.println(isPassed);
        System.out.println(marks);
        ImplicitConversion();
        explicitConversion();
    }
    public static void ImplicitConversion(){
        //small data type can be implicity converted into bigger datatype;
        //ex:-
        int a=1233;
        long b=a;
        System.out.println(b);
    }
    public static void explicitConversion(){
        //large data type connot be implcitlty converted into small data type, it will lead to data loss.
        //to avoid data loss we can explicitly convert
        //ex:-
        long a=11212l;
        int b=(int)a;
        System.out.println(b);
    }
}