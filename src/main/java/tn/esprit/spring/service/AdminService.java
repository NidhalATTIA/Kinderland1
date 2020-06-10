package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entity.Admin;
import tn.esprit.spring.entity.ForumPost;
import tn.esprit.spring.repository.AdminRepository;

public class AdminService implements IAdminService{
	@Autowired
	AdminRepository adminrepository;

	public static final Logger l = LogManager.getLogger(ForumPostServiceImpl.class);

	// Ajout
	@Override
	public Admin AddAdmin(Admin forumpost) {
		return adminrepository.save(forumpost);
	}

	// Affichage all
	@Override
	public List<Admin> GetAllAdminJPQL() {
		return (List<Admin>) adminrepository.findAll();
	}

	// Affichage 1
	@Override
	public Admin GetAdminById(Long ForumPostId) {
		Admin forumpost = adminrepository.findById(ForumPostId).orElse(null);
		l.info("retrive blog by id +++++;" + forumpost);
		return forumpost;
	}

	// Modification
	@Override
	public Admin UpdateAdmin(Admin forumpost) {
		return adminrepository.save(forumpost);
	}

	// Supression
	@Override
	public void DeleteAdmin(Long ForumPostId) {
		adminrepository.deleteById(ForumPostId);
	}

}
