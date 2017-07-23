public class HealthyBurger extends Burger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String[][] healthyExtra = new String[2][2];

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price,"Whole wheat");
    }

    public void addBurgerAddtion(String name, String price,int index) {
        this.healthyExtra[index][0] = name;
        this.healthyExtra[index][1] = price;
    }

    @Override
    public double itemizeBurger() {
        double burgerPrice = super.itemizeBurger();
        for(int i = 0; i < healthyExtra.length; i++){
            if(this.healthyExtra[i][0] != null){
                burgerPrice += Double.parseDouble(this.healthyExtra[i][1]);
                System.out.printf("Added %s for an extra %s\n",this.healthyExtra[i][0],this.healthyExtra[i][1]);
            }
        }
        
        return burgerPrice;
    }
}