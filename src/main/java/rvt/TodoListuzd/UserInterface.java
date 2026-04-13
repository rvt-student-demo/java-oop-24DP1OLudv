package rvt.TodoListuzd;
import java.util.Scanner;

public class UserInterface {
    private todolist TodoList;
    private Scanner scanner;

    public UserInterface(todolist TodoList, Scanner scanner) {
        this.TodoList = TodoList;
        this.scanner = scanner;
    }
    public void start() {
        while (true) {
            System.out.println("Ierakstiet komandu: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.println("Pievienot: ");
                String task = scanner.nextLine();
                TodoList.add(task);
            }

            if (command.equals("list")) {
                TodoList.print();
            }

            if (command.equals("remove")) {
                System.out.println("Ko vēlies izdzēst: ");
                int number = Integer.valueOf(scanner.nextLine());
                TodoList.remove(number);
            }
        }
    }

}