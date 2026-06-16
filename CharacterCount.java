import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            }
            else if (Character.isLowerCase(ch)) {
                lower++;
            }
            else if (Character.isDigit(ch)) {
                digit++;
            }
            else if (!Character.isWhitespace(ch)) {
                special++;
            }
        }

        System.out.println("Uppercase Letters: " + upper);
        System.out.println("Lower Case Letter: " + lower);
        System.out.println("Digits: " + digit);
        System.out.println("Special Characters: " + special);

        sc.close();
    }
}