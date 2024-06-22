import java.util.Scanner;

interface Cal {
    void add(int a, int b);
    void subtract(int a, int b);
    void multiply(int a, int b);
    void divide(int a, int b);
}

class A implements Cal {
    @Override
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    @Override
    public void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    @Override
    public void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    @Override
    public void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        A obj = new A();
        obj.add(a, b);
        obj.subtract(a, b);
        obj.multiply(a, b);
        obj.divide(a, b);
        scanner.close();
    }
}
