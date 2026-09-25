import java.util.HashMap;

public class Q02_HashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Shivam");
        students.put(102, "Rahul");
        students.put(103, "Aman");
        students.put(104, "Ankit");

        System.out.println("Student Details:");

        for (Integer roll : students.keySet()) {
            System.out.println("Roll No: " + roll +
                               ", Name: " + students.get(roll));
        }
    }
}