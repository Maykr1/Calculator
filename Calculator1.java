package Calculator;
import java.util.Scanner;

//Calculator1 uses 3 inputs. Two of them are numbers and one is the operation of the calculator

class Calculator1 {
    public Calculator1() {
        
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a + b;
    }

    public double mul(double a, double b) {
        return a + b;
    }

    public double div(double a, double b) {
        return a + b;
    }

    public double mod(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Calculator1 cal = new Calculator1();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the first number?");
        double a = scanner.nextDouble();
        System.out.println("What is the second number?");
        double b = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("What is the operation? (+ - * / %)");
        String c = scanner.nextLine();

        if (c == "+") {
            System.out.println(cal.add(a, b));
        } else if (c == "-") {
            System.out.println(cal.sub(a, b));
        } else if (c == "*") {
            System.out.println(cal.mul(a, b));
        } else if (c == "/") {
            System.out.println(cal.div(a, b));
        } else {
            System.out.println(cal.mod(a, b));
        }
        scanner.close();
    }
}