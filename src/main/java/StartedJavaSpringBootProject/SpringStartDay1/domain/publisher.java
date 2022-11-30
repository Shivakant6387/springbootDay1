package StartedJavaSpringBootProject.SpringStartDay1.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class publisher
{
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String addressLine1;
    private String city;
    private String state;
    private String zip;
    @OneToMany
    @JoinColumn(name = "publisher_id")
    private Set<Book>books=new HashSet<>();
    public publisher(){}

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        publisher publisher = (publisher) o;
        return Objects.equals(id, publisher.id) && Objects.equals(name, publisher.name) && Objects.equals(addressLine1, publisher.addressLine1) && Objects.equals(city, publisher.city) && Objects.equals(state, publisher.state) && Objects.equals(zip, publisher.zip) && Objects.equals(books, publisher.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, addressLine1, city, state, zip, books);
    }

    @Override
    public String toString() {
        return "publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", books=" + books +
                '}';
    }

    public <E> List getBook() {
        return null;
    }
}
