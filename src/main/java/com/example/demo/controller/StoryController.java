package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.*;
import com.example.demo.service.StoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/story")
public class StoryController {

	@Autowired
    private StoryService storyService;

    @RequestMapping("/create")
    public Story create(@RequestParam String writer, @RequestParam String heading, 
            @RequestParam String writeUp,@RequestParam String tag) {
		Story p = storyService.create(writer, heading, writeUp,tag);
		return p;
	}
	
	@RequestMapping("/getByWriter")
	public List<Story> getByWriter(@RequestParam String writer){
		return storyService.getByWriter(writer);
	}

	@RequestMapping("/getByTag")
	public List<Story> getByTag(@RequestParam String tag){
		return storyService.getByTag(tag);
	}
	
    @RequestMapping("/getAll")
	public List<Story> getAll(){
		return storyService.getAll();
	}

    @RequestMapping ("/deleteAll")
	public String deleteAll() {
		storyService.deleteAll();
		return "Deleted all stories";
	}
	
}
