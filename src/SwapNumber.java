import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("X input number");
        int x = sc.nextInt();
        System.out.println("y input number");
        int y = sc.nextInt();
        int temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("x:"+x+" "+"y:"+y+" " +"temp:"+temp);
    }
}
