package Oops04.InnerclassAndNestedClass;

public class LearnInnerClass {
    class Toy{
        int price;
    }
    public static void main(String[] args) {
        // without using static class
        Toy toy = new LearnInnerClass(). new Toy();
        toy.price=45;
        // using static class.
        PlayStation playStation=new PlayStation();
        playStation.price=45000;
    }
    //static inner class
    static class PlayStation{
        int price;
    }
}
