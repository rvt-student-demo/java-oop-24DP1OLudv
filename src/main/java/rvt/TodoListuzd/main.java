package rvt.TodoListuzd;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        todolist list = new todolist();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
    }
}
