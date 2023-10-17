package com.glca.crud.zglcalibmgmt;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;
	
	
	public List <Book> getAllBooks()
	{
		return bookRepository.findAll();
	}
	
	public Book getBookById(int id)
	{
		Optional <Book> result =  bookRepository.findById(id);
		return result.get();
	}
	public void saveBook(Book book)
	{
		bookRepository.save(book);
	}
	public void deleteById(int id)
	{
		/*Optional <Book> result =  bookRepository.findById(id);
		Book book = result.get();
		bookRepository.delete(book);*/
		bookRepository.deleteById(id);
	}
}
