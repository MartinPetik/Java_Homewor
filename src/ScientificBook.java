public class ScientificBook  extends Book{

    public String scientificArea;

    public ScientificBook(String name, String autor, int numberOfPages, String scientificArea) {
        super(name, autor, numberOfPages);
        this.scientificArea = scientificArea;

    }

}
