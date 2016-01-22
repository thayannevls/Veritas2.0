package user;

import javax.persistence.Entity;
import javax.persistence.Table;

import person.Person;

@Entity
@Table(name="CLIENT")
public class User extends Person{
	
}
