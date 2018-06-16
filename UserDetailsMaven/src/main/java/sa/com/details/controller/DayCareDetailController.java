/**
 * 
 */
package sa.com.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sa.com.details.facade.DayCareFacade;
import sa.com.details.model.Address;
import sa.com.details.model.data.DayCareData;
import sa.com.details.response.ResponseDayCare;

/**
 * @author sachi
 *
 */
@RestController
@RequestMapping({"/dayCareDetails"})
public class DayCareDetailController {
	
	@Autowired
	DayCareFacade dayCareFacade;

	@GetMapping
	public List<Address> getAllDayCareAddress()
	{
		List<Address> addressList = dayCareFacade.getAllAddress();
		return addressList;
	}
	
	@PostMapping(path = "/createDayCare", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseDayCare createDayCare(@RequestBody DayCareData dayCaredata)
	{
		return null;
	}
}
