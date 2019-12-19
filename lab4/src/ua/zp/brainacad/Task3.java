package ua.zp.brainacad;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели с маленькой буквы");
        String s = scanner.nextLine();
        switch (s){
            case "понедельник":
            case "вторник":
            case "среда":
            case "четверг":
            case "пятница":
                System.out.println("Это рабочий день");
                break;
            case "суббота" :
            case "воскресенье" :
                System.out.println("Это выходной день");
                break;
            default:
                System.out.println("Ошибка ввода");
        }
    }
}
