import java.util.Scanner;

public class LabTask9 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input: ");
        String str = input.nextLine();
        
        int firstIndex = str.indexOf('h');
        int lastIndex = str.lastIndexOf('h');
        
        String start = str.substring(0, firstIndex + 1);  
        String middle = str.substring(firstIndex + 1, lastIndex);
        String end = str.substring(lastIndex); 
        
        middle = middle.replace('h', 'H');
        
        String result = start + middle + end;
        
        System.out.println("Correct Answer: " + result);
        
        input.close();
    } 
}
