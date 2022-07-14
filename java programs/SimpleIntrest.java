import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter p, t and r:");

        int p = sc.nextInt();
        int t = sc.nextInt();
        float r = sc.nextFloat();

        float si = (p * t * r) / 100;
        System.out.println("Simple Intrest: "+si);
    }
}
