package StartedJavaSpringBootProject.SpringStartDay1.repositories;

import StartedJavaSpringBootProject.SpringStartDay1.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
