import java.util.Scanner;

public class EvenAndOddNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int num =sc.nextInt();

        if(num%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }



    }
}
