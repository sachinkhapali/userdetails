package sa.com.details.service;

import sa.com.details.model.UserDetails;

public interface UserDetailService {
	
	public boolean createUser(UserDetails userDetail);

	public boolean updateUser(UserDetails userDetail);
	
	public boolean isUserExists(UserDetails userDetail);

}
