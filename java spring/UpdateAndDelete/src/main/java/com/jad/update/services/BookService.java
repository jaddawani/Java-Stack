package com.jad.update.services;
import java.util.*;

//...
import org.springframework.stereotype.Service;


import com.jad.update.models.Book;
import com.jad.update.repository.BookRepository;
@Service
public class BookService {

private final BookRepository bookRepository;
 
 public BookService(BookRepository bookRepository) {
     this.bookRepository = bookRepository;
 }
 // returns all the books
 public List<Book> allBooks() {
     return bookRepository.findAll();
 }
 
 
 
 
 // creates a book
 public Book createBook(Book b) {
     return bookRepository.save(b);
 }
 

 
 // retrieves a book
 public Book findBook(Long id) {
     Optional<Book> optionalBook = bookRepository.findById(id);
     if(optionalBook.isPresent()) {
         return optionalBook.get();
     } else {
         return null;
     }
 }
public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
	Book book = bookRepository.findById(id).orElse(null);
	book.setTitle(title);
	book.setDescription(desc);
	book.setLanguage(lang);
	book.setNumberOfPages(numOfPages);
	return bookRepository.save(book);
}
public void deleteBook(Long id) {
	bookRepository.deleteById(id);
	
}

 
}
