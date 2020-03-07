package com.example.demo.model;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class Story{
    
    @Id
    private int id;

    @CreatedDate
    private String date;

    @CreatedBy
    private String writer;

    private String heading;

    private String writeUp;

    private String tag;

    public Story(String writer,String heading,String writeUp,String tag){
        this.writer = writer;
        this.writeUp = writeUp;
        this.heading = heading;
        this.tag=tag;
    }
}