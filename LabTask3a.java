import java.util.*;

public class LabTask3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = sc.nextInt();

        
        if (decimal < 0 || decimal > 15) {
            System.out.println(decimal + " is an invalid input");
        } else {
            // Convert to hex
            String hex = Integer.toHexString(decimal).toUpperCase();
            System.out.println("The hex value is " + hex);
        }
    }
}
