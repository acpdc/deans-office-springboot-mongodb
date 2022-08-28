package kamila.deansoffice;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> { //String cause it's data type of student id
}
