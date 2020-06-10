package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Blog;
import tn.esprit.spring.entity.ForumPost;
import tn.esprit.spring.service.BlogService;



@RestController
public class BlogController {

	@Autowired
	BlogService blogService;
	Blog b = new Blog();

	@GetMapping("/retrieve-all-blogs")
	@ResponseBody
	public List<Blog> getBlog() {
		List<Blog> list = blogService.GetAllBlogJPQL();
		return list;

	}

	@PostMapping("/add-blog")
	@ResponseBody
	public Blog saveForumPost(@RequestBody Blog blog) {
		blogService.AddBlog(blog);
		return blog;
	}
	
	
	@PutMapping(value = "/Edit-blog/{BlogId/{TextBlog1}}")
	@ResponseBody
	public void EditForumPost(@PathVariable("BlogId")Long BlogIdId, @PathVariable("TextBlog1") String TextBlog1) {
		blogService.UpdateBlog((long) BlogIdId, TextBlog1);	
	}
	
	@DeleteMapping("/rmv-blog/{BlogId}")
	@ResponseBody
	public void rmvBlog(@PathVariable("BlogId")Long BlogIdId) {
		blogService.DeleteBlog((long) BlogIdId);
	}
	
	
	@PutMapping(value = "/find-blog/{BlogId}") 
	@ResponseBody
	public Blog findBlog(@PathVariable("BlogId")Long BlogIdId) {
		return blogService.GetBlogById((long) BlogIdId);
	}


}
