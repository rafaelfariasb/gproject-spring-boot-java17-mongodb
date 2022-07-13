package com.garotinho.gprojectmongo.dto;

import java.io.Serializable;
import java.util.Date;



public class CommentDTO implements Serializable{
    private String text;
    private Date date;
    private AuthorDTO author;

    public CommentDTO(){}

    public CommentDTO(String text, Date date, AuthorDTO author) {
        this.text = text;
        this.date = date;
        this.author = author;
    }
    
}
