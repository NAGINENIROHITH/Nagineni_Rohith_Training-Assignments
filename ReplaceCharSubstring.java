package Java_Assignments;
import java.util.*;
public class ReplaceCharSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Replace: ");
        String old = sc.nextLine();

        System.out.print("With: ");
        String newstr = sc.nextLine();

        System.out.println("Result: " + s.replace(old, newstr));
	}

}
