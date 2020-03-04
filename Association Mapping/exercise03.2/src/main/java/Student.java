import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private int studentId;

    @Column(name = "FIRSTNAME",length = 255,nullable = false)
    private String firstName;
    @Column(name = "LASTNAME",length = 255,nullable = false)
    private String lastName;

    @ManyToMany
    @JoinTable(name = "Student_Course", joinColumns = {@JoinColumn(name = "Student_id")}, inverseJoinColumns = {@JoinColumn(name = "Course_id")})
    private List<Course> courses = new ArrayList<>();

    public int getStudentId() {
        return studentId;
    }

    private void setStudentId(int studentId) {
        this.studentId = studentId;
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
