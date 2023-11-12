package com.devsuperior.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.workshopmongo.domain.Post;
import com.devsuperior.workshopmongo.repository.PostRepository;
import com.devsuperior.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	
	public Post findById(String id) {
		
		Post post = this.postRepository.findById(id)
							.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado. Id: " + id));
		
		return post;
		
	}
	
	public List<Post> findByTitle(String text) {
		
		return this.postRepository.findByTitleContainingIgnoreCase(text);
	
	}
	
}
