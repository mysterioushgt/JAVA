import java.util.Scanner;

public class ex3 {
    public static boolean ispalindrome(int n){
        int mynum =n;
        int revrese =0;

        while(n!=0){
            int rem= n%10;
            revrese = revrese*10+ rem;
            n=n/10;
        }
        if(revrese==mynum ){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();

        if(ispalindrome(n)){
            System.out.println("the given number " + n +"is palindrome");
        }
        else{
            System.out.println("the given number " + n +"is not palindrome");
        }
    }
}
