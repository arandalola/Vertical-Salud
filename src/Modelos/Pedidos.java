package Modelos;

public class Pedidos {

    private int id=0;
    private String first_name="";
    private String last_name="";
    private String adress="";
    private String city="";
    private String product="";
    private int amount=0;

    public Pedidos(int id, String first_name, String last_name, String adress, String city, String product, int amount) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.adress= adress;
        this.city = city;
        this.product = product;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return first_name;
    }

    public void setName(String name) {
        this.first_name = first_name;
    }

    public String getFirst_name() {
        return last_name;
    }

    public void setFirst_name(String first_name) {
        this.last_name = last_name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
