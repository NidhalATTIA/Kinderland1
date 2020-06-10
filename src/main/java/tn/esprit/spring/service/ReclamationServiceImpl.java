package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Reclamation;
import tn.esprit.spring.repository.ReclamationRepository;

@Service
public class ReclamationServiceImpl implements ReclamationService {

	@Autowired
	ReclamationRepository reclamationRepository;

	public static final Logger l = LogManager.getLogger(ReclamationServiceImpl.class);

	// Ajout
	@Override
	public long AddReclamation(Reclamation reclamation) {
		reclamationRepository.save(reclamation);
		return reclamation.getIdReclamation();
	}

	//Affichage all
	@Override
	public List<Reclamation> GetAllReclamationJPQL() {
		return (List<Reclamation>) reclamationRepository.findAll();
	}

	// Affichage 1
	@Override
	public Reclamation GetReclamationById(Long ReclamationId) {
		Reclamation Reclamation = reclamationRepository.findById(ReclamationId).orElse(null);
		l.info("retrive Reclamation by id +++++;" + Reclamation);
		return Reclamation;
	}

	// Modification

	@Override
	public void UpdateReclamation(String textReclamation, Long ReclamationId) {
		reclamationRepository.UpdateReclamation(textReclamation, ReclamationId);
;
	}

	// Supression
	@Override
	public void DeleteReclamation(Long ReclamationId) {
		reclamationRepository.deleteById(ReclamationId);
	}
	
	public void TreatReclamation(Long ReclamationId) {
		reclamationRepository.TreatReclamation(ReclamationId);
;
	}

	public  List<Reclamation> getReclamationbyidUser(Long iduser) {
		return (List<Reclamation>) reclamationRepository.getReclamationbyidUser(iduser);
		
	}

	public List<Reclamation> TreatedReclamation() {
		return (List<Reclamation>) reclamationRepository.TreatedReclamation();
	}
	
	public List<Reclamation> NoTreatedReclamation() {
		return (List<Reclamation>) reclamationRepository.NoTreatedReclamation();
	}
	
}