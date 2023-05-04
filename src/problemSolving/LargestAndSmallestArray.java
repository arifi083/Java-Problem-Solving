package problemSolving;

import java.util.Scanner;

public class LargestAndSmallestArray {
    public static void main(String [] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n=sc.nextInt();
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            array[i]=sc.nextInt();
        }

        int big = array[0];
        int small = array[0];

        for(int i=0;i<=n;i++){
            if(big<array[i]){
                big = array[i];
            }
            if(array[i]<small){
                small = array[i];
            }
        }



        System.out.println("largest element is"+" " +big);
        System.out.println("smallest element is"+" " +small);

    }
}
