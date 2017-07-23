public class Burger {
    private String name,bunType, meat,addition1Name,addition2Name,addition3Name,addition4Name;
    private double price,addition1Price,addition2Price,addition3Price,addition4Price;
    private String[] additionsName = new String[4];
    private double[] additionsPrice = new double[4];

    public Burger(String name, String meat, double price, String bunType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bunType = bunType;
    }

    public void addBurgerAddtion(String name, double price,int index){
        this.additionsName[index] = name;
        this.additionsPrice[index] = price;
    }

    public double itemizeBurger(){
        double burgerPrice = this.price;
        System.out.println(this.name + " burger " + "on a " + this.bunType + " bun with " + this.meat + ", price is " + this.price);
        for(int i = 0; i < additionsName.length; i++){
            if(this.additionsName[i] != null){
                burgerPrice += this.additionsPrice[i];
                System.out.println("Added " + this.additionsName[i] + " for an extra " + this.additionsPrice[i]);
            }
        }
        return burgerPrice;
    }
}
