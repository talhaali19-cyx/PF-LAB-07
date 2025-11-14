public class LabTask4 {
        public static void main(String[] args){ 
        int randomIndex = (int)(Math.random() * 26); 
        char randomLetter = (char)('A' + randomIndex); 
        
        System.out.println("Random uppercase letter: " + randomLetter);
    }
}
