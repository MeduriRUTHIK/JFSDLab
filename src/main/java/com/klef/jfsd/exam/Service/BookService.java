package com.klef.jfsd.exam.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.MBeanServerNotFoundException;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.Entity.Book;
import com.klef.jfsd.exam.Repository.BookRepository;

@Service
public class BookService {
	  @Autowired
	    private BookRepository bookRepository;

	    public Book updateBook(Long id, Book updatedBook) {
	        Book existingBook = bookRepository.findById(id).orElseThrow(() -> new MBeanServerNotFoundException("Book not found"));
	        existingBook.setTitle(updatedBook.getTitle());
	        existingBook.setAuthor(updatedBook.getAuthor());
	        existingBook.setGenre(updatedBook.getGenre());
	        existingBook.setPrice(updatedBook.getPrice());
	        existingBook.setPublishedYear(updatedBook.getPublishedYear());
	        return bookRepository.save(existingBook);
	    }

}
