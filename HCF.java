package Loop;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        int H ;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the No. A : ");
        int a = Sc.nextInt();
        System.out.print("Enter the No. B : ");
        int b = Sc.nextInt();
// This is the simple way to find out the HCF of the two number
//        for( H = Math.max(a,b) ; H >= 0 ; H-- ){
//             if ( a % H == 0 && b % H == 0 )break;
//        }
//        System.out.println("The LCM of " + a + " and " + b + " is: " + H);

        while( b != 0 ){
            int temp = b;
            b = a % b;
            a = temp;
        }
        H = a; // Strore the HCF value in the H variable
        System.out.println("The LCM is: " + H );
        Sc.close();
    }
}
