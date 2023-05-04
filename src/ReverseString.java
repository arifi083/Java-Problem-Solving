import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
       String originalStr ="arif";
       String reverseStr="";

       for(int i=originalStr.length()-1;i>=0;i--){
           reverseStr = reverseStr + originalStr.charAt(i);
       }
        System.out.println("original String:" +originalStr);
        System.out.println("Reverse String:"+ reverseStr);

    }
}
