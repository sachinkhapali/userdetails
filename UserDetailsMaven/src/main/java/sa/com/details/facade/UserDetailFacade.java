package sa.com.details.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sa.com.details.converter.UserDetailConverter;
import sa.com.details.model.UserDetails;
import sa.com.details.model.data.UserDetailData;
import sa.com.details.service.UserDetailService;

@Component
public class UserDetailFacade {
	
	
	@Autowired
	private UserDetailService userDetailService;
	@Autowired
	private UserDetailConverter converter;
	
	public boolean createUserDetail(UserDetailData user)
	{
		UserDetails userDetail = converter.convert(user);
		boolean isCreated = userDetailService.createUser(userDetail);
		return isCreated;
	}
	
	public boolean updateUserDetail(UserDetailData user)
	{
		UserDetails userDetail = converter.convert(user);
		boolean isCreated = userDetailService.updateUser(userDetail);
		return isCreated;
	}
	
	public boolean isUserExists(UserDetailData user)
	{
		boolean isExist = false;
		UserDetails userDetail = converter.convert(user);
		isExist = userDetailService.isUserExists(userDetail);
		return isExist;
	}
}
