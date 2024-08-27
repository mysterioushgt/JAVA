
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N%2==0){
            if(N>1&&N<=5){
                System.out.println("Not Weird");
            }
            if(N>5 && N<=20){
                System.out.println("Weird");
            }
           if(N>20){
               System.out.println("Not Weird");
           }
    }
    else{
        System.out.println("Weird");
    }
    
    }
}
