import javax.persistence.*;

@Entity
@SecondaryTables(
@SecondaryTable(name = "Address")
)
public class Patient {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "STREET",table = "Address")
    private String street;
    @Column(name = "CITY",table = "Address")
    private String city;
    @Column(name = "ZIP",table = "Address")
    private String zip;

    public Patient() {
    }

    public Patient(String name, String street, String city, String zip) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.zip = zip;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
