package Loop;

import java.util.Scanner;

public class PrintThePrimeNumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the No. A : ");
        int a = Sc.nextInt();
        System.out.print("Enter the No. B : ");
        int b = Sc.nextInt();
         int X , i ;
        for ( X = a ; X < b ; X++){
            for ( i = 2; i < X; i++) {
                 if(X % i == 0 ) break;
            }
            if( X == i ) System.out.print(X +"  ");
        }
    }
}
