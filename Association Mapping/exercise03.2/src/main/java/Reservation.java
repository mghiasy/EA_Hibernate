import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private int id;

//    @Temporal(TemporalType.DATE)
//    private String date;

    @ManyToOne
    @JoinColumn(name = "BOOK_ID")
    private Book book;
}
