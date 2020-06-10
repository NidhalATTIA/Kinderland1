package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.VoteCommentPost;


public interface VoteCommentPostService {
	public VoteCommentPost AddVoteCommentPost(VoteCommentPost voteCommentPost);

	public List<VoteCommentPost> GetAllVoteCommentPostJPQL();

	public VoteCommentPost GetVoteCommentPostById(Long voteCommentPost);

	public VoteCommentPost UpdateVoteCommentPost(VoteCommentPost voteCommentPost);

	public void DeleteVoteCommentPost(Long voteCommentPost);

}
