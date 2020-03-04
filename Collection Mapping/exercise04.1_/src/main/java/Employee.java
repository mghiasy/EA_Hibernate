import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "FIRSTNAME",length = 255,nullable = false)
    private String firstName;
    @Column(name = "LASTNAME",length = 255,nullable = false)
    private String lastName;

    @OneToMany(mappedBy = "employee")
    Set<Laptop> laptops= new HashSet<>();

    public Employee(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public  Employee(){
        super();
    }


    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
