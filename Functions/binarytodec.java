package Functions;

public class binarytodec {
    public static void binarytodec(int binarynum){
       int mynum = binarynum;
        int power = 0;
       int decnum = 0;

       while (binarynum>0){
        int lastdigit = binarynum % 10;
        decnum = decnum +(lastdigit * (int) Math.pow(2, power));
        power = power+1;
        binarynum= binarynum/10;
        }
        System.out.println("the decimal of " + mynum + " = " + decnum);

    }
    public static void main(String[] args) {
        binarytodec(32);
    }
}
