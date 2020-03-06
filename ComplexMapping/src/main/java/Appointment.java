import javax.persistence.*;

@Entity
public class Appointment {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    @Column(name = "APPDATE")
    private String appdate;
    @Embedded
    private Payment payment;
    @Column(name = "PATIENT")
    @OneToOne(cascade = CascadeType.PERSIST)
    private Patient patient;
    @OneToOne(cascade = CascadeType.PERSIST)
    @Column(name = "DOCTOR")
    private Doctor doctor;

    public Appointment() {
    }
    public Appointment(String appdate,Payment payment, Patient patient,Doctor doctor) {
        this.appdate = appdate;
        this.payment = payment;
        this.patient = patient;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppdate() {
        return appdate;
    }

    public void setAppdate(String appdate) {
        this.appdate = appdate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
