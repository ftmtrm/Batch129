package mini_projects.RestaurantBillGenerator;

public class Order {
    public static int count=999;
    public int orderCode;
    public int numOfDish;
    public double orderPrice;
    public Dish dish;
    //8- yemek ve adet parametreleriyle obje olusturalim
    public Order(Dish dish, int numOfDish){
        count++;
        this.orderCode =count;
        this.dish = dish;
        this.numOfDish = numOfDish;


    }
    //9-Siparis fiyatini hesapla
    public void setPrice(){
        this.orderPrice=this.dish.getPrice()*this.numOfDish;
    }

}
