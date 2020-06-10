package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.ForumPost;

public interface ForumPostService {

	public long AddForumPost(ForumPost forumpost);

	public List<ForumPost> GetAllForumPostJPQL();

	public ForumPost GetForumPostById(Long forumPostId);

	public void UpdateForumPost(Long forumPostId, String textForumPost);

	public void DeleteForumPost(Long forumPostId);
}
