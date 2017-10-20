package com.example.demo.bookmarks;

import org.springframework.hateoas.VndErrors;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BookmarkControllerAdvice
{
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(UserNotFoundException.class)
	@ResponseBody
	public VndErrors handleUserNotFound(UserNotFoundException e)
	{
		String logref = e.getMessage();
		
		return new VndErrors(logref, e.getMessage());
	}

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(IdNotFoundForUserException.class)
	@ResponseBody
	public VndErrors handleIdNotFoundForUser(IdNotFoundForUserException e)
	{
		String logref = e.getMessage();
		
		return new VndErrors(logref, e.getMessage());
	}
}
