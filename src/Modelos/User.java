package Modelos;

public class User {

    private int id=0;
    private String first_name="";
    private String last_name="";
    private String adress="";
    private String city="";

    public User(int id, String first_name, String last_name, String adress, String city) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.adress = adress;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAdress() { return adress; }

    public void setAdress(String adress) { this.adress = adress; }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
