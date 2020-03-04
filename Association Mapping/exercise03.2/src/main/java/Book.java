import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue
    @Column(name = "BOOK_ID")
    private int id;
    @Column(name = "TITLE",length = 255,nullable = false)
    private String title;
    @Column(name = "ISBN", length = 255, nullable = false)
    private String ISBN;
    @Column(name = "AUTHOR", length = 255,nullable = false)
    private String author;

    @ManyToOne
    @JoinTable(name = "Book_Publisher", joinColumns = {@JoinColumn(name = "Book_id")},inverseJoinColumns = {@JoinColumn(name = "Publisher_id")})
    private Publisher publisher;

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
