import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " четное");
        } else {
            System.out.println("Число " + number + " нечетное");
        }
    }
}
