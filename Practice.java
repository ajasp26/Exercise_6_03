
package practice;
import java.util.*;

/**
 *
 * @author alexjasper
 */
public class Practice {
   
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
     
     
     if(!isPalindrome(a)){
         System.out.println("Number is not a palindrome.");
         
     }
     else
            System.out.println("Number is a palindrome.");
        
        
  }
    
    public static boolean isPalindrome(int a){
        return a == reverse(a) ? true : false;
    }
 
    public static int reverse(int a){
        
        String reverse = ""; 	// Holds reversed number
        String b = a + ""; // Convert number to string
	
        // Reverse string
	for (int i = b.length() - 1; i >= 0; i--) {
            reverse += b.charAt(i);
	}
	return Integer.parseInt(reverse); // Return reversed integer
	}
    
    }
    
        
       
    
    

