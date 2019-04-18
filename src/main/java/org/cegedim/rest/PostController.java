package org.cegedim.rest;

import java.util.List;
import org.cegedim.dao.PostRepository;
import org.cegedim.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/posts")
@CrossOrigin(origins = "http://localhost:4200",
maxAge = 3600, 
allowedHeaders= "*", 
allowCredentials = "false",
methods = {RequestMethod.GET, 
			RequestMethod.POST, 
			RequestMethod.PUT,
			RequestMethod.DELETE, 
			RequestMethod.OPTIONS, 
			RequestMethod.HEAD})
public class PostController {
	@Autowired
	private PostRepository postRepository;
	
	@RequestMapping(value="/getPosts")
	public List<Post> Index(){
		List<Post> posts  = postRepository.getPosts();
		return posts;
	}
}