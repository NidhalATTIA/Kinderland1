package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Reclamation;



public interface ReclamationService {
	public long AddReclamation(Reclamation reclamation);
	
	public List<Reclamation> GetAllReclamationJPQL();
	
	public Reclamation GetReclamationById(Long ReclamationId);
	
	public void UpdateReclamation(String textReclamation, Long ReclamationId);
	
	public void DeleteReclamation(Long ReclamationId);
	
	public void TreatReclamation(Long ReclamationId);
	
	public List<Reclamation> getReclamationbyidUser(Long UserId);
	
	public List<Reclamation> TreatedReclamation();

	public List<Reclamation> NoTreatedReclamation();



	
	
}