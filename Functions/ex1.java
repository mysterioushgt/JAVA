import java.util.Scanner;

public class ex1 {
    public static int average(int a ,int b,int c){
        return (a+b+c)/3;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 number");
        int a=sc.nextInt();
        System.out.println("enter 2 number");
        int b=sc.nextInt();
        System.out.println("enter 3 number");
        int c=sc.nextInt();

        System.out.println("the average of 3 numbers is:" +average(a, b, c));
        
        
    }
}
