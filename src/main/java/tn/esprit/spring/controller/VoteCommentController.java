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

import tn.esprit.spring.entity.Reclamation;
import tn.esprit.spring.entity.VoteComment;

import tn.esprit.spring.service.VoteCommentService;

@RestController
public class VoteCommentController {

	@Autowired
	VoteCommentService voteCommentPostService;
	VoteComment vpc = new VoteComment();

	@PostMapping("/add-vote")
	@ResponseBody
	public VoteComment saveVote(@RequestBody VoteComment voteComment) {
		voteCommentPostService.AddVoteCommentPost(voteComment);
		return voteComment;
	}

	@DeleteMapping("/rmv-vote/{VoteId}")
	@ResponseBody
	public void rmvVote(@PathVariable("VoteId") Long voteCommentPostId) {
		voteCommentPostService.DeleteVoteCommentPost((long) voteCommentPostId);
	}

	@PutMapping(value = "/find-post/{voteCommentPostId}")
	@ResponseBody
	public VoteComment findForumPost(@PathVariable("voteCommentPostId") Long voteCommentPostId) {
		return voteCommentPostService.GetForumPostById((long) voteCommentPostId);
	}
	
	@GetMapping(value = "getVotebyComment/{PostCommentId}")
    @ResponseBody
	public long getVotebyComment(@PathVariable("PostCommentId")Long PostCommentId) {		
		return voteCommentPostService.getVotePerComment(PostCommentId);
	}

}
