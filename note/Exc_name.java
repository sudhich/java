public class Exc_name {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 20;
        } catch (ArrayIndexOutOfBoundsException error_name) {
            System.out.println("Arithmetic Exception: " + error_name);
        
    }
    }
}