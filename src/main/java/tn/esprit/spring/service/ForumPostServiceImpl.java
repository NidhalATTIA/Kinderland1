package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.ForumPost;
import tn.esprit.spring.repository.ForumPostRepository;

@Service
public class ForumPostServiceImpl implements ForumPostService {

	@Autowired
	ForumPostRepository forumpostrepository;

	public static final Logger l = LogManager.getLogger(ForumPostServiceImpl.class);

	// Ajout
	@Override
	public long AddForumPost(ForumPost forumpost) {
		forumpostrepository.save(forumpost);
		return forumpost.getIdPost();
	}

	// Affichage all
	@Override
	public List<ForumPost> GetAllForumPostJPQL() {
		return (List<ForumPost>) forumpostrepository.findAll();
	}

	// Affichage 1
	@Override
	public ForumPost GetForumPostById(Long ForumPostId) {
		ForumPost forumpost = forumpostrepository.findById(ForumPostId).orElse(null);
		l.info("retrive blog by id +++++;" + forumpost);
		return forumpost;
	}

	// Modification
	@Override
	public void UpdateForumPost(Long forumPostId, String textForumPost) {
		forumpostrepository.UpdateForumPost(textForumPost, forumPostId);
	}
	
	

	// Supression
	@Override
	public void DeleteForumPost(Long ForumPostId) {
		forumpostrepository.deleteById(ForumPostId);
	}

}
