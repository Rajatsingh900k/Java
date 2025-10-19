package JavaGenericsAndWrapperClasses;

//wrapper class are nothing but primitive data types are bound or wrapped by a class.
//ex:- class Integer{
//     int data;
// }

public class Main{
    public static void main(String[] args){
        // not generic class cannot accept primitive data types are their parameter, that's why wrapper classes are needed
        Sub<Integer> obj= new Sub<>();//syntax
        obj.setScore(100);
        System.out.println(obj.getScore());

        //multiple parameters
        Multiple<String,Integer>obj2=new Multiple<>("Rajat", 1221);
        System.out.println(obj2.getName());
        System.out.println(obj2.getId());
    }
}

// Generic class similar to template in cpp

class Sub<T>{
    public T score;

    void setScore(T score){
        this.score=score;
    }

    T getScore(){
        return this.score;
    }
}

// also we can pass multiple Templete

class Multiple<S,I>{
    S name;
    I id;

    Multiple(S name, I id){
        this.name=name;
        this.id=id;
    }

    S getName(){
        return name;
    }
    I getId(){
        return id;
    }
}

// we donot need to make generic class for creating a generic method.

// class GenericMethods{
    
//     static <T> void printData(T data){
//         System.out.println(data);
//     }

//     public static void main(String[] args) {
//         printData("RajatSingh900k");
//     }
// }

//Bounded 

// class Sub<T extends Number>{
//     public T score;

//     void setScore(T score){
//         this.score=score;
//     }

//     T getScore(){
//         return this.score;
//     }
// }