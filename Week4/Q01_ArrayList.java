import java.util.ArrayList;

public class Q01_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Shivam");
        students.add("Rahul");
        students.add("Aman");
        students.add("Ankit");
        students.add("Rohit");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }
    }
}