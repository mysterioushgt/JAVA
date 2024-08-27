package Functions;

public class callbyvalue {
    public static int change(int a) {
        a = 10;
        return a;
    }

    public static void main(String[] args) {
        int a = 5;
        change(a); // a value will not chnge
        System.out.println(a);
    }

}