import java.util.Scanner;

public class Calculator { 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        System.out.println("Enter your choice:");
        int a=sc.nextInt();

        switch (a) {
            case 1: System.out.println(x+y);
            break;

            case 2: System.out.println(x-y);
            break;

            case 3: System.out.println(x*y);
            break;

            case 4: System.out.println(x/y);
            break;

            case 5: System.out.println(x%y);
            break;

        
            default: System.out.println("Inalid input");
                break;
        }
    }
}
