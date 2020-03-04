import javax.persistence.*;

@Entity
public class Laptop {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "BRAND",length = 255,nullable = false)
    private String brand;
    @Column(name = "TYPE",length = 255,nullable = false)
    private String type;

    @ManyToOne()
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;

    public Laptop(String brand,String type, Employee employee){
        this.brand=brand;
        this.type=type;
        this.employee=employee;
    }

    public Laptop(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
