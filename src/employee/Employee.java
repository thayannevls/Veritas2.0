package employee;

import javax.persistence.Entity;
import javax.persistence.Table;

import person.Person;

@Entity
@Table(name="EMPLOYEE")
public class Employee extends Person{

}
