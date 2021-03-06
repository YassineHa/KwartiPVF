package info.androidhive.firebase;

/**
 * Created by yassi on 05/08/2016.
 */
public class Card  {

    private String id;
    private String name;
    private String companyName;
    private String cardNumber;



    private String cardformat;
    private String description;
    private String emailUser;
    private String brand;



    private String thumbnail;


    public Card() {
    }
    public Card(String name, String companyName, String thumbnail) {
        this.name = name;
        this.companyName = companyName;
        this.thumbnail = thumbnail;
    }



    public String getCardformat() {
        return cardformat;
    }

    public void setCardformat(String cardformat) {
        this.cardformat = cardformat;
    }




    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardformat='" + cardformat + '\'' +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                '}';
    }
}
