package com.library.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.library.entity.Books;
import com.library.repo.BookRepository;
@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
	@Mock
	private BookRepository bookRepo;
	@InjectMocks
	private BookService bookService;
	
	@Test
	public void addBookTest()
	{
		System.out.println("This is a unit test");
		
		Books book=new Books();
		book.setBid(101);
		book.setBname("Java");
		book.setBauthor("Om");
		book.setBpulicationyear("2025");
		book.setBtype("Technology");
		Mockito.when(bookRepo.save(book)).thenReturn(book);
		Books theBook=bookService.addBook(book);
		Assertions.assertEquals(theBook.getBid(),book.getBid() );
		Assertions.assertEquals(theBook.getBname(),book.getBname() );
		Assertions.assertEquals(theBook.getBauthor(),book.getBauthor() );
		Assertions.assertTrue(theBook.getBid()==102);
		Assertions.assertTrue(theBook.getBname()=="Dsa");
	}
}
