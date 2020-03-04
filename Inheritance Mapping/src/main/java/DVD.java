import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DVD extends Product{
    private String genere;

    public DVD(String name,String description,String genere){
        super(name, description);
        this.genere=genere;
    }

    public DVD(){
        super();
    }
    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
