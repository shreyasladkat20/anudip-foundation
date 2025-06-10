import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextLine();
        int original = num;
        int reversed = 0;

        // Outer loop just once, to demonstrate nesting
        for (int i = 0; i < 1; i++) {
            // Inner loop to reverse the number
            for (; num > 0; num = num / 10) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
            }
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        
    }
}
