package botmanager;

import java.util.Scanner;

/**
 * Handles printing and reading input from user.
 *
 * @author dwsc37
 */
public class Ui {
    private Scanner scanner;

    private void printMessageWithDividers(String message) {
        String line = "______________________________________________________________________________________";
        System.out.println(line);
        System.out.print(message.indent(2));
        System.out.println(line);
    }

    public void start() {
        String greetMessage = "Hello, I'm BotManager, your friendly task assistant!\n"
                + "What can I do for you? (Type 'help' to view all available commands)";
        printMessageWithDividers(greetMessage);
        scanner = new Scanner(System.in);
    }

    public void exit() {
        String goodbyeMessage = "Goodbye! Hope to see you again soon!";
        printMessageWithDividers(goodbyeMessage);
        scanner.close();
    }

    public void showLoadError() {
        String loadErrorMessage = "File data/tasks.txt not found! Initialising empty file...";
        printMessageWithDividers(loadErrorMessage);
    }

    public void showSaveError() {
        String saveErrorMessage = "Tasks could not be saved! Please check that the data file has not been removed";
        printMessageWithDividers(saveErrorMessage);
    }

    public void printMessage(String message) {
        printMessageWithDividers(message);
    }

    public String readUserInput() {
        return scanner.nextLine();
    }
}
