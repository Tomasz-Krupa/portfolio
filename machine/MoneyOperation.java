package machine;

public class MoneyOperation {
    public static void take() {
        System.out.println("I gave you $"+ IndregientsState.moneyInside+ "\n");
        IndregientsState.moneyInside=0;
    }
}
