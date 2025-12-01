package Java_Assignments;
import java.util.*;
public class CompareStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        System.out.println("Equals: " + a.equals(b));
        System.out.println("compareTo result: " + a.compareTo(b));
	}

}
