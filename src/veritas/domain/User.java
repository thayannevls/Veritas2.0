package veritas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")

/**
 * This is a superclass with basic attributes for clients and workers.
 * @author thayannevls & eddieKaleb
 *
 */
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	@Column
	private String name;
	@Column
	private String passwd;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	//-----------------------------------------------------------------------------------
	//Temporary method to String
	public String toString() {
		return "ID: " + getId() + "\n NAME: " + getName() + "\n PASSWORD: " + getPasswd();
	}
	//-----------------------------------------------------------------------------------

	
}
