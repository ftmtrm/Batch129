package mini_projects.Bilet_NesibeHoca;

public class Bilet {
    //mesafe, yolculuk tipi, fiyat,koltuk no
    public double distance;
    public int typeNo;
    public double price;
    public int seatNo;

    //5. bileti yazdiralim
    public void printTicket(Bus bus){//parametreyle cagirabiliyoruz cunku plaka static degil
        System.out.println("Toplam tutar: "+this.price);
        System.out.println("Bilet detayi ");
        System.out.println("otobus plakasi:" +bus.numberPlate);
        System.out.println("Mesafe: "+this.distance);
        System.out.println("Yolculuk tipi: "+(this.typeNo==1?"Tek yon": "Gidis-Donus"));
        System.out.println("Koltuk no :"+(this.seatNo));
        System.out.println("Keyifli yolculuklar dileriz...");
    }
}
