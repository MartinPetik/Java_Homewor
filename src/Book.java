import java.security.PublicKey;

public class Book {
    public String name;
    public String autor;
    public int numberOfPages;


    public  Book(String name, String autor, int numberOfPages){
        this.name = name;
        this.autor = autor;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return name;
    }
}
