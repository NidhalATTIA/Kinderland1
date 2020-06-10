package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Friendship;
import tn.esprit.spring.repository.FriendshipRepository;

@Service
public class FriendshipServiceImpl  implements IFriendshipService {

	@Autowired
	FriendshipRepository Friendshiprepository;

	public static final Logger l = LogManager.getLogger(FriendshipServiceImpl.class);

	// Ajout
	@Override
	public Friendship AddFriendship(Friendship Friendship) {
		return Friendshiprepository.save(Friendship);
	}

	// Affichage all
	
	@Override
	public List<Friendship> GetAllFriendshipJPQL() {
		return (List<Friendship>) Friendshiprepository.findAll();
	}
	

	// Affichage 1
	@Override
	public Friendship GetFriendshipById(Long FriendshipId) {
		Friendship Friendship = Friendshiprepository.findById(FriendshipId).orElse(null);
		l.info("retrive blog by id +++++;" + Friendship);
		return Friendship;
	}

	// Modification
	@Override
	public Friendship UpdateFriendship(Friendship Friendship) {
		return Friendshiprepository.save(Friendship);
	}

	// Supression
	@Override
	public void DeleteFriendship(Long FriendshipId) {
		Friendshiprepository.deleteById(FriendshipId);
	}
}
