/*
 * Project: Scientific Calculator (Command Line)
 * Author: Anhal Nasser
 * Date: July 2025
 * Description: A Java-based scientific calculator with basic and scientific operations.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class ScientificCalculator {

    // 🖊️ Created by Anhal Nasser - Entry point of the calculator program
    public static void main(String[] args) {
        System.out.println("🔬 Scientific Calculator by Anhal Nasser - Ready to use!");
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            displayMenu();
            System.out.print("➤ Choose an option: ");

            int choice = -1;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Invalid input! Please enter a number.");
                scanner.nextLine(); // clear the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    performAddition(scanner);
                    break;
                case 2:
                    performSubtraction(scanner);
                    break;
                case 3:
                    performMultiplication(scanner);
                    break;
                case 4:
                    performDivision(scanner);
                    break;
                case 5:
                    performSquareRoot(scanner);
                    break;
                case 6:
                    performPower(scanner);
                    break;
                case 7:
                    performSin(scanner);
                    break;
                case 8:
                    performCos(scanner);
                    break;
                case 9:
                    performTan(scanner);
                    break;
                case 10:
                    performLog10(scanner);
                    break;
                case 11:
                    performLn(scanner);
                    break;
                case 12:
                    performAbs(scanner);
                    break;
                case 13:
                    performCeil(scanner);
                    break;
                case 14:
                    performFloor(scanner);
                    break;
                case 15:
                    performMin(scanner);
                    break;
                case 16:
                    performMax(scanner);
                    break;
                case 0:
                    keepRunning = false;
                    System.out.println("👋 Exiting calculator. Goodbye!");
                    break;
                default:
                    System.out.println("❌ Invalid option. Try again.");
            }
        }

        scanner.close();
    }

    // 🖊️ Created by Anhal Nasser - Displays the main menu options to the user
    public static void displayMenu() {
        System.out.println("\n===== 📐 Scientific Calculator Menu =====");
        System.out.println("1. ➕ Add");
        System.out.println("2. ➖ Subtract");
        System.out.println("3. ✖️ Multiply");
        System.out.println("4. ➗ Divide");
        System.out.println("5. √ Square Root");
        System.out.println("6. x^y Power");
        System.out.println("7. sin");
        System.out.println("8. cos");
        System.out.println("9. tan");
        System.out.println("10. log10");
        System.out.println("11. ln (natural log)");
        System.out.println("12. |x| Absolute value");
        System.out.println("13. ceil (round up)");
        System.out.println("14. floor (round down)");
        System.out.println("15. min");
        System.out.println("16. max");
        System.out.println("0. ❌ Exit");
        System.out.println("========================================");
    }

    // 🖊️ Created by Anhal Nasser - Basic arithmetic operations
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    // 🧮 Created by Anhal - square root function
    public static double squareRoot(double number) {
    return Math.sqrt(number);
}

    // 🧮 Created by Anhal - Power function
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    // 🧮 Created by Anhal - sin function
    public static double sin(double a) {
        return Math.sin(Math.toRadians(a));
    }
    // 🧮 Created by Anhal - cos function
    public static double cos(double a) {
        return Math.cos(Math.toRadians(a));
    }
    // 🧮 Created by Anhal - ten function
    public static double tan(double a) {
        return Math.tan(Math.toRadians(a));
    }
    // 🧮 Created by Anhal - log10 function
    public static double log10(double a) {
        return Math.log10(a);
    }
    // 🧮 Created by Anhal - In function
    public static double ln(double a) {
        return Math.log(a);
    }
    // 🧮 Created by Anhal - abs function
    public static double abs(double a) {
        return Math.abs(a);
    }

    public static double ceil(double a) {
        return Math.ceil(a);
    }
    // 🧮 Created by Anhal - abs function
    public static double floor(double a) {
        return Math.floor(a);
    }

    public static double min(double a, double b) {
        return Math.min(a, b);
    }

    public static double max(double a, double b) {
        return Math.max(a, b);
    }

    // 🖊️ Created by Anhal Nasser - User interaction for each operation

    public static void performAddition(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = add(num1, num2);
            System.out.println("✅ Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: Please enter valid numbers!");
            scanner.nextLine();
        }
    }

    public static void performSubtraction(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = subtract(num1, num2);
            System.out.println("✅ Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: Please enter valid numbers!");
            scanner.nextLine();
        }
    }

    public static void performMultiplication(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = multiply(num1, num2);
            System.out.println("✅ Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: Please enter valid numbers!");
            scanner.nextLine();
        }
    }

    public static void performDivision(Scanner scanner) {
        try {
            System.out.print("Enter numerator: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter denominator: ");
            double num2 = scanner.nextDouble();

            if (num2 == 0) {
                System.out.println("🚫 Error: Cannot divide by zero!");
                return;
            }

            double result = divide(num1, num2);
            System.out.println("✅ Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: Please enter valid numbers!");
            scanner.nextLine();
        }
    }

    public static void performSquareRoot(Scanner scanner) {
        try {
            System.out.print("Enter number (≥ 0): ");
            double num = scanner.nextDouble();
            if (num < 0) {
                System.out.println("🚫 Error: Number must be non-negative!");
                return;
            }
            double result = squareRoot(num);
            System.out.println("✅ Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: Please enter a valid number!");
            scanner.nextLine();
        }
    }

    public static void performPower(Scanner scanner) {
        try {
            System.out.print("Enter base: ");
            double base = scanner.nextDouble();

            System.out.print("Enter exponent: ");
            double exponent = scanner.nextDouble();

            double result = power(base, exponent);
            System.out.println("✅ Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: Please enter valid numbers!");
            scanner.nextLine();
        }
    }

    public static void performSin(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double angle = scanner.nextDouble();

            double result = sin(angle);
            System.out.println("✅ Result (sin): " + result);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: Please enter a valid angle!");
            scanner.nextLine();
        }
    }

    public static void performCos(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double angle = scanner.nextDouble();

            double result = cos(angle);
            System.out.println("✅ Result (cos): " + result);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: Please enter a valid angle!");
            scanner.nextLine();
        }
    }

    public static void performTan(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double angle = scanner.nextDouble();

            double result = tan(angle);
            System.out.println("✅ Result (tan): " + result);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: Please enter a valid angle!");
            scanner.nextLine();
        }
    }

    public static void performLog10(Scanner scanner) {
        try {
            System.out.print("Enter number (> 0): ");
            double num = scanner.nextDouble();
            if (num <= 0) {
                System.out.println("🚫 Error: Number must be positive!");
                return;
            }
            double result = log10(num);
            System.out.println("✅ Result (log10): " + result);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: Please enter a valid number!");
            scanner.nextLine();
        }
    }

    public static void performLn(Scanner scanner) {
        try {
            System.out.print("Enter number (> 0): ");
            double num = scanner.nextDouble();
            if (num <= 0) {
                System.out.println("🚫 Error: Number must be positive!");
                return;
            }
            double result = ln(num);
            System.out.println("✅ Result (ln): " + result);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: Please enter a valid number!");
            scanner.nextLine();
        }
    }

    public static void performAbs(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();

            double result = abs(num);
            System.out.println("✅ Result (abs): " + result);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: Please enter a valid number!");
            scanner.nextLine();
        }
    }

    public static void performCeil(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();

            double result = ceil(num);
            System.out.println("✅ Result (ceil): " + result);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: Please enter a valid number!");
            scanner.nextLine();
        }
    }

    public static void performFloor(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();

            double result = floor(num);
            System.out.println("✅ Result (floor): " + result);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: Please enter a valid number!");
            scanner.nextLine();
        }
    }

    public static void performMin(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = min(num1, num2);
            System.out.println("✅ Result (min): " + result);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: Please enter valid numbers!");
            scanner.nextLine();
        }
    }

    public static void performMax(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = max(num1, num2);
            System.out.println("✅ Result (max): " + result);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: Please enter valid numbers!");
            scanner.nextLine();
        }
    }
}
