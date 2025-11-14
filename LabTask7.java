import java.util.Scanner;

public class LabTask7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input: ");
        String str = input.nextLine();
        
        int firstIndex = str.indexOf('f');
        int lastIndex = str.lastIndexOf('f');
        
        if (firstIndex != -1) {
            System.out.println(firstIndex + (firstIndex != lastIndex ? " " + lastIndex : ""));
        }
        
        input.close();
    }
}
