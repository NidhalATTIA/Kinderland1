package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.ForumPostComment;
import tn.esprit.spring.entity.VoteCommentPost;
import tn.esprit.spring.repository.VoteCommentPostRepository;

@Service
public class VoteCommentPostImp implements VoteCommentPostService {
	
	@Autowired
	VoteCommentPostRepository voteCommentPostRepository;

	public static final Logger l = LogManager.getLogger(ReclamationServiceImpl.class);

	@Override
	public VoteCommentPost AddVoteCommentPost(VoteCommentPost voteCommentPost) {
	//	voteCommentPostRepository.save(voteCommentPost);
		return null;
	}

	@Override
	public List<VoteCommentPost> GetAllVoteCommentPostJPQL() {
		//return (List<VoteCommentPost>) voteCommentPostRepository.findAll();
		return null;
	}

	@Override
	public VoteCommentPost GetVoteCommentPostById(Long voteCommentPost) {
		/*VoteCommentPost voteCommentPost = voteCommentPostRepository.findById(voteCommentPost).orElse(null);
		l.info("retrive blog by id +++++;" + voteCommentPost);
		return voteCommentPost;*/
		return null;
	}

	@Override
	public VoteCommentPost UpdateVoteCommentPost(VoteCommentPost voteCommentPost) {
	//	return voteCommentPostRepository.save(voteCommentPost);
		return null;
	}

	@Override
	public void DeleteVoteCommentPost(Long voteCommentPost) {
		voteCommentPostRepository.deleteById(voteCommentPost);
	}

}
