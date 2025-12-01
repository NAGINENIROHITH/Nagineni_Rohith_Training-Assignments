package Java_Assignments;
import java.util.*;
public class CountWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String[] words = s.trim().split("\\s+");

        System.out.println("Word Count: " + words.length);
	}

}
