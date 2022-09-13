package com.capgemini.service;

import java.util.List;

import com.capgemini.dao.BookDao;
import com.capgemini.dao.BookDaoImplementation;
import com.capgemini.entities.Book;

public class BookServiceImplementation implements BookService
{
	private BookDao dao;
	public BookServiceImplementation() 
	{
		super();
		dao=new BookDaoImplementation();
	}
	@Override
	public Book getBookById(Integer id) 
	{
		return dao.getBookById(id);
	}
	@Override
	public List<Book> getBookByTitle(String title) 
	{
		return dao.getBookByTitle(title);
	}
	@Override
	public Long getBookCount() 
	{
		return dao.getBookCount();
	}
	@Override
	public List<Book> getBookByAuthor(String author) 
	{
		return dao.getBookByAuthor(author);
	}
	@Override
	public List<Book> getAllBooks()
	{
		return dao.getAllBooks();
	}
	@Override
	public List<Book> getBooksRange(Double low, Double high) 
	{
		return dao.getBooksRange(low, high);
	}
}
