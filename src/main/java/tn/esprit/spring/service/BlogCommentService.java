package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.BlogComment;

public interface BlogCommentService {
	
	public long AddBlogComment(BlogComment blogcomment);

	public List<BlogComment> GetAllBlogCommentJPQL();

	public BlogComment GetBlogCommentById(Long blogCommentId);

	public void UpdateBlogComment(Long blogCommentId, String textBlogComment);

	public void DeleteBlogComment(Long blogCommentId);

}
