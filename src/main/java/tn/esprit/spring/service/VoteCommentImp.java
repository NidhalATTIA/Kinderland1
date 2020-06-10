package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Reclamation;
import tn.esprit.spring.entity.VoteComment;
import tn.esprit.spring.repository.VoteCommentPostRepository;

@Service
public class VoteCommentImp implements VoteCommentService {

	@Autowired
	VoteCommentPostRepository voteCommentPostRepository;

	public static final Logger l = LogManager.getLogger(ReclamationServiceImpl.class);

	@Override
	public long AddVoteCommentPost(VoteComment voteCommentPost) {
		voteCommentPostRepository.save(voteCommentPost);
		return voteCommentPost.getIdVoteComment();
	}

	@Override
	public void DeleteVoteCommentPost(Long voteCommentPost) {
		voteCommentPostRepository.deleteById(voteCommentPost);
	}

	@Override
	public VoteComment GetForumPostById(Long voteCommentPostId) {
		VoteComment vote = voteCommentPostRepository.findById(voteCommentPostId).orElse(null);
		l.info("retrive blog by id +++++;" + vote);
		return vote;
	}

	@Override
	public long getVotePerComment(Long voteCommentPostId) {
		return voteCommentPostRepository.getVotePerComment(voteCommentPostId);
	}

}
