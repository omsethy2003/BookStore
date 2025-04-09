package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.entity.Borrow;
import com.library.service.BorrowService;

@RestController
@RequestMapping("/borrow")
public class BorrowController {
	@Autowired
	private BorrowService borService;
	
	@PostMapping("/borrowBook")
	public Borrow borrowBook(@RequestParam int userId, @RequestParam int bid)
	{
		return borService.borrowBooks(userId, bid);
	}
	
	@PutMapping("/returnBook")
	public Borrow borrowBook(@RequestParam int bId)
	{
		return borService.returnBooks(bId);
	}

}
