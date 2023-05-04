package problemSolving;

public class Primes {
    public static void main(String[] args){
        int primesNumber[] ={2,3,5,7,11,13,17,19};
        System.out.println("array length:"+ primesNumber.length);
        System.out.println("first few number array");

        for(int prime:primesNumber){
            System.out.print(prime +" ");
        }
    }
}
