package Functions;

import java.util.Scanner;

public class factorial {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println("enter value of n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(factorial(a));

    }
}
