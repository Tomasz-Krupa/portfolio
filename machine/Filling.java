package machine;

import java.util.Scanner;

public class Filling {
    public static void fill() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Write how many ml of water do you want to add:");
            IndregientsState.waterInside += scanner.nextInt();
            System.out.println("Write how many ml of milk do you want to add:");
            IndregientsState.milkInside += scanner.nextInt();
            System.out.println("Write how many grams of coffee beans do you want to add:");
            IndregientsState.coffeeInside += scanner.nextInt();
            System.out.println("Write how many many disposable cups of coffees do you want to add:");
            IndregientsState.cupsInside += scanner.nextInt();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        scanner.close();
    }

    }

