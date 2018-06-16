/**
 * 
 */
package sa.com.details.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sa.com.details.model.Address;
import sa.com.details.service.DayCareDetailService;

/**
 * @author sachi
 *
 */
@Component
public class DayCareFacade {
	
	@Autowired
	public DayCareDetailService dayCareService;

	public List<Address> getAllAddress()
	{
		return dayCareService.getAllDayCareAddress();
	}
}
