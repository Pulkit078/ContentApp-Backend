package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Story;

@Repository
public interface StoryRepository extends MongoRepository<Story, String>{
   public List<Story> findByTag(String tag);
   public List<Story> findByWriter(String writer);
}