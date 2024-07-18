package Functions;

public class fnoverloading {
    public static int sum(int a,int b){
        int add=a+b;
        return add;
    }
    public static int sum(int a,int b,int c){
        int add=a+b+c;
        return add;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(2, 1, 1));

    }
    
}
