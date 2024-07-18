package Functions;

public class product {
    public static int multiply(int num1,int num2){
        int multiply =num1*num2;
        return multiply;
    }
    
    public static void multiply1(int num1 , int num2){
        int multiply = num1*num2;
        System.out.println(multiply);
    }
    public static void main(String[] args){

        int product= multiply(4,3);  // with int data type
        System.out.println(product);


        multiply1(4,5);  // with void datatype
    }
}