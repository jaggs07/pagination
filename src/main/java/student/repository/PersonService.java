package student.repository;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import student.domain.Person;

public interface PersonService {
	Page<Person> listAllByPage(Pageable pageable);
	PersonRepository addList(String userName, String password);

}