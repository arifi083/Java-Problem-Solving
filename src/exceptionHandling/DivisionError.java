package exceptionHandling;

public class DivisionError {
    public static void main(String[] args){
        try {
            int a[] = new int[5];
            a[5] = 30/0;
        } catch (ArithmeticException e){
            System.out.println("task 1 is completed");
        }
        catch (Exception e){
            System.out.println("common task completed");
        }


    }
}
