import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "COURSENUMBER",length = 255,nullable = false)
    private String courseNumber;
    @Column(name = "NAME",length = 255,nullable = false)
    private String name;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students= new ArrayList<Student>();
}
