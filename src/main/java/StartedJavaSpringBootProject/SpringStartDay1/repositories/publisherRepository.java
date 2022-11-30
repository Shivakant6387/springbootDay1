package StartedJavaSpringBootProject.SpringStartDay1.repositories;

import StartedJavaSpringBootProject.SpringStartDay1.domain.Book;
import StartedJavaSpringBootProject.SpringStartDay1.domain.publisher;
import org.springframework.data.repository.CrudRepository;

public abstract class publisherRepository implements CrudRepository<Book, Long> {

}
