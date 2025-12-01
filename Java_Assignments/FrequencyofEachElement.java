package Java_Assignments;
import java.util.*;
public class FrequencyofEachElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Map<Integer, Integer> freq = new HashMap<>();

        for (int x : arr)
            freq.put(x, freq.getOrDefault(x, 0) + 1);

        System.out.println(freq);


	}

}
