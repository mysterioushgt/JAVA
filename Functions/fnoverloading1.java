package Functions;

public class fnoverloading1 {
    public static int sum(int a , int b){
        return a+b;
    }
    public static float sum(float a,float b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.err.println(sum(2.1f,3.2f));
    }
}
