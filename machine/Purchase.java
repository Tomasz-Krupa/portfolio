package machine;

import java.util.Scanner;

public class Purchase {


    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        Scanner scanner = new Scanner(System.in);
        int coffeeType = scanner.nextInt();
        switch (coffeeType) {
            case 1:
                IndregientsState.cupsInside -= 1;
                IndregientsState.waterInside -= 250;
                IndregientsState.coffeeInside -= 16;
                IndregientsState.moneyInside += 4;
                break;
            case 2:
                IndregientsState.cupsInside -= 1;
                IndregientsState.waterInside -= 350;
                IndregientsState.milkInside -= 75;
                IndregientsState.coffeeInside -= 20;
                IndregientsState.moneyInside += 7;
                break;
            case 3:
                IndregientsState.cupsInside -= 1;
                IndregientsState.waterInside -= 200;
                IndregientsState.milkInside -= 100;
                IndregientsState.coffeeInside -= 12;
                IndregientsState.moneyInside += 6;
                break;
        }

        scanner.close();

    }
}
