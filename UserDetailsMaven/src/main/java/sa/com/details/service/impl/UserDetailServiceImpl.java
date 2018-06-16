package sa.com.details.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sa.com.details.model.UserDetails;
import sa.com.details.repository.UserDetailCustomService;
import sa.com.details.repository.UserdetailRepository;
import sa.com.details.service.UserDetailService;

@Service
public class UserDetailServiceImpl implements UserDetailService {

	@Autowired
	public UserdetailRepository repository;
	
	@Autowired
	public UserDetailCustomService userDetailServiceRepo;
	
	@Override
	public boolean createUser(UserDetails userDetail) {
		// TODO Auto-generated method stub
		UserDetails user = repository.save(userDetail); 
		return user != null;
	}

	@Override
	public boolean updateUser(UserDetails userDetail) {
		Object user = repository.findById(userDetail.getId());
		if(user instanceof UserDetails)
		{
			UserDetails u = (UserDetails) user;
			u = repository.save(u);
			return u != null;
			
		}
		return false;
	}

	@Override
	public boolean isUserExists(UserDetails userDetail) {
		return userDetailServiceRepo.searchUserByuserName(userDetail.getUserName());
	}
}
