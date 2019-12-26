package machine;

import java.util.Scanner;

import static machine.IngredientsState.*;

public class Purchase {

    static final int waterPerEspresso = 250;
    static final int coffeePerEspresso = 16;
    static final int moneyPerEspresso = 4;
    static final int waterPerLatte = 350;
    static final int milkPerLatte = 75;
    static final int coffeePerLatte = 20;
    static final int moneyPerLatte = 7;
    static final int waterPerCappuccino = 200;
    static final int milkPerCappuccino = 100;
    static final int coffeePerCappuccino = 12;
    static final int moneyPerCappuccino = 6;
    public static boolean cannotMakeEspresso() { return (cupsInside < 1 || waterInside < waterPerEspresso || coffeeInside < coffeePerEspresso);}
    public static boolean cannotMakeLatte(){return  (cupsInside < 1 || waterInside < waterPerLatte || milkInside < milkPerLatte || coffeeInside < coffeePerLatte);}
    public static boolean cannotMakeCapuccino() {return  (cupsInside < 1 || waterInside < waterPerCappuccino || milkInside < milkPerCappuccino || coffeeInside < coffeePerCappuccino);}

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        Scanner scanner = new Scanner(System.in);
        String coffeeType = scanner.nextLine();
        switch (coffeeType) {
            case "1": {
                if (cannotMakeEspresso()) {
                    String lackingResource;
                    if (cupsInside < 1) {
                        lackingResource = "cups";
                    } else if (waterInside < waterPerEspresso) {
                        lackingResource = "water";
                    } else {
                        lackingResource = "coffee";
                    }
                    System.out.println("Sorry, not enough " + lackingResource + "!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    cupsInside --;
                    waterInside -= waterPerEspresso;
                    coffeeInside -= coffeePerEspresso;
                    moneyInside += moneyPerEspresso;
                }
                break;
            }
            case "2": {
                if (cannotMakeLatte()) {
                    String lackingResource;
                    if (cupsInside < 1) {
                        lackingResource = "cups";
                    } else if (waterInside < waterPerLatte) {
                        lackingResource = "water";
                    } else if (milkInside < milkPerLatte) {
                        lackingResource = "milk";
                    } else {
                        lackingResource = "coffee";
                    }
                    System.out.println("Sorry, not enough " + lackingResource + "!");

                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    cupsInside --;
                    waterInside -= waterPerLatte;
                    milkInside -= milkPerLatte;
                    coffeeInside -= coffeePerLatte;
                    moneyInside += moneyPerLatte;
                }
                break;
            }
            case "3": {
                if (cannotMakeCapuccino()) {
                    String lackingResource;
                    if (cupsInside < 1) {
                        lackingResource = "cups";
                    } else if (waterInside < waterPerCappuccino) {
                        lackingResource = "water";
                    } else if (milkInside < milkPerCappuccino) {
                        lackingResource = "milk";
                    } else {
                        lackingResource = "coffee";
                    }
                    System.out.println("Sorry, not enough " + lackingResource + "!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    cupsInside --;
                    waterInside -= waterPerCappuccino;
                    milkInside -= milkPerCappuccino;
                    coffeeInside -= coffeePerCappuccino;
                    moneyInside += moneyPerCappuccino;
                }
                break;
            }
            case "back": {
                break;}

        }

    }
}
