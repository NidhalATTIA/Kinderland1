package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Blog;

public interface BlogService {
	
	public long AddBlog(Blog blog);

	public List<Blog> GetAllBlogJPQL();

	public Blog GetBlogById(Long BlogId);

	public void UpdateBlog(Long BlogId, String textBlog);

	public void DeleteBlog(Long BlogId);

}
