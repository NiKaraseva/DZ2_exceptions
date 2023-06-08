import java.util.Scanner;

public class Ex_4 {
    public static void checkString() {
        try {
            String finalStr = generateString();
            System.out.println("Ваша строка: " + finalStr);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Завершение обработки –––––––");
        }
    }

    public static String generateString() throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        if (str.isEmpty()) {
            throw new RuntimeException("Ошибка: нельзя вводить пустую строку!");
        } else return str;
    }
}
