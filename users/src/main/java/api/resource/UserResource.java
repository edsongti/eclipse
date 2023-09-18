package api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.entities.User;
import api.services.UserService;

@RestController
@RequestMapping("users")
public class UserResource implements UserService {
	

	@PostMapping
	public void insert(@RequestBody User dados) {
		System.out.println(dados);
		
	}


	@Override
	public String findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	@GetMapping
	public String findById() {
		// TODO Auto-generated method stub
		return null;
	} 


	@Override
	public String insert() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String update() {
		// TODO Auto-generated method stub
		return null;
	}
}
