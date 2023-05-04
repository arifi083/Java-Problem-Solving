package problemSolving;

public class PalindromeString {
    public static void main(String [] args){
        String str ="Radar";
        String reverseStr ="";

        for(int i=str.length()-1;i>=0;--i){
            reverseStr =reverseStr + str.charAt(i);
        }
        if(str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println(str +" " +" is a palidrome string");
        }
        else{
            System.out.println(str +" " +" is not a palidrome string");
        }
    }
}
