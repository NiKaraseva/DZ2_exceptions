import java.util.Scanner;

public class Ex_1 {

    /* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float) и возвращает введенное значение.
    Ввод текста вместо числа не должно приводить к падению приложения, вместо этого
    необходимо повторно запросить у пользователя ввод данных.
     */

    public static float checkFloat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите дробное число: ");
            String a = scanner.nextLine();
            try {
                return Float.parseFloat(a);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не дробное число, попробуйте ещё раз! " + e.getMessage());
            }
        }
    }
}
