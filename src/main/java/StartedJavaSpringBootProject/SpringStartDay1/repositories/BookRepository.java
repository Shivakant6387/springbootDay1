package StartedJavaSpringBootProject.SpringStartDay1.repositories;

import StartedJavaSpringBootProject.SpringStartDay1.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
