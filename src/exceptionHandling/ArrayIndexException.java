package exceptionHandling;

public class ArrayIndexException {
    public static void main(String[] args){
        try{
            int arr[] ={1,2,3,4,5,6};
            System.out.println(arr[7]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The specied index does not exist in array please correct the error");
        }
    }
}
