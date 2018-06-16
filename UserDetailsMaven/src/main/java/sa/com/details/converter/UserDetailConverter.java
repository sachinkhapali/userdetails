package sa.com.details.converter;

import org.springframework.stereotype.Component;

import sa.com.details.model.UserDetails;
import sa.com.details.model.data.UserDetailData;

@Component
public class UserDetailConverter {

	public UserDetails convert(UserDetailData user)
	{
		UserDetails details = new UserDetails();
		details.setName(user.getName());
		details.setUserName(user.getUserName());
		details.setGender(user.getGender());
		details.setEmail(user.getEmail());
		details.setPassword(user.getPassword());
		return details;
	}
}
