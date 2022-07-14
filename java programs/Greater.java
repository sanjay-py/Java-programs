import java.util.*;
public class Greater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        if(x==y){
            System.out.println("equal");
        }
        else if(x>y){
            System.out.println("X is grater");
        }
        else{
            System.out.println("y is greater");
        }
    }

}
