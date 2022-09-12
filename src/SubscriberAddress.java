public class SubscriberAddress {
    public String StreetName;
    public int StreetNumber;
    public String Country;
    public String City;
    public int ZipCode;

    public SubscriberAddress(String StreetName, int StreetNumber,String city, String Country, int Zipcode){
        this.StreetName = StreetName;
        this.StreetNumber = StreetNumber;
        this.Country = Country;
        this.City = city;
        this.ZipCode = Zipcode;
    }
}
