package client;

import javax.persistence.Entity;
import javax.persistence.Table;

import person.Person;

@Entity
@Table(name="CLIENT")
public class Client extends Person{
	
}
