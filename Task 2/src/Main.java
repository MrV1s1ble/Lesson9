import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        greeting();
        evenNumber(inputNumber());
    }

    private static void greeting() {
        System.out.println("Введите число:");
    }

    private static int inputNumber() {
        return new Scanner(System.in).nextInt();
    }
    private static void evenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("Ваше число четное.");
        } else {
            System.out.println("Ваше число нечетное.");
        }
    }
}
