public class Main {
    public static void  main(String[] args){
        Burger burger = new Burger("Basic", "Beef",3.56,"White");

        for(int i = 0; i < 4; i++){
            burger.addBurgerAddtion("Cheese",0.34,i);
        }
        System.out.println("Total Burger Price is " + burger.itemizeBurger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        healthyBurger.addhealthyAddition2("mayo",1.31);
        System.out.println("Total Burger Price is " + healthyBurger.itemizeBurger());

        BurgerMeal bm = new BurgerMeal();
        bm.itemizeBurger();
    }
}
