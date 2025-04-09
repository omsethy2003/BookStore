package com.library.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entity.Books;
import com.library.entity.Borrow;
import com.library.entity.User;
import com.library.repo.BookRepository;
import com.library.repo.BorrowRepository;
import com.library.repo.UserRepository;

@Service
public class BorrowService {
	@Autowired
	private BorrowRepository borRepo;
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private BookRepository bookRepo;
	
	public Borrow borrowBooks(int userId, int bid)
	{
		User user=userRepo.findById(userId).orElseThrow(()->new RuntimeException("User Not Found"));
		
		Books book=bookRepo.findById(bid).orElseThrow(()->new RuntimeException("Books Not Found"));
		
		Borrow borrow=new Borrow();
		borrow.setBook(book);
		borrow.setUser(user);
		borrow.setBorrowDate(new Date());
		
		return borRepo.save(borrow);
	}
	
	public Borrow returnBooks(int borrowId)
	{
		Borrow borrow=borRepo.findById(borrowId).orElseThrow(()->new RuntimeException("No Record Found"));
		borrow.setReturnDate(new Date());
		return borRepo.save(borrow);
	}

}
