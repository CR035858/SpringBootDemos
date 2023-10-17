package com.glca.crud.zglcalibmgmt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;
	
	@RequestMapping("/list")
	public String getBooks(Model model)
	{
		List <Book> books = bookService.getAllBooks();
		model.addAttribute("books", books);
		return "bookslist";
		
	}
	@RequestMapping("/showFormForAdd")
	public String addBookForm(Model model)
	{
		Book book = new Book();
		model.addAttribute("book", book);
		return "bookform";
	}
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("bId") int bId,Model model)
	{
		Book book = bookService.getBookById(bId);
		model.addAttribute("book", book);
		return "bookform";
	}
	
	@RequestMapping("/delete")
	public String deleteBook(@RequestParam("bId") int bId)
	{
		bookService.deleteById(bId);
		return "redirect:/books/list";
	}
	
	@RequestMapping("/save")
	public String saveBook(@ModelAttribute("book") Book book)
	{
		bookService.saveBook(book);
		return "redirect:/books/list";
	}
}
