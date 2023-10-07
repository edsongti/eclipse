package api.services;

import api.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User insert(User data) {
		return userRepository.save(data);
	}

	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}

	public void delete(Long id) {
		userRepository.deleteById(id);
	}
}
