import java.util.Scanner;

public class Switching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        switch (x) {
            case 1: System.out.println("Hello");
                    break;
            
            case 2: System.out.println("Namaste");
                    break;
            
            case 3: System.out.println("Aloha");
                    break;

            default: System.out.println("Invalid input");
                break;
        }
    }
}
