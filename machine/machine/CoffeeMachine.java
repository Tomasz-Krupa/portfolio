package machine;

import java.util.Scanner;

/**
 * Class simulating work of coffee selling machine
 */
public class CoffeeMachine {
    static boolean exit = false;
    private String action;

    static void makeMainMethod(CoffeeMachine coffeeMachine) {
        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            coffeeMachine.setAction(scanner.nextLine());
            switch (coffeeMachine.action) {
                case "buy": {
                    Purchase.buyDrink();
                    break;
                }
                case "fill": {
                    Filling.fill();
                    break;
                }
                case "take": {
                    MoneyOperation.take();
                    break;
                }
                case "remaining": {
                    IngredientsState.showResources();
                    break;
                }
                case "exit": {
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("You can only choose buy, fill, take, remaining, exit. Try again.");
                    break;
                }
            }
        }
        scanner.close();
    }

    public void setAction(String action) {
        this.action = action;
    }
}
