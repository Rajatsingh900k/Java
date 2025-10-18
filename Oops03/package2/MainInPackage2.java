package Oops03.package2;

import Oops03.learnPackages.Teacher;

public class MainInPackage2 {
    public static void main(String[] args) {
        Teacher obj=new Teacher();
        obj.teachingClass=4;
        // obj.id=123; gives error again as it's private in Teacher class.
        // System.out.println(obj.degree); gives error as this is different package and Teacher class is in different package.
    }    
}
