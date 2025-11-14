import java.util.Scanner;

public class LabTask6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input: ");
        String str = input.nextLine();
        
        String[] words = str.split(" "); 
        
        String swapped = words[1] + " " + words[0];
        System.out.println("Correct Answer: " + swapped);
        
        input.close();
    }
}
