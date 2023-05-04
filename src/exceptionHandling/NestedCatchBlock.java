package exceptionHandling;

public class NestedCatchBlock {
    public static void main(String[] args){
        try {
            try {
                int data[] = new int[5];
                data[6] =200;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            int value =200/0;
        } catch (ArithmeticException ae){
            System.out.println(ae);
        }


    }
}
