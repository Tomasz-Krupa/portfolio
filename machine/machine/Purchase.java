package machine;

import machine.drinks.Cappuccino;
import machine.drinks.Drink;
import machine.drinks.Espresso;
import machine.drinks.Latte;

import java.util.Scanner;

import static machine.IngredientsState.*;

public class Purchase {
    /**
     * Method checking if a drink can be made because of the machine resources
     */
    public static boolean cannotMakeDrink(Drink drink) {
        return (cupsInside < 1 || waterInside < drink.waterNeeded() || milkInside < drink.milkNeeded() || coffeeInside < drink.coffeeBeansNeeded());
    }

    /**
     * Method choosing what kind of drink is ordered, using polymorphism - all kinds of coffee inherit from the Drink interface
     */
    public static void buyDrink() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        Scanner scanner = new Scanner(System.in);
        String drinkType = scanner.nextLine();
        switch (drinkType) {
            case "1": {
                makeDrink(new Espresso());
                break;
            }
            case "2": {
                makeDrink(new Latte());
                break;
            }
            case "3": {
                makeDrink(new Cappuccino());
                break;
            }
            case "back": {
                break;
            }
        }
    }
/**
* Method setting a lacking resource if a drink cannot be made or updating resources state if the drink is to be made
 */
    private static void makeDrink(Drink drink) {
        if (cannotMakeDrink(drink)) {
            String lackingResource;
            if (cupsInside < 1) {
                lackingResource = "cups";
            } else if (waterInside < drink.waterNeeded()) {
                lackingResource = "water";
            } else if (milkInside < drink.milkNeeded()) {
                lackingResource = "water";
            } else {
                lackingResource = "coffee";
            }
            System.out.println("Sorry, not enough " + lackingResource + "!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            cupsInside--;
            waterInside -= drink.waterNeeded();
            coffeeInside -= drink.coffeeBeansNeeded();
            moneyInside += drink.price();
        }
    }
}
