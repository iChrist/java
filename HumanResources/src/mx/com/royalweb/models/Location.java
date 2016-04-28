package mx.com.royalweb.models;

public class Location {

    private int id;
    private String streetAdress;
    private String city;
    private String stateProvince;
    private String country;

    public Location(String streetAdress, String city, String stateProvince, String country) {
        this.streetAdress = streetAdress;
        this.city = city;
        this.stateProvince = stateProvince;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
