import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue
    @Column(name = "DEPARTMENT_ID")
    private int id;
    @Column(name = "Name",length = 255,nullable = false)
    private String name;

    @OneToMany(mappedBy = "dept")
   // @JoinColumn(name = "department_id_created_in_dept")
    private List<Employee> emps = new ArrayList<Employee>();

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
