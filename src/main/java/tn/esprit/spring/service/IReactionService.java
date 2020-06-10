package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Reaction;

public interface IReactionService {
	public Reaction AddReaction(Reaction reaction);

	public List<Reaction> GetAllReactionJPQL();

	public Reaction GetReactionById(Long reactionId);

	public Reaction UpdateReaction(Reaction reaction);

	public void DeleteReaction(Long reactionId);
}
