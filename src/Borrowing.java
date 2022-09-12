import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Borrowing {

    public LocalDate DateOfReturn;
    public LocalDate DateOfBorrowing;
    public Borrowing(Book name, Subscriber title, LocalDate DateOfBorrowing){
        this.DateOfBorrowing = DateOfBorrowing;
    }

    public LocalDate getDateOfReturn() {
        return DateOfReturn;
    }


    public long numerOfDays() {
       return  ChronoUnit.DAYS.between(DateOfBorrowing, DateOfReturn);

    }

    public void setReturnDate(LocalDate now) {
        DateOfReturn = now;
    }
}
