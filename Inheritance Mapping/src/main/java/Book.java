import javax.persistence.Entity;


@Entity
public class Book extends Product{
    private String title;
    public Book(String name,String description,String title){
        super(name, description);
        this.title=title;
    }

    public Book(){
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
