package com.example.demo.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public List<Users> getAllUserlist(){
		List<Users> userlist = new ArrayList<>();
		userRepository.findAll().forEach(userlist::add);
		return userlist;
	}
	
	public void newuser(Users users) {
		userRepository.save(users);
	}
	
	public Users singleUser(String id) {
		List<Users> a = (List<Users>) userRepository.findAll();
		for (int i = 0; i < a.size();) {
			if((a.get(i).getUsername()).equals(id))
				return a.get(i);
			++i;
		}
		return null;
	}
	
	public void updateUsers(Users users) {
		userRepository.save(users);
	}
	
	

}
