package tn.esprit.spring.service;

import java.util.List;



import tn.esprit.spring.entity.Consultation;
import tn.esprit.spring.entity.Maladie;

public interface IConsultationService {
	public Consultation AddConsultation(Consultation consultation);

	public List<Consultation> GetAllConsultationJPQL();

	public Consultation GetConsultationById(Long consultationId);

	public Consultation UpdateConsultation(Consultation consultation);

	public void DeleteConsultation(Long consultationId);
	public  List<Maladie> getmaladies();
	public  List<Long>getNumbersmaladies();

}
