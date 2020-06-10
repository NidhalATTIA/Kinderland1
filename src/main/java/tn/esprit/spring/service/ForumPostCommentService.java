package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.ForumPostComment;

public interface ForumPostCommentService {
	public long AddForumPostComment(ForumPostComment forumpostcomment);

	public List<ForumPostComment> GetAllForumPostCommentJPQL();

	public ForumPostComment GetForumPostCommentById(Long ForumPostCommentId);

	public void UpdateForumPostComment(Long ForumPostCommentId, String forumpostcomment);
	
	public void UpdateForumPostCommentVote(Long ForumPostCommentId);

	public void DeleteForumPostComment(Long ForumPostCommentId);

}
