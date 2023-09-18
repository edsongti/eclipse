package api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.repositories.UserRepository;

@Service
public interface UserService {
	
	public static final UserRepository userR = new UserRepository();
	
	public String findAll();
	
	public String findById();
	
	public String insert();
	
	public String delete();
	
	public String update();
}
