package Array;

public class callbyreference {
    public static void UpdateValue(int arr[]){
        arr[2] =34;
    }
    public static void nonchangeble(int marks){
        marks = 14;
    }
    public static void string(String fruit){
        fruit ="orange";
    }
    public static void main(String [] args){
        int arr[] = {1,2,3};
        UpdateValue(arr);
        for(int i=0 ;i<arr.length;i++){
            System.out.println(arr[i] + "");
        }

        //non changeble
        int marks=23;
        nonchangeble(marks);
        System.out.println(marks);

        String fruit ="mango";
        string(fruit);
        
        System.out.println(fruit);


    }
}