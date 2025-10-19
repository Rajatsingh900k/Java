package ExceptionHandling;

public class finalyblockInEceptions {
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("Hello World");
        try{
            int aaa=a[9];
        }catch(Exception e){
            System.out.println("Exception Handlinggggg");
        }finally{//finally block is used only once
            System.out.println("I will run always. nondependent on exception");
        }
    }
}
