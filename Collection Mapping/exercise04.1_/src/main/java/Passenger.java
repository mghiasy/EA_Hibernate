import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Passenger {
    @Id
    @GeneratedValue
    private int id;

    private String name;
@OneToMany
    @JoinColumn(name = "PASSENGER_ID")
    private List<Flight> flights = new ArrayList<>();
}
