public class Burger {
    private String name,breadRollType, meat;;
    private double price;
    private String[][] additions = new String[4][4];

    public Burger(String name, String meat, double price, String breadRollType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addBurgerAddtion(String name, String price,int index){
        this.additions[index][0] = name;
        this.additions[index][1] = price;
    }

    public double itemizeBurger(){
        double burgerPrice = this.price;
        System.out.printf("A %s burger on a %s bun with %s, costs %s\n", this.name,this.breadRollType,this.meat,this.price);
        for(int i = 0; i < additions.length; i++){
            if(this.additions[i][0] != null){
                burgerPrice += Double.parseDouble(this.additions[i][1]);
                System.out.printf("Added %s for an extra %s\n", this.additions[i][0], this.additions[i][1]);
            }
        }
        return burgerPrice;
    }


}
