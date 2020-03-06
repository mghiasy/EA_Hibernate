import javax.persistence.Embeddable;

@Embeddable
public class Payment {
    private String paydate;
    private double amount;

    public Payment() {
    }

    public Payment(String paydate, double amount){
        this.paydate = paydate;
        this.amount = amount;
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String paydate) {
        this.paydate = paydate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paydate='" + paydate + '\'' +
                ", amount=" + amount +
                '}';
    }
}
