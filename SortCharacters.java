package Java_Assignments;
import java.util.*;
public class SortCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        char[] c = s.toCharArray();
        Arrays.sort(c);

        System.out.println("Sorted: " + new String(c));
	}

}
