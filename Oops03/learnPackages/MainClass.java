package Oops03.learnPackages;
import java.util.*;
public class MainClass {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Teacher obj=new Teacher();
        obj.teachingClass=12;
        System.out.println(obj.degree);
        // obj.id=123; give error as id is private to Teacher class only.
    }
}
