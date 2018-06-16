/**
 * 
 */
package sa.com.details.repository;

import org.springframework.data.repository.CrudRepository;

import sa.com.details.model.Address;

/**
 * @author sachi
 *
 */
public interface DayCareDetailsService extends CrudRepository<Address, Long>   {
	
}
