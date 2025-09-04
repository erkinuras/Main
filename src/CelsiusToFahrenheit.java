import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write tepm in C");
        double celsius = scanner.nextDouble();

        double fehrenheit = celsius * 9 / 5 + 32;

        System.out.println("Temp in Feh is " + fehrenheit);
    }
}
