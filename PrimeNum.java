package Loop;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Any Number : ");
        int X  = Sc.nextInt();
        boolean flag = true;
        for (int i = 2 ; i < X ; i++ ){
             if ( X % i == 0 ){
                  flag = false;
                  break;
             }
        }

        if ( flag ) System.out.println("This is Prime Number!");
        else System.out.println("This is not Prime");
    }
}
