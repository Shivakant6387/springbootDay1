package StartedJavaSpringBootProject.SpringStartDay1.bootstrap;

import StartedJavaSpringBootProject.SpringStartDay1.domain.Author;
import StartedJavaSpringBootProject.SpringStartDay1.domain.Book;
import StartedJavaSpringBootProject.SpringStartDay1.domain.publisher;
import StartedJavaSpringBootProject.SpringStartDay1.repositories.AuthorRepository;
import StartedJavaSpringBootProject.SpringStartDay1.repositories.BookRepository;
import StartedJavaSpringBootProject.SpringStartDay1.repositories.publisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private  final BookRepository bookRepository;
    private StartedJavaSpringBootProject.SpringStartDay1.domain.publisher publisher;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric=new Author("Eric","Evans");
        Book ddd=new Book("Domain Driven Design","123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublishers( publisher);
        publisher.getBook().add(ddd);
        authorRepository.save(eric);
        bookRepository.save(ddd);
        //publisherRepository.save(publisher);
        Author rod=new Author("Rod","Johnson");
        Book noEJB=new Book("J2EE Developer without EJB","39394595949");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublishers(publisher);
        publisher.getBook().add(noEJB);
        authorRepository.save(rod);
        bookRepository.save(noEJB);
       // publisherRepository.save(publisher);
        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: "+bookRepository.count());
        System.out.println("publisher number of books"+publisher.getBooks().size());
    }
}
