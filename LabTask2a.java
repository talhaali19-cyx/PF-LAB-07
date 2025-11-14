import java.util.Scanner;

public class LabTask2a {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an ASCII code: ");
        int asciiCode = in.nextInt();
        
        
        if (asciiCode >= 0 && asciiCode <= 127) {
            char character = (char) asciiCode;
            System.out.println("The character for ASCII code " + asciiCode + " is " + character);
        } else {
            System.out.println("Invalid ASCII code! Enter a number between 0 and 127.");
        }
    in.close();
}
}
