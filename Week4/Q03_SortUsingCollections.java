import java.util.ArrayList;
import java.util.Collections;

public class Q03_SortUsingCollections {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Before Sorting:");
        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println("After Sorting:");
        System.out.println(numbers);
    }
}