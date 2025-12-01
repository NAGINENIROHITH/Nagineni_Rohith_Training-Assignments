package Java_Assignments;
import java.util.*;
public class RemoveDuplicateElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int x : arr) set.add(x);

        System.out.println(set);

	}

}
