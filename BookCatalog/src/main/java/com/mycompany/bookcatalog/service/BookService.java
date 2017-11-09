/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookcatalog.service;

import com.mycompany.bookcatalog.model.Book;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author x14488478
 */
public class BookService {
    
    public static List<Book> list = new ArrayList<>();
    
    public List<Book> getAllBooks(){
        
        if(list.isEmpty()){
            Book book1 = new Book(1L, "To Kill a Mockingbird", "Harper Lee", "Warner Books, Inc.");
            Book book2 = new Book(2L, "The Great Gatsby", "F. Scott Fitzgerald", "Scribner");
            Book book3 = new Book(3L, "The Catcher in the Rye", "J. D. Salinger", "Little, Brown and Company");
            Book book4 = new Book(4L, "Of Mice and Men", "John Steinbeck", "Pascal Covici");
            Book book5 = new Book(5L, "Lord of the Flies", "William Golding", "Faber and Faber");

            list.add(book1);
            list.add(book2);
            list.add(book3);
            list.add(book4);
            list.add(book5);
        }
        return list;
    }
    
    public Book getBook(int id){
        return list.get(id-1);
    }
    
    public Book deleteBook(int id){
        return list.remove(id-1);
    }
    
    public Book createBook(Book book){
        list.add(book);
        return book;
    }
}
