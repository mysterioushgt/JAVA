// TAKING INPUT AND OUTPUT IN ARRAY
package Array;
import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        int marks[] =new int[100];

        // System.out.println("length of array = " + marks.length);
       // int numbers[] ={1,2,3};
        // System.out.println("length of array = " + numbers.length);

        System.out.println("enter marks");
        Scanner sc =new Scanner(System.in);

        marks[0] =sc.nextInt();
        marks[1] =sc.nextInt();
        marks[2] =sc.nextInt();

        System.out.println("phy marks is :" + marks[0]);
        System.out.println("chem marks is :" + marks[1]);
        System.out.println("math marks is :" + marks[2]);

        //update 
        marks[2] = 100;
        System.out.println("math marks is : " + marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage is " + percentage +"%");

    }
    
}
