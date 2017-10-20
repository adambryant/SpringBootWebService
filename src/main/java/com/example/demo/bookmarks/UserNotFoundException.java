package com.example.demo.bookmarks;

class UserNotFoundException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String userId)
	{
		super("could not find user '" + userId + "'.");
	}
}