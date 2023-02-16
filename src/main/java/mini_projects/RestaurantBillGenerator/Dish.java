package mini_projects.RestaurantBillGenerator;

public class Dish {
    //yiyeceklerin fieldlari okunsun ama degistirilemesin
    private int code;
    private String name;
    private double price;
    //yiyecek olusturulurken ozellikleri de set edilsin
    public Dish(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
