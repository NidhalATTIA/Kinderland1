package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Child;
import tn.esprit.spring.entity.Invitation;
import tn.esprit.spring.entity.User;

public interface IInvitationService {
	public Invitation AddInvitation(Invitation invitation);

	public List<Invitation> GetAllInvitationJPQL();

	public Invitation GetInvitationById(Long InvitationId);

	public Invitation UpdateInvitation(Invitation Invitation);

	public void DeleteInvitation(Long InvitationId);
	public List<User> GetAllSuggestionsJPQL(long id);
}
