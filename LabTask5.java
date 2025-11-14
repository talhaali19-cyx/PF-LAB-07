import java.util.Scanner;

public class LabTask5 {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        
        String original = str.toLowerCase();
        String reversed = "";
        
        
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        
        if (original.equals(reversed)) {
            System.out.println(str + " is a palindrome");
        }
	else {
            System.out.println(str + " is not a palindrome");
        }
        
        input.close();
    }  
}
