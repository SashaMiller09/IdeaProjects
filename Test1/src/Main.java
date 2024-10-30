import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите температуру тела: ");
        if (scanner.hasNextDouble()) {
            double temperature = scanner.nextDouble();

            isHigh = temperature > 37.5;
            isLow = temperature < 36.0;


            if (isHigh) {
                System.out.println("Температура тела высокая.");
            } else if (isLow) {
                System.out.println("Температура тела низкая.");
            } else {
                System.out.println("Температура тела нормальная.");
            }
        } else {
            System.out.println("Ошибка ввода. Введите корректное числовое значение температуры.");
        }
    }
}


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


