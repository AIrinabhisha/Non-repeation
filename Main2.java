import java.util.Scanner;

public class HashAgail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter the value: ");
        String str = sc.next(); 

        int length = str.length();

        char nonRepeatingChar = '\0'; 

        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < length; j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) { 
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                nonRepeatingChar = str.charAt(i); 
                break;
            }
        }

        if (nonRepeatingChar != '\0') {
            System.out.println("First non-repeating character is: " + nonRepeatingChar);
        } else {
            System.out.println("No non-repeating character");
        }

        sc.close(); // close the scanner
    }
}
