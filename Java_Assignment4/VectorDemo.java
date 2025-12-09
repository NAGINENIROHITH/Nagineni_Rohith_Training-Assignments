package Java_Assignment4;
import java.util.Vector;
public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();

        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Mango");

        // Insert at index
        vector.add(1, "Orange");

        // Display Vector
        System.out.println("Vector Elements: " + vector);

        // Access element
        System.out.println("Element at index 2: " + vector.get(2));

        // Remove element
        vector.remove("Banana");
        System.out.println("After Removal: " + vector);

        // Size and Capacity
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
	}

}
