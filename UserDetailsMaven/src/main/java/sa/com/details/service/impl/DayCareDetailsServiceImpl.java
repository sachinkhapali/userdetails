/**
 * 
 */
package sa.com.details.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sa.com.details.model.Address;
import sa.com.details.repository.DayCareDetailsService;
import sa.com.details.service.DayCareDetailService;

/**
 * @author sachi
 *
 */
@Service
public class DayCareDetailsServiceImpl implements DayCareDetailService {


	@Autowired
	DayCareDetailsService dayCareRespo;

	@Override
	public List<Address> getAllDayCareAddress() {
		return (List<Address>) dayCareRespo.findAll();
	}
}
