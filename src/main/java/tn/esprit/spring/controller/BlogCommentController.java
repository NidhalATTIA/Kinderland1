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

import tn.esprit.spring.entity.BlogComment;
import tn.esprit.spring.entity.ForumPost;
import tn.esprit.spring.service.BlogCommentService;




@RestController
public class BlogCommentController {

	@Autowired
	BlogCommentService blogCommentService;
	BlogComment bc = new BlogComment();
	

	@GetMapping("/retrieve-all-Bcomments")
	@ResponseBody
	public List<BlogComment> getBlogComment() {
		List<BlogComment> list = blogCommentService.GetAllBlogCommentJPQL();
		return list;
	}
	
	
	@PostMapping("/add-Bcomments")
	@ResponseBody
	public BlogComment saveBlogComment(@RequestBody BlogComment blogComment) {
		blogCommentService.AddBlogComment(blogComment);
		return blogComment;
	}

	
	@PutMapping(value = "/Edit-Bcomments/{BlogCommentId}/{TextBlogComment1}")
	@ResponseBody
	public void EditBlogComment(@PathVariable("BlogCommentId")Long BlogCommentId,@PathVariable("TextBlogComment1") String TextBlogComment1) {
		blogCommentService.UpdateBlogComment((long) BlogCommentId, TextBlogComment1);	
	}

	
	@DeleteMapping("/rmv-Bcomments/{PostId}")
	@ResponseBody
	public void rmvBlogPostComment(@PathVariable("BlogCommentId")Long BlogCommentId) {
		blogCommentService.DeleteBlogComment((long) BlogCommentId);
	}



}
