package tn.esprit.spring.service;


import tn.esprit.spring.entity.VoteComment;


public interface VoteCommentService {
	public long AddVoteCommentPost(VoteComment voteCommentPost);

	public void DeleteVoteCommentPost(Long voteCommentPostId);
	
	public VoteComment GetForumPostById(Long voteCommentPostId);
	
	public long getVotePerComment(Long voteCommentPostId);

}
