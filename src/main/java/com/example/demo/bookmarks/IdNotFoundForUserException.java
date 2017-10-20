package com.example.demo.bookmarks;

class IdNotFoundForUserException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public IdNotFoundForUserException(String userId, Long bookmarkId)
	{
		super("id " + bookmarkId + " could not be found for user '" + userId + "'.");
	}
}