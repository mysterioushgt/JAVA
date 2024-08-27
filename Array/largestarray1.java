package Array;
import java.util.*;
public class largestarray1 {
    public static int getlargestarr(int numbers[]){
        int largest = Integer.MIN_VALUE; // - infinity
        int smallest = Integer.MAX_VALUE; //+ infinity

        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest= numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("the smallest no is " + smallest);
        return largest;
    }
    public static void main(String[] args){
        int numbers[] ={12,45,82,45,60};
        System.out.println("the largest number is :" + getlargestarr(numbers));
    }
}