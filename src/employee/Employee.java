package employee;

import javax.persistence.Entity;
import javax.persistence.Table;

import user.User;

@Entity
@Table(name="EMPLOYEE")

/**
 * This class refers to the workers responsible for the QR-Codes and products.
 * @author thayannevls & eddieKaleb
 *
 */
public class Employee extends User{

}
