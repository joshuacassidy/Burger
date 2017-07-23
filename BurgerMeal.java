public class BurgerMeal extends Burger {
    public BurgerMeal() {
        super("Meal", "Chicken and Bacon", 10, "White");
        super.addBurgerAddtion1("Chips",2.22);
        super.addBurgerAddtion2("Drink",1.12);
    }

    @Override
    public void addBurgerAddtion1(String name, double price) {
        System.out.println("Cannot add additional items.");
    }

    @Override
    public void addBurgerAddtion2(String name, double price) {
        System.out.println("Cannot add additional items.");
    }

    @Override
    public void addBurgerAddtion3(String name, double price) {
        System.out.println("Cannot add additional items.");
    }

    @Override
    public void addBurgerAddtion4(String name, double price) {
        System.out.println("Cannot add additional items.");
    }
}
