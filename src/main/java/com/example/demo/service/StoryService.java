package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Story;
import com.example.demo.repository.StoryRepository;

@Service
public class StoryService {
   
	@Autowired
	private StoryRepository storyRepository;
	
	//Create operation
	public Story create(String writer,String heading, String writeUp,String tag) {
		return storyRepository.save(new Story(writer, heading, writeUp,tag));
	}
	//Retrieve operation
	public List<Story> getAll(){
		return storyRepository.findAll();
	}
	public List<Story> getByWriter(String writer) {
		return storyRepository.findByWriter(writer);
    }

    public List<Story> getByTag(String tag){
        return storyRepository.findByTag(tag);
    }

	//Delete operation
	public void deleteAll() {
		storyRepository.deleteAll();
    }

}
