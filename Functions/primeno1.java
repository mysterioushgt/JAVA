package Functions;
import java.util.Scanner;
public class primeno1 {
    public static boolean primeno(int n){
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int a = sc.nextInt();
        System.out.println(primeno(a));
    }
}
