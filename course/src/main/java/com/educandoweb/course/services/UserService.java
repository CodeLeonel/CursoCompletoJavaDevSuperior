package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import com.educandoweb.course.services.exceptions.DatabaseException;
import com.educandoweb.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		
		return this.userRepository.findAll();
		
	}
	
	public User findById(Long id) {
		
		Optional<User> obj = this.userRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		
		return this.userRepository.save(obj);
	
	}
	
	public void delete(Long id) {
		
		try {
			this.userRepository.deleteById(id);			
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
		
	}
	
	public User update(Long id, User obj) {
		
		User entity = this.userRepository.getReferenceById(id);
		updateData(entity,obj);
		return this.userRepository.save(entity);
		
	}
	
	public void updateData(User entity, User obj) {
		entity.setEmail(obj.getEmail());
		entity.setName(obj.getName());
		entity.setPhone(obj.getPhone());
	}
	
}
