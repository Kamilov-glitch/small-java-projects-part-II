package application;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }

            // implement the functionality here
            int i = 0;
            if (command.equals("1")) {
                database.list().forEach(t -> System.out.println(t));
            }
            
            if (command.equals("2")) {
                i+=1;
                database.add(askTodo(scanner, i));
            }
            
            if (command.equals("3")) {
                markAsDone();
            }
            
            if (command.equals("4")) {
                System.out.println("Which todo should be removed (give the id)?");
                int id = Integer.valueOf(scanner.nextLine());
                database.remove(id);
            }
            
        }

        System.out.println("Thank you!");
    }
    
    public Todo askTodo(Scanner scanner, int id) {
        System.out.println("Adding a new todo");
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter description");
        String description = scanner.nextLine();
        Todo todo = new Todo(id, name, description, false);
        return todo;
    }
    
    public void markAsDone() throws SQLException {
        System.out.println("Which todo should be marked as done (give the id)?");
        int id = Integer.valueOf(this.scanner.nextLine());
        database.markAsDone(id);
    }
}
