package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.RDVMedical;
import tn.esprit.spring.repository.ChildRepository;
import tn.esprit.spring.repository.RDVMedicalRepository;

@Service
public class RDVMedicalServiceImp implements IRDVMedicalService{
	@Autowired
	RDVMedicalRepository rdvMedicalRepository;

	public static final Logger l = LogManager.getLogger(ForumPostServiceImpl.class);

	// Ajout
	@Override
	public RDVMedical AddRDVMedical(RDVMedical forumpost) {
		return rdvMedicalRepository.save(forumpost);
	}

	// Affichage all
	@Override
	public List<RDVMedical> GetAllRDVMedicalJPQL() {
		return (List<RDVMedical>) rdvMedicalRepository.findAll();
	}

	// Affichage 1
	@Override
	public RDVMedical GetRDVMedicalById(Long ForumPostId) {
		RDVMedical forumpost = rdvMedicalRepository.findById(ForumPostId).orElse(null);
		l.info("retrive blog by id +++++;" + forumpost);
		return forumpost;
	}

	// Modification
	@Override
	public RDVMedical UpdateRDVMedical(RDVMedical forumpost) {
		return rdvMedicalRepository.save(forumpost);
	}

	// Supression
	@Override
	public void DeleteRDVMedical(Long ForumPostId) {
		rdvMedicalRepository.deleteById(ForumPostId);
	}
}
