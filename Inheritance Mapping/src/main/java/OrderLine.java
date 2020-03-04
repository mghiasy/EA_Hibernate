import javax.persistence.*;

@Entity
public class OrderLine {
    @Id
    @GeneratedValue
    private int id;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "Product_id")
    private Product product;


    public OrderLine(int quantity,Product product){
        this.quantity=quantity;
        this.product=product;
    }
    public OrderLine(){
        super();
    }


    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
