import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CD extends Product{
    private String artist;

    public CD(String name,String description,String artist){
        super(name, description);
        this.artist=artist;
    }

    public CD(){
        super();
    }
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
