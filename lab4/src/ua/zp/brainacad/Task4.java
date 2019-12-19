package ua.zp.brainacad;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        String s = scanner.nextLine();
        int n = Integer.parseInt(s), res = 1;
        System.out.println("Считаем факториал");
        for (int i = 1; i <= n; i++) {
            if (res > 1000){
                System.out.println("Достигнут максимально возможный результат");
                break;
            }
            res = res * i;
            System.out.println(res);
        }
    }
}
