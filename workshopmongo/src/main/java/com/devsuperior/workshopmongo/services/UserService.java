package com.devsuperior.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.workshopmongo.domain.User;
import com.devsuperior.workshopmongo.dto.UserDTO;
import com.devsuperior.workshopmongo.repository.UserRepository;
import com.devsuperior.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<UserDTO> findAll() {
		
		return this.userRepository.findAll().stream().map(u -> new UserDTO(u)).toList();
		
	}
	
	public UserDTO findById(String id) {
		
		User user = this.userRepository.findById(id)
							.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado. Id: " + id));
		
		return new UserDTO(user);
		
	}
	
}
