import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isVowel = false;
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O': isVowel = true;
        }
        if(isVowel ==true){
            System.out.println(ch +" " +"this is vowel");
        }
        else {
            System.out.println(ch+" " +"this is consonent");
        }

    }
}
