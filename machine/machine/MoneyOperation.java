package machine;

import static machine.IngredientsState.*;

public class MoneyOperation {
    public static void take() {
        System.out.println("I gave you $"+ moneyInside+ "\n");
        moneyInside=0;
    }
}
