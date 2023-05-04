package problemSolving;

public class SortingArray {
    public static void main(String[] args){
        int numbers[] ={40,50,65,86,23,45,67,90};
        System.out.println("before sorting");
        for(int i=0;i<numbers.length;i++){
            System.out.print(" "+numbers[i]);
        }
        System.out.println("\n");

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    int temp = numbers[i];
                    numbers[i] =numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println("after sorting");

        for(int i=0;i<numbers.length;i++){
            System.out.print(" "+numbers[i]);
        }
        System.out.println("\n");

    }
}
