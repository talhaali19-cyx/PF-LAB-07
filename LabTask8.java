import java.util.Scanner;

public class LabTask8 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input: ");
        String str = input.nextLine();
        
        int firstIndex = str.indexOf('h');
        int lastIndex = str.lastIndexOf('h');
        
        String result = str.substring(0, firstIndex) + str.substring(lastIndex + 1);
        
        System.out.println("Correct Answer: " + result);
        
        input.close();
    } 
}
