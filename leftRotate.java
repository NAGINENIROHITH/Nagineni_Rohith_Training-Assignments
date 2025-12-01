package Java_Assignments;
import java.util.*;
public class leftRotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter number of rotations: ");
        int r = sc.nextInt();
        r = r % n;

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++)
            rotated[i] = arr[(i + r) % n];

        System.out.println(Arrays.toString(rotated));

	}

}
