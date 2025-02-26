package Loop;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the No. A : ");
        int a = Sc.nextInt();
        System.out.print("Enter the No. B : ");
        int b = Sc.nextInt();

        // Find the larger number
        int n = Math.max(a, b);

        // Start from the larger number and go upwards
        int L;
        for (L = n; ; L += n) {
            if (L % a == 0 && L % b == 0) {
                break; // LCM found
            }
        }

        System.out.println("The LCM of " + a + " and " + b + " is: " + L);
        Sc.close();
    }
}