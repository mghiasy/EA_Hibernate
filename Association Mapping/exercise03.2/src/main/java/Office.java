import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Office {
    @Id
    @GeneratedValue
    @Column(name = "OFFICE_ID")
    private int id;
    private int roomNumber;

    @Column(name = "BUILDING",length = 255,nullable = false)
    private String building;

    @OneToMany(mappedBy = "office")
    private List<Employee> employees=new ArrayList<Employee>();
}
