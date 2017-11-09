/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookcatalog.resource;

import com.mycompany.bookcatalog.model.Book;
import com.mycompany.bookcatalog.service.BookService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author x14488478
 */

@Path("/books")
public class BookResource {
    
    BookService bookService = new BookService();
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Book> getBooksXML(){
        return bookService.getAllBooks();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooksJSON(){
        return bookService.getAllBooks();
    }
    
    @GET
    @Path("/{bookId}")
    @Produces(MediaType.APPLICATION_XML)
    public Book getBookXML(@PathParam("bookId") int id){
        return bookService.getBook(id);
    }
    
    @GET
    @Path("/{bookId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getBookJSON(@PathParam("bookId") int id){
        return bookService.getBook(id);
    }
    
    @POST
    @Path("/{bookId}")
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces(MediaType.APPLICATION_JSON)
    public Response createBook(final Book book) {
         Book createdBook = bookService.createBook(book);
         return Response.status(Response.Status.CREATED).entity(
                 "Book created: true \n\nLocation => localhost:49000/api/books/" 
                         + createdBook.getId()).build();
    }
    
    @DELETE
    @Path("/{bookId}")
    @Produces(MediaType.APPLICATION_XML)
    public Response deleteBookXML(@PathParam("bookId") int id){
        Book deletedbook = bookService.deleteBook(id);
        return Response.ok(200).entity(
                "Book deleted-status: success \n\nID: " + id 
                + ",\nauthor: " + deletedbook.getAuthor()
                + ",\npublisher: " + deletedbook.getPublisher() 
                + ",\ntitle: " + deletedbook.getTitle() + "."
        ).build();	
    }
}
