public class Q03_MultipleCatch {
    public static void main(String[] args) {

        try {
            int[] numbers = {10, 20, 30};

            int result = numbers[5] / 0;

            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range.");

        } catch (Exception e) {
            System.out.println("Some other error occurred.");
        }
    }
}