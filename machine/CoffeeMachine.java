package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        IndregientsState.showResources();

        System.out.println("Write action (buy, fill, take): \n");
        Scanner scanner=new Scanner(System.in);
        String action = scanner.next();
        switch (action){
            case "buy":
                Purchase.buy();
                break;
            case "fill":
                Filling.fill();
                break;
            case "take":
                MoneyOperation.take();
                break;
            default:
                System.out.println("You can only choose buy, fill or take. Try again: ");
                scanner.next();
        }
        scanner.close();
        IndregientsState.showResources();



    }
}
