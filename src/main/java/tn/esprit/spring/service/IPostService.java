package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Post;

public interface IPostService {
	public Post AddPost(Post post);

	public List<Post> GetAllPostJPQL();

	public Post GetPostById(Long postid);

	public Post UpdatePost(Post post);

	public void DeletePost(Long postId);
}
