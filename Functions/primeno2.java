// OPTIMIZED METHOD TO CHECK WHETHER NO IS PRIME OR NOT
package Functions;

import java.util.Scanner;

public class primeno2 {
    public static boolean prime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number : ");
        int n = sc.nextInt();
        if(prime(n)){
            System.out.println(n + " is prime no");
        }
        else{
            System.out.println(n + "is not prime");
        }
    }
}
