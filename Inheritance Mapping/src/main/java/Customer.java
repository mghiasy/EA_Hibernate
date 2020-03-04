import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int Id;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "customer")
    List<Order> orderList= new ArrayList<>();

    public  Customer(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Customer(){
        super();
    }

    public int getId() {
        return Id;
    }

    private void setId(int id) {
        Id = id;
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
