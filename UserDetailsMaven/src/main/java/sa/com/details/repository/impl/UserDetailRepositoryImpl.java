package sa.com.details.repository.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import sa.com.details.model.UserDetails;
import sa.com.details.repository.UserDetailCustomService;
import sa.com.details.repository.UserdetailRepository;

@Service
public class UserDetailRepositoryImpl implements UserDetailCustomService{

	@Resource
	UserdetailRepository respository;
	
	@Transactional
	@Override
	public boolean searchUserByuserName(String userName)
	{
		Stream<UserDetails> userDetailStream = respository.findByuserNameReturnStream(userName);
		List<UserDetails> userDetailExists = userDetailStream.map( user ->{
			return user;
		}).collect(Collectors.toList());
		
		return userDetailExists != null && userDetailExists.size() == 1;
	}
}
