package Java_Assignments;
import java.util.*;
public class RemoveDupCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        boolean[] seen = new boolean[256];
        String result = "";

        for (char c : s.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result += c;
            }
        }

        System.out.println("After removing duplicates: " + result);
	}

}
