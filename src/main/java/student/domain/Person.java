package student.domain;

import javax.annotation.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

public class Person {

	String userName;
	
	String password;

	public Person(String userName,String password){
		this.userName=userName;
		this.password=password;
	}
	public String getName() {
		return userName;
	}

	public void setName(String userName) {
		this.userName = userName;
	}

	public String getPasword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}