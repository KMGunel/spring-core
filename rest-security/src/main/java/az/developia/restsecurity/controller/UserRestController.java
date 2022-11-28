package az.developia.restsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.restsecurity.model.AuthorityModel;
import az.developia.restsecurity.model.UserModel;
import az.developia.restsecurity.repository.AuthorityRepository;
import az.developia.restsecurity.repository.UserRepository;

@RestController
@RequestMapping(path="/users")
@CrossOrigin(origins="*")
public class UserRestController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	AuthorityRepository authRepo;
	
	@PostMapping
 public UserModel createAccount(@RequestBody UserModel user) {
		
		AuthorityModel authModel = new AuthorityModel();
		authModel.setUsername(user.getUsername());
		authModel.setAuthority("admin");
		authRepo.save(authModel);
		
		return userRepository.save(user);
 }
 
}
