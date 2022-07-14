import java.util.Scanner;

public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter indian rupees:");
        float rupees=sc.nextFloat();

        float dollar= rupees / 80.01f;
        System.out.println("Value in dollars: "+dollar);
    }
}
