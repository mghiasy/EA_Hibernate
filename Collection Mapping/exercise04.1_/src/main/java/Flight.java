import javax.persistence.*;
import java.util.Date;

@Entity
public class Flight {
    @Id
    @GeneratedValue
    private int id;

    private int flightNumber;
    @Column(name = "FROMSOURCE")
    private String from;
    @Column(name = "TODESTINATION")
    private String to;
    @Temporal(TemporalType.DATE)
    private Date date;

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
