package student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import student.domain.Person;
import student.repository.PersonRepository;
import student.repository.PersonService;

@Service
@Transactional
class PersonServiceImpl implements PersonService {

	final PersonRepository personRepository;

	@Autowired
	PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public Page<Person> listAllByPage(Pageable pageable) {
		return personRepository.findAll(pageable);
	}

	@Override
	public PersonRepository addList(String userName, String password) {
		List<Person> p = new ArrayList<Person>();
		for (int i = 0; i < 20; i++) {
			Person person = new Person(userName + i++, password);
			personRepository.save(person);
			p.add(person);
		}
		return personRepository;
	}

}