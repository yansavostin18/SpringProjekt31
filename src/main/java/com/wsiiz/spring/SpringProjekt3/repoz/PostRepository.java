package com.wsiiz.spring.SpringProjekt3.repoz;

import com.wsiiz.spring.SpringProjekt3.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
