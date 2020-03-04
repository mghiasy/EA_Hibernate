import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TblOrder")
public class Order {
    @Id
    @GeneratedValue
    private int orderId;
    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @ManyToOne
    @JoinColumn(name = "Customer_Id")
    private Customer customer;

    @OneToMany
    @JoinColumn(name = "Order_Id")
    List<OrderLine> orderLineList= new ArrayList<>();

    public Order(Date orderDate,Customer customer)
    {
        this.orderDate=orderDate;
        this.customer=customer;
    }

    public Order(){
        super();
    }

    public int getOrderId() {
        return orderId;
    }

    private void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
