import java.util.Random;

public class Ex_2_3 {

    // Найти ошибки и исправить:

    // №2
    public static void ex_2() {
        Random random = new Random();
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(15);
        }
        try {
             int d;
             d = random.nextInt(2);
             int catchedRes1 = intArray[8] / d;
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        finally {
            System.out.println("Деление завершено");
        }
    }

    // №3
    public static void ex_3(){
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }catch (IndexOutOfBoundsException ex) {
            System.out.println("Ошибка: массив выходит за пределы своего размера! " + ex.getMessage());
        }catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
