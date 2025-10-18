package Oops04.InnerclassAndNestedClass;

public class LearnAnonymous{
    // this is used only in LernAnonymous(this class) only.
    OuterClass anonymousClass = new OuterClass(){
        void jimmy(){
            System.out.println("Jimmy choo");
        }
    };

    superInterface obj2=new superInterface(){
        @Override
        public void InterfaceMethod() {
            System.out.println("This is super Interface anonymous class.");
        };
    };

}

class OuterClass{
    


    public void outerMethod(){
        System.out.println("This is outer class");
    }
}

interface superInterface {
    void InterfaceMethod();
}