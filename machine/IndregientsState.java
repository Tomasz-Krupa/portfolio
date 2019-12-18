package machine;

public class IndregientsState {
    static int waterInside = 1200;
    static int milkInside = 540;
    static int coffeeInside = 120;
    static int moneyInside = 550;
    static int cupsInside = 9;

    static public void showResources() {
        System.out.println("The coffee machine has: \n"
                + waterInside + " of water \n" +
                milkInside + " of milk\n" +
                coffeeInside + " of coffee beans\n" +
                cupsInside + " of disposable cups\n" +
                moneyInside + " of money\n");
    }
}
