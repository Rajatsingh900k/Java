package Oops03.learnPackages;

// import java.security.PrivateKey;
// import java.security.PublicKey;

public class Person {
    int age;
    String name;
    String gender;
    String chitChat;
    // Therer are total 4 types of access modifiers:-
    // 1. Public: available every where
    // 2. Private: available no where other than the class in whoch it's defined.
    // 3. Protected: a
    // 4. Default or package private(by defaut every thing is default)

    Person(int age, String name, String gender, String chitChat){
        this.age=age;
        this.name=name;
        this.gender=gender;
        this.chitChat=chitChat;
    }
}
