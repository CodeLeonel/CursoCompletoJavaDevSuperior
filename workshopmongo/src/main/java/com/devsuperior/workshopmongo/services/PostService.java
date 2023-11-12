package com.devsuperior.workshopmongo.services;

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
	
}
