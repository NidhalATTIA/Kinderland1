package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Reaction;
import tn.esprit.spring.service.IPostService;
import tn.esprit.spring.service.IReactionService;


@RestController
public class ReactionController {
	@Autowired
	IReactionService reactionService;
	
	@GetMapping("/retrieve-all-reactions")
	@ResponseBody
	public List<Reaction> getReactions() {
		List<Reaction> list = reactionService.GetAllReactionJPQL();
		return list;

	}

	
	@GetMapping("/rmv-reaction")
	@ResponseBody
	public void rmvReaction() {
		reactionService.DeleteReaction((long)2);
	}
	
	@GetMapping("/find-reaction")
	@ResponseBody
	public Reaction findReaction() {
		return  reactionService.GetReactionById((long) 1);
	}
	@GetMapping("/add-reaction")
	@ResponseBody
	public void addReaction(Reaction con) {
		reactionService.AddReaction(con);
	}
	@GetMapping("/Edit-reaction")
	@ResponseBody
	public void EditReaction(long id) {
	Reaction fiche = reactionService.GetReactionById(id);
	reactionService.UpdateReaction(fiche);
	}
}
