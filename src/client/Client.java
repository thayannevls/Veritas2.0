package client;

import javax.persistence.Entity;
import javax.persistence.Table;

import user.User;

@Entity
@Table(name="CLIENT")
public class Client extends User{
	
}
