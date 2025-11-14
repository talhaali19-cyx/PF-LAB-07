import java.util.*;

public class LabTask3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String input = sc.next().toUpperCase();

        
        if (input.length() != 1 || !input.matches("[0-9A-F]")) {
            System.out.println(input + " is an invalid input");
        } 
	else {
            
            int decimalValue = Integer.parseInt(input, 16);
            String binary = Integer.toBinaryString(decimalValue);
            System.out.println("The binary value is " + binary);
        }
    }
}
