/*package test;

import static org.testng.AssertJUnit.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import person.Application;
import person.domain.StudentDomain;
import person.manager.StudentManager;
import person.repository.StudentRepository;

@SpringApplicationConfiguration(classes = Application.class)
public class StudentTest extends AbstractTestNGSpringContextTests{

    @Autowired
    private StudentManager studentManager;
    
    @Autowired
    private StudentRepository studentRepository;
    
    @Test
    public void studentAddTest(){
        StudentDomain student = new StudentDomain();
        student.setId("504");
        student.setName("Jaggs");
        student.setSem("VII");
        student.setAge("21");
        
        studentManager.addStudent(student);
        String id = student.getAge();
        
        //StudentDomain student1 = new StudentDomain();
        //student1 = studentRepository.findOne(student1.getName());

        assertEquals(id, null);
    }
    
}*/