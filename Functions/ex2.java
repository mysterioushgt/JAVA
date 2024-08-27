import java.util.Scanner;

public class ex2 {
    public static boolean iseven(int n)
    {
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(iseven(n)){
            System.out.println("the number is even");
        }
        else{
            System.out.println("not even");
        }
    }
}
