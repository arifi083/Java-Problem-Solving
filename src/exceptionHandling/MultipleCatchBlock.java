package exceptionHandling;

public class MultipleCatchBlock {
    public static void main(String[] args){
        try {
            int a[] = new int[5];
            System.out.println(a[8]);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }catch (Exception aE){
            System.out.println(aE);
        }
    }
}
