package employee;

import javax.persistence.Entity;
import javax.persistence.Table;

import user.User;

@Entity
@Table(name="EMPLOYEE")
public class Employee extends User{

}
