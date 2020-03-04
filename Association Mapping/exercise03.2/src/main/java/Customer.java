import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "CUSTOMER_ID")
    private int id;

    @Column(name = "NAME",length = 255,nullable = false)
    private String name;

    @OneToMany
    @JoinColumn(name = "CUSTOMER_ID")
    private List<Reservation> reservations= new ArrayList<>();
}
