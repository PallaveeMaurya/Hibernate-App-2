package in.pwskills.nitin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="EMPLOYEE")
public class Employee {
	
     @Id
     @Column(name="ID")
	 private Integer id;
     
     @Column(name="NAME")
	 private String name;
     
     @Column(name="AGE")
	 private Integer age;
     
     @Column(name="ADDRESS")
	 private String address;
	 
	public Employee() {

		System.out.println("USED BY HIBERNATE INTERNALLY");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	
}
