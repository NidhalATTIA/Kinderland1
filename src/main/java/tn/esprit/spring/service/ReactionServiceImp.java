package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Reaction;
import tn.esprit.spring.repository.ReactionRepository;

@Service
public class ReactionServiceImp implements IReactionService {
	@Autowired
	ReactionRepository reactionRepository;

	public static final Logger l = LogManager.getLogger(InvitationServiceImpl.class);

	// Ajout
	@Override
	public Reaction AddReaction(Reaction reaction) {
		return reactionRepository.save(reaction);
	}

	// Affichage all
	
	@Override
	public List<Reaction> GetAllReactionJPQL() {
		return (List<Reaction>) reactionRepository.findAll();
	}
	

	// Affichage 1
	@Override
	public Reaction GetReactionById(Long InvitationId) {
		Reaction Invitation = reactionRepository.findById(InvitationId).orElse(null);
		l.info("retrive blog by id +++++;" + Invitation);
		return Invitation;
	}

	// Modification
	@Override
	public Reaction UpdateReaction(Reaction reaction) {
		return reactionRepository.save(reaction);
	}

	// Supression
	@Override
	public void DeleteReaction(Long invitationId) {
		reactionRepository.deleteById(invitationId);
	}
}
