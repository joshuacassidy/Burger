public class BurgerMeal extends Burger {
    public BurgerMeal() {
        super("Meal", "Chicken and Bacon", 10, "White");
        super.addBurgerAddtion("Chips","2.22",0);
        super.addBurgerAddtion("Drink","2.22",1);
    }

    @Override
    public void addBurgerAddtion(String name, String price,int index) {
        System.out.println("Cannot add additional items.");
    }

}
