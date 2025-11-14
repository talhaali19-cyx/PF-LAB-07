import java.util.Scanner;

public class LabTask10 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input: ");
        String str = input.nextLine();
        
        System.out.println(str.charAt(2));

        System.out.println(str.charAt(str.length() - 2));
        
        System.out.println(str.length() >= 5 ? str.substring(0, 5) : str);
        
        System.out.println(str.length() > 2 ? str.substring(0, str.length() - 2) : "");
        
        StringBuilder evenChars = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            evenChars.append(str.charAt(i));
        }
        System.out.println(evenChars);
        
        StringBuilder oddChars = new StringBuilder();
        for (int i = 1; i < str.length(); i += 2) {
            oddChars.append(str.charAt(i));
        }
        System.out.println(oddChars);
        
        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println(reversed);
        
        StringBuilder reverseEverySecond = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i -= 2) {
            reverseEverySecond.append(str.charAt(i));
        }
        System.out.println(reverseEverySecond);
        
        System.out.println(str.length());
        
        input.close();
    }  
}
