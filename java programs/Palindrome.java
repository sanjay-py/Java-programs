// naive approach

public class Palindrome{

    public static boolean isPalindrome(String s) {
        
        // initializng an empty string to store the reversed stirng..
        String rev="";
        boolean ans=false;  
        for (int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        if(s.equals(rev)){
            return true;
        }

        return ans;
    }

    public static void main(String[] args) {
        String str="geek";

        boolean a=isPalindrome(str);
        System.out.println(a);
    }
}



// import java.util.Scanner;

// public class Palindrome {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter a string:");
//         String str=sc.next();

//         Palindrome p=new Palindrome();
//         if (isPalindrome(str)) {
//             System.out.println(str+" is a Palindrome.");
//         } else {
//             System.out.println(str+" is not a Palindrome.");
//         }
//     }

//     public static boolean isPalindrome(String s) {

//         int l=0;
//         int h= s.length()-1;

//         while (l<h) {
//             if (s.charAt(l) != s.charAt(h))
//                 return false;

//                 l++;
//                 h--;
//         }

//         return true;
//     }
// }


