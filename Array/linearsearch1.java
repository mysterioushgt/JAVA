//linearsearch by taking input from user:-----

package Array;
import java.util.*;
public class linearsearch1 {
    public static int linearSearch(int numbers[] ,int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = new int[10]; 
        System.out.println("enter numbers");
        
        Scanner sc =new Scanner(System.in);
        numbers[0] =sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[2]= sc.nextInt();
        numbers[3] = sc.nextInt();
        numbers[4] = sc.nextInt();
        numbers[5] = sc.nextInt();
    
        System.out.println("enter key");
        int key = sc.nextInt();

        int index =linearSearch(numbers, key);
        if(index == -1){
            System.out.println("not found");
        }else{
            System.out.println("key is at index" + index);
        }

       
    }
}
