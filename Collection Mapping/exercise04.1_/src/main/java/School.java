import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class School {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany
    @JoinColumn(name = "SCHOOL_ID")
    Map<Integer,Student> studentMap= new HashMap<>();
}
