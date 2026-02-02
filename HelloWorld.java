// public class HelloWorld {
//    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//    }
//}

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        try {

            System.setOut(new PrintStream(System.out, true, "UTF-8"));

            try (Scanner scanner = new Scanner(System.in, "UTF-8");
                 PrintWriter writer = new PrintWriter("user_data.txt", "UTF-8")) {
                
                System.out.print("Введіть ваше ім'я: ");
                String name = scanner.nextLine();
                
                System.out.print("Введіть ваш вік: ");
                int age = scanner.nextInt();
                
                writer.println("Ім'я: " + name + " Вік: " + age);
                System.out.println("Дані успішно збережено у файл user_data.txt");
            }
        } catch (IOException e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}