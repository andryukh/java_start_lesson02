import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        Scanner scanner = new Scanner(System.in);

        int operation = scanner.nextInt();

        System.out.println("Введите первое число:");
        float a = scanner.nextInt();
        float b;
        do {
            System.out.println("Введите второе число:");
            b = scanner.nextInt();
            if (b == 0) {
                System.out.println("На ноль нельзя делить!!1");
            }
        } while (b == 0);
        float result;

        if (operation == 1) {
            result = a + b;
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 3) {
            result = a * b;
        } else {
            result = a / b;
        }

        System.out.println("Результат = " + result);
    }
}