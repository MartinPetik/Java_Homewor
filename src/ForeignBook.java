public class ForeignBook extends Book {

    public String language = "English";

    public ForeignBook(String name, String autor, int numberOfPages) {
        super(name, autor, numberOfPages);
    }

    public ForeignBook(String name, String autor, int numberOfPages, String language) {
        super(name, autor, numberOfPages);
        this.language = language;
    }


}
