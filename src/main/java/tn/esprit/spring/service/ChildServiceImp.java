package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Child;
import tn.esprit.spring.repository.ChildRepository;

@Service
public class ChildServiceImp implements IChildService{
	
	@Autowired
	ChildRepository childrepository;

	public static final Logger l = LogManager.getLogger(ForumPostServiceImpl.class);

	// Ajout
	@Override
	public Child AddChild(Child forumpost) {
		return childrepository.save(forumpost);
	}

	// Affichage all
	@Override
	public List<Child> GetAllChildJPQL() {
		return (List<Child>) childrepository.findAll();
	}

	// Affichage 1
	@Override
	public Child GetChildById(Long ForumPostId) {
		Child forumpost = childrepository.findById(ForumPostId).orElse(null);
		l.info("retrive blog by id +++++;" + forumpost);
		return forumpost;
	}

	// Modification
	@Override
	public Child UpdateChild(Child forumpost) {
		return childrepository.save(forumpost);
	}

	// Supression
	@Override
	public void DeleteChild(Long ForumPostId) {
		childrepository.deleteById(ForumPostId);
	}
}