import javax.persistence.*;

@Entity
public class Publisher {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "NAME",length = 255,nullable = false)
    private String name;



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
