/**
 * PrepareTeeCoffe
 */
public class PrepareTeeCoffe {
    public static void main(String[] args) {
        // Tee darjeeling = new Tee();
        // darjeeling.prepareRecipie();
        // Coffee karnatakaCoffee = new Coffee();
        // karnatakaCoffee.prepareRecipie();
        CoffeeWithHook filterCoffee = new CoffeeWithHook();
        filterCoffee.prepareRecipie();
        TeeWithHook tajTee = new TeeWithHook();
        tajTee.prepareRecipie();
    }
}
