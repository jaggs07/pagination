package student.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import student.domain.Person;

public interface PersonRepository extends PagingAndSortingRepository<Person,Integer> {

}