import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // float num=sc.nextFloat();
        // System.out.println(num);


        // type casting
        // int num = (int) (66.57f);
        // System.out.println(num);

        // automatic type promotion in expressions
        // int a = 260;
        // byte b = (byte) (a); // 260 % 256 = 4
        // System.out.println(b);


        // byte a= 40;
        // byte b= 50;
        // byte c= 100;
        // int d= (a*b) / c;
        // System.out.println(d);


        // java works on inocode values
        // int num = 'A';
        // System.out.println(num);


        // System.out.println(6 * 5.3);


        byte b=45;
        char c= 'a';
        short s = 1024;
        int i = 500000;
        float f = 5.76f;
        double d = 0.2134;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double 
        // [ double is greater of all data types......]
        System.out.println((f * b) + "  " + (i / c)  + "  " + (d * s));
        System.out.println(result);



    }
}
