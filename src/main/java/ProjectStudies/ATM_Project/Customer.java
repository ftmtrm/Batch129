package ProjectStudies.ATM_Project;

public class Customer {
    private String name;
    private String surname;
    private int cardNo;
    private String password;

    public Customer() {
    }

    public Customer(String name, String surname, int cardNo,String password) {
        this.name = name;
        this.surname = surname;
        this.cardNo = cardNo;
        this.password = password;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cardNo=" + cardNo +
                ", password='" + password + '\'' +
                '}';
    }
}


