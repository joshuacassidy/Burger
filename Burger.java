public class Burger {
    private String name,bunType, meat;;
    private double price;
    private String[][] additions = new String[4][4];

    public Burger(String name, String meat, double price, String bunType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bunType = bunType;
    }

    public void addBurgerAddtion(String name, String price,int index){
        this.additions[index][0] = name;
        this.additions[index][1] = price;
    }

    public double itemizeBurger(){
        double burgerPrice = this.price;
        System.out.println(this.name + " burger " + "on a " + this.bunType + " bun with " + this.meat + ", price is " + this.price);
        for(int i = 0; i < additions.length; i++){
            if(this.additions[i][0] != null){
                burgerPrice += Double.parseDouble(this.additions[i][1]);
                System.out.println("Added " + this.additions[i][0] + " for an extra " + this.additions[i][1]);
            }
        }
        return burgerPrice;
    }


}
