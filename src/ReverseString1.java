import java.util.Scanner;

public class ReverseString1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String originalStr = sc.nextLine();
        String reverseStr ="";

        for(int i=0;i<originalStr.length();i++){
            reverseStr = originalStr.charAt(i) +reverseStr;
            System.out.println(reverseStr);
        }
        System.out.println("original String:"+originalStr);
        System.out.println("reverse String: "+ reverseStr);
    }
}
