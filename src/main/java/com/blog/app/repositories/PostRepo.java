package com.blog.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.app.entities.Category;
import com.blog.app.entities.Post;
import com.blog.app.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	//findBy<key>Containing to create %like query
	List<Post> findByTitleContaining(String title);

}
