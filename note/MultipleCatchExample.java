public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
            int[] arr = new int[5];
            arr[10] = 20;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception: " + e);
        } catch (Exception e) {
            System.out.println("General Exception: " + e);
        }
    }
}