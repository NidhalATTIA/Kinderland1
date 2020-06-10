package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.entity.Reclamation;
import tn.esprit.spring.service.ReclamationService;

@Controller
public class IControllerReclamationImpl {
	@Autowired
	ReclamationService Reclamationservice;
	
	
	

	public int addEvent(Reclamation reclamation){
		Reclamationservice.AddReclamation(reclamation);
		return (int) reclamation.getIdReclamation();
	}
	
	public void UpdateReclamation(String textReclamation, Long ReclamationId) {
		Reclamationservice.UpdateReclamation(textReclamation, ReclamationId);
	}
	public List<Reclamation> getAllEvents(){
		return Reclamationservice.GetAllReclamationJPQL();
	}

	
	public void DeleteReclamation(Long ReclamationId) {
		Reclamationservice.DeleteReclamation(ReclamationId);
	}

	public void TreatReclamation(Long ReclamationId) {
		Reclamationservice.TreatReclamation(ReclamationId);
	}
	
	public List<Reclamation> GetAllReclamationJPQL() {
		return Reclamationservice.GetAllReclamationJPQL();
	}
	
	public Reclamation GetReclamationById(Long ReclamationId){
		return Reclamationservice.GetReclamationById(ReclamationId);

	}
	
	public List<Reclamation> getReclamationbyidUser(Long iduser) {
		return Reclamationservice.getReclamationbyidUser(iduser);
	}
	
	public List<Reclamation> TreatedReclamation() {
		return Reclamationservice.TreatedReclamation();
	}
	
	public List<Reclamation> NoTreatedReclamation() {
		return Reclamationservice.NoTreatedReclamation();
	}
	
 
}

