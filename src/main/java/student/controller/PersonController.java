package student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import student.domain.Person;
import student.repository.PersonRepository;
import student.repository.PersonService;


@RestController
class PersonController {
	
	final PersonService personService;
	
	@Autowired
	PersonController( PersonService personService ){
		this.personService = personService;
	}
	
	@RequestMapping(value="/persons",method=RequestMethod.GET)
	Page<Person> list( Pageable pageable){
		Page<Person> persons = personService.listAllByPage(pageable);
		return persons;
	} 
	
	@RequestMapping(value="/addPersons",method=RequestMethod.POST)
	PersonRepository addListt( 
			@RequestParam(required = true, value = "userName") String userName ,
			@RequestParam(required = true, value = "password") String password){
		PersonRepository persons = personService.addList(userName ,password);
		return persons;
	} 
}
	

