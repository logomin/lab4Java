package ua.zp.brainacad;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        String s = scanner.nextLine();
        int n = Integer.parseInt(s);
        System.out.println("Выводим каждое третье целое число");
        for (int i = 0; i < n; i++) {
            if ((i % 3) == 0){
                System.out.println(i);
            }
        }
    }
}
