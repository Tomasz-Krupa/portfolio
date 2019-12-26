package machine;

import java.util.Scanner;
import static machine.IngredientsState.*;


public class Filling {
    public static void fill() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Write how many ml of water do you want to add:");
            waterInside += scanner.nextInt();
            System.out.println("Write how many ml of milk do you want to add:");
            milkInside += scanner.nextInt();
            System.out.println("Write how many grams of coffee beans do you want to add:");
            coffeeInside += scanner.nextInt();
            System.out.println("Write how many many disposable cups of coffees do you want to add:");
            cupsInside += scanner.nextInt();

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}

