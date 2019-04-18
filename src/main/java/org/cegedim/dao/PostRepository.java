package org.cegedim.dao;

import java.util.List;
import org.cegedim.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PostRepository extends JpaRepository<Post, Long>{
	@Query("select p from Post p order by p.title")
	public List<Post> getPosts();
}
