package Java_Assignments;
import java.util.*;
public class CountTypes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int alpha = 0, digit = 0, special = 0;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) alpha++;
            else if (Character.isDigit(c)) digit++;
            else special++;
        }

        System.out.println("Alphabets: " + alpha);
        System.out.println("Digits: " + digit);
        System.out.println("Special Characters: " + special);

	}

}
