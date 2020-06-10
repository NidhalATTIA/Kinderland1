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

import tn.esprit.spring.entity.ForumPost;
import tn.esprit.spring.service.ForumPostService;

@RestController
public class ForumPostController {

	@Autowired
	ForumPostService forumPostService;
	ForumPost fp = new ForumPost();

	@GetMapping("/retrieve-all-posts")
	@ResponseBody
	public List<ForumPost> getForumPost() {
		List<ForumPost> list = forumPostService.GetAllForumPostJPQL();
		return list;
	}

	@PostMapping("/add-post")
	@ResponseBody
	public ForumPost saveForumPost(@RequestBody ForumPost forumPost) {
		forumPostService.AddForumPost(forumPost);
		return forumPost;
	}

	@PutMapping(value = "/Edit-post/{PostId}/{TextPost1}")
	@ResponseBody
	public void EditForumPost(@PathVariable("PostId") Long ForumPostId, @PathVariable("TextPost1") String TextPost1) {
		forumPostService.UpdateForumPost((long) ForumPostId, TextPost1);
	}

	@DeleteMapping("/rmv-post/{PostId}")
	@ResponseBody
	public void rmvForumPost(@PathVariable("PostId") Long ForumPostId) {
		forumPostService.DeleteForumPost((long) ForumPostId);
	}

	@PutMapping(value = "/find-post/{PostId}")
	@ResponseBody
	public ForumPost findForumPost(@PathVariable("PostId") Long ForumPostId) {
		return forumPostService.GetForumPostById((long) ForumPostId);
	}

}
