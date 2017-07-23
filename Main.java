public class Main {
    public static void  main(String[] args){
        Burger burger = new Burger("Basic", "Beef",3.56,"White");
//        double price = burger.itemizeBurger();
        burger.addBurgerAddtion1("Cheese",0.34);
        burger.addBurgerAddtion2("mayo",.31);
        burger.addBurgerAddtion3("lettuce",.41);
        System.out.println("Total Burger Price is " + burger.itemizeBurger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        healthyBurger.addBurgerAddtion2("mayo",1.31);
        System.out.println("Total Burger Price is " + healthyBurger.itemizeBurger());

        BurgerMeal bm = new BurgerMeal();
        bm.itemizeBurger();
    }
}
