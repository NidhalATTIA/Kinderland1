package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Post;
import tn.esprit.spring.service.IFicheMedicalService;
import tn.esprit.spring.service.IPostService;

@RestController
public class PostController {
	@Autowired
	IPostService postService;
	
	@GetMapping("/retrieve-all-publications")
	@ResponseBody
	public List<Post> getPosts() {
		List<Post> list = postService.GetAllPostJPQL();
		return list;

	}

	
	@GetMapping("/rmv-publications")
	@ResponseBody
	public void rmvPost() {
		postService.DeletePost((long)2);
	}
	
	@GetMapping("/find-publications")
	@ResponseBody
	public Post findPost() {
		return  postService.GetPostById((long) 1);
	}
	@GetMapping("/add-publications")
	@ResponseBody
	public void addPost(Post con) {
		postService.AddPost(con);
	}
	@GetMapping("/Edit-publications")
	@ResponseBody
	public void EditPost(long id) {
	Post fiche = postService.GetPostById(id);
	postService.UpdatePost(fiche);
	}
}
