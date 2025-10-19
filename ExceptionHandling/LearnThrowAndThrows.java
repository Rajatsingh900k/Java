package ExceptionHandling;

public class LearnThrowAndThrows {
    public static void main(String[] args) {
        int arr[]=new int[4];   
        try {
            getNumFromArr(arr);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error in getNumFromArr() method"+ e.getMessage());
        }

    }
    static int getNumFromArr(int a[]) throws ArithmeticException{
        return a[8];
    }
}
