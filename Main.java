public class Main {
    public static void  main(String[] args){
        String[][] regularAdditions = {{"Cheese","Mayo","Lettuce"},{"0.34","0.31","0.41"}};
        String[][] healthyAdditions = {{"Mayo","Pineapple"},{"1.24","2.31"}};

        System.out.print("\033[H\033[2J");
        Burger burger = new Burger("Basic", "Beef",3.56,"White");
        addToppings(regularAdditions,burger);

        System.out.printf("Total Burger Price is %s\n", burger.itemizeBurger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        addToppings(healthyAdditions,(HealthyBurger)healthyBurger);
        System.out.printf("Total Burger Price is %s\n", healthyBurger.itemizeBurger());

        BurgerMeal bm = new BurgerMeal();
        System.out.printf("Total Burger Price is %s\n", bm.itemizeBurger());
    }

    public static void addToppings(String[][] additions,Burger burgerType){
        for(int i = 0; i < additions.length; i++){
            burgerType.addBurgerAddtion(additions[0][i],additions[1][i],i);
        }
    }
}
