package StringsInJava;
public class StringsInJava{
    public static void main(String[] args){
        // Strings are immutable.
        String name="Rajat Singh";
        // System.out.println("Hi, my name is "+name);
        // char education[]={'B','.','T','e','c','h'};
        // System.out.println("My Education is ");
        // for(char ch:education){
        //     System.out.print(ch);
        // }
        // howToMakeString();
        StringMethods();
    }
    public static void howToMakeString(){
        //1. By new keyword
        String fname=new String("Rajat");
        //2. By string literal ""
        String lname="Singh";
        
        System.out.println("\n"+fname+" "+lname);
    }
    public static void StringMethods(){
        //compare two strings
        String n1="Rajat";
        String n2="Rajat";
        String n3=new String("Rajat");
        int b=n1.compareTo(n2);// Compares two strings lexicographically. The comparison is based on the Unicode value of each character in the strings. The character sequence represented by this String object is compared lexicographically to the character sequence represented by the argument string. The result is a negative integer if this String object lexicographically precedes the argument string. The result is a positive integer if this String object lexicographically follows the argument string. The result is zero if the strings are equal; compareTo returns 0 exactly when the equals(Object) method would return true
        // if n1==n2 then references are checked.
        if(b==0){
            System.out.println("both are diferent");
        }else{
            System.out.println("Both are same");
        }

        //to compare values of two strings use equal() method
        if(n1.equals(n2)){
            System.out.println("Both have same value");
        }else{
            System.out.println("Not equal value");
        }
    }
}