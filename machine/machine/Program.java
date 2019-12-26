package machine;

import static machine.CoffeeMachine.makeMainMethod;

public class Main {

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        makeMainMethod(coffeeMachine);
    }
}