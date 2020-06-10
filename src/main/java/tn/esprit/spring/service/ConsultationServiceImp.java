package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Consultation;
import tn.esprit.spring.entity.Maladie;
import tn.esprit.spring.repository.ConsultationRepository;

@Service
public class ConsultationServiceImp implements IConsultationService{
	@Autowired
	ConsultationRepository consultationRepository;

	public static final Logger l = LogManager.getLogger(InvitationServiceImpl.class);

	// Ajout
	@Override
	public Consultation AddConsultation(Consultation consultation) {
		return consultationRepository.save(consultation);
	}

	// Affichage all
	
	@Override
	public List<Consultation> GetAllConsultationJPQL() {
		return (List<Consultation>) consultationRepository.findAll();
	}
	

	// Affichage 1
	@Override
	public Consultation GetConsultationById(Long InvitationId) {
		Consultation Invitation = consultationRepository.findById(InvitationId).orElse(null);
		l.info("retrive blog by id +++++;" + Invitation);
		return Invitation;
	}

	// Modification
	@Override
	public Consultation UpdateConsultation(Consultation reaction) {
		return consultationRepository.save(reaction);
	}

	// Supression
	@Override
	public void DeleteConsultation(Long invitationId) {
		consultationRepository.deleteById(invitationId);
	}
	public  List<Maladie>getmaladies(){
		return (List<Maladie>) consultationRepository.getmaladies();
		
	}
	@Override
	public  List<Long>getNumbersmaladies(){
		return (List<Long>) consultationRepository.getnbmaladies();
		
	}
}
