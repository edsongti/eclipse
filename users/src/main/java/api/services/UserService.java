package api.services;

import api.entities.User;
import api.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
		return user.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public void delete(Long id) {
		try {
			userRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	public User update(Long id, User userData) {
		try {
			User user = userRepository.getReferenceById(id);
			user.setNome(userData.getNome());
			user.setEmail(userData.getEmail());
			user.setTelefone(userData.getTelefone());
			user.setPassword(userData.getPassword());
			return userRepository.save(user);
		} catch (RuntimeException e) {
			throw new ResourceNotFoundException(id);
		}
	}
}
