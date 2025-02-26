package Loop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int digit , sum = 0 ;

        Scanner Sc = new Scanner(System.in);
        System.out.print(" Enter the Number : ");
        int n = Sc.nextInt();

        while ( n > 0 ){
             digit = n % 10;
             sum  = sum * 10 + digit;
             n = n / 10;
        }

        System.out.print(" Reverse Number Is : "+sum);
    }
}
