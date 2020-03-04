import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int employeeNumber;
    @Column(name = "NAME",length = 255,nullable = false)
    private String name;

@ManyToOne
@JoinColumn(name = "DEPARTMENT_ID")
private Department dept;

@ManyToOne
@JoinColumn(name = "OFFICE_ID")
private Office office;

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    private void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
