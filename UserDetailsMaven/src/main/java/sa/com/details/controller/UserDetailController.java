package sa.com.details.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sa.com.details.facade.UserDetailFacade;
import sa.com.details.model.data.UserDetailData;
import sa.com.details.response.ResponseString;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/details"})
public class UserDetailController {

	@Autowired
	private UserDetailFacade userDetailFacade;
	
	@PostMapping(path="/addUser", consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseString addUser(@RequestBody UserDetailData user)
	{
		boolean isCreated = userDetailFacade.createUserDetail(user);
		
		ResponseString response = new ResponseString();
		if(isCreated) {
			response.setStatus(HttpStatus.OK.toString());
			response.setRespose("Sucessfully Added");
		}
		else
		{
			response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString());
			response.setRespose("Failed to Add user");
		}
		
		return response;
	}
	
	@GetMapping(path= {"/getAll"})
	public ResponseString getAllUser()
	{
		//boolean isCreated = userDetailFacade.createUserDetail(user);
		ResponseString response = new ResponseString();
		response.setStatus(HttpStatus.OK.toString());
		response.setRespose("Returned");
		
		return response;
	}
}
