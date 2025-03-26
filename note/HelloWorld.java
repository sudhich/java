// Your First Program

class HelloWorld {
    public static void main(String[] args) { 
        try {
        int a = 10;
        int b=0;
        int sum=a/b; // This will cause ArithmeticException
        System.out.println(sum);
        } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero!");
        }
        finally {
        System.out.println("This will always execute.");
        }
    }
}