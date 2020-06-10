package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Child;
import tn.esprit.spring.entity.Invitation;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.repository.InvitationRepository;

@Service
public class InvitationServiceImpl  implements IInvitationService {

	@Autowired
	InvitationRepository Invitationrepository;

	public static final Logger l = LogManager.getLogger(InvitationServiceImpl.class);

	// Ajout
	@Override
	public Invitation AddInvitation(Invitation invitation) {
		return Invitationrepository.save(invitation);
	}

	// Affichage all
	
	@Override
	public List<Invitation> GetAllInvitationJPQL() {
		return (List<Invitation>) Invitationrepository.findAll();
	}
	

	// Affichage 1
	@Override
	public Invitation GetInvitationById(Long InvitationId) {
		Invitation Invitation = Invitationrepository.findById(InvitationId).orElse(null);
		l.info("retrive blog by id +++++;" + Invitation);
		return Invitation;
	}

	// Modification
	@Override
	public Invitation UpdateInvitation(Invitation Invitation) {
		return Invitationrepository.save(Invitation);
	}

	// Supression
	@Override
	public void DeleteInvitation(Long InvitationId) {
		Invitationrepository.deleteById(InvitationId);
	}

	@Override
	public List<User> GetAllSuggestionsJPQL(long id) {
		
		return (List<User>) Invitationrepository.getsuggestions(id);
	}

	

}
