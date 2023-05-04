import java.util.Scanner;

public class BasicIfCondition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = sc.nextInt();
        if(number<100){
            System.out.println("number is less than 100");
        }
        else if(number == 100){
            System.out.println("number is equal to 100");
        }
        else {
            System.out.println("number is greater than 100");
        }
    }
}
