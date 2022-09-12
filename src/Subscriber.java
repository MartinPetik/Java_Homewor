
public class Subscriber {
    public String FirstName;
    public String LastName;
    public String Email;
    public int Age;


    public Subscriber(String FirtsName, String LastName, SubscriberAddress address,  String Email ){
        this.FirstName = FirtsName;
        this.LastName = LastName;
        this.Email = Email;

    }

    public Subscriber(String FirtsName, String LastName, SubscriberAddress address, String Email, int Age ){
        this.FirstName = FirtsName;
        this.LastName = LastName;
        this.Email = Email;
        this.Age = Age;
}
    public boolean isUnderage() {
        return Age < 18;
    }
}

