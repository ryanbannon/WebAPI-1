/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookcatalog.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author x14488478
 */

@XmlRootElement
public class Book {
    
    private long id;
    private String title;
    private String author;
    private String publisher;
    
    public Book(){
    }
    
    public Book(long id, String title, String author, String publisher){
       this.id = id;
       this.title = title;
       this.author = author;
       this.publisher = publisher;
    }
    
    public long getId(){
        return id;
    }
    
    public void setId(long id){
        this.id = id;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public String getPublisher(){
        return publisher;
    }
    
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
}
