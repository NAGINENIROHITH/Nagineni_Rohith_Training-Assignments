package Java_Assignments;
import java.util.*;
public class FrequencyChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        int count = 0;
        for (char c : s.toCharArray())
            if (c == ch) count++;

        System.out.println("Frequency: " + count);
	}

}
