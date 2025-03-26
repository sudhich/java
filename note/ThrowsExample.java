import java.io.IOException;

public class ThrowsExample {
    static void checkFile() throws ArithmeticException {
        throw new ArithmeticException("File not found");
    }

    public static void main(String[] args) {
        try {
            checkFile();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
