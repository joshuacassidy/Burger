public class Main {
    public static void  main(String[] args){
        Burger burger = new Burger("Basic", "Beef",3.56,"White");
        String[][] regularAdditions = {{"Cheese","Mayo","Lettuce"},{"0.34","0.31","0.41"}};
        String[][] healthyAdditions = {{"Mayo","Pineapple"},{"1.24","2.31"}};

        for(int i = 0; i < regularAdditions[0].length; i++){
            burger.addBurgerAddtion(regularAdditions[0][i],regularAdditions[1][i],i);
        }
        System.out.println("Total Burger Price is " + burger.itemizeBurger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        for(int i = 0; i < healthyAdditions.length; i++){
            healthyBurger.addhealthyAddition(healthyAdditions[0][i],healthyAdditions[1][i],i);
        }
        
        System.out.println("Total Burger Price is " + healthyBurger.itemizeBurger());

        BurgerMeal bm = new BurgerMeal();
        bm.itemizeBurger();
    }

}
