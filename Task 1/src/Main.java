import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        a = inputDouble();
        b = inputDouble();

        System.out.println(sum());      //Метод суммирования чисел
        System.out.println(multiply()); //Метод умножения чисел
        System.out.println(diff());     //Метод вычитания чисел
        System.out.println(divide());   //Метод деления чисел
    }

    private static double divide() {
        return a / b;
    }

    private static double diff() {
        return a - b;
    }

    private static double multiply() {
        return a * b;
    }

    private static double sum() {
        return a + b;
    }

    private static double inputDouble() {
        return new Scanner(System.in).nextDouble();
    }
}
