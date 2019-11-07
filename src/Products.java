public class Products {

    //Atributos
    private String product_name="";
    private int id;

    //Constructor
    public Products(String product_name, int id) {
        this.product_name = product_name;
        this.id = id;
    }

    public Products(){}

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}