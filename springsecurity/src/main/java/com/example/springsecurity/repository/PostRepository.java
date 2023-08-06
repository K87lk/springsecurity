package com.example.springsecurity.repository;

import com.example.springsecurity.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post, Integer> {
}
