package hello;

public class Greeting {


    private final String shopName;
    private final String ownerName;
    private final String category;
    private final Double latitude;
    private final Double longitude;


    public Greeting(String shopName, String ownerName, String category, Double latitude, Double longitude) {
        this.shopName = shopName;
        this.ownerName=ownerName;
        this.category=category;
        this.latitude=latitude;
        this.longitude = longitude;
    }

    public String getShopName() {
        return shopName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getCategory() {
        return category;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
}
