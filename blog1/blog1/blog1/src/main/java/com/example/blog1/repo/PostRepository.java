
package com.example.blog1.repo;

import com.example.blog1.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}

